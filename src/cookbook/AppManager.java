package cookbook;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/* 
 * @author Anna Phillips
 */

public class AppManager {
    // The class that contains the major tools are functional methods of the Application
    // This class manages the app and performs all the major functionality
    
    public static DatabaseManager databaseManager;
    public static IngredientManager ingredientManager;
    public static RecipeManager recipeManager;
    public static HelpManager helpManager;
    
    public static List<String> activeIngredients = new ArrayList<>();

    
    /**
    * Method to connect to the database tables
    * Instantiates RecipeManager and IngredientManager
    */
    public static void connectToTables(){
        // The DatabaseManager constructor gets the table and the name of the database
        // This allows queries and functions to be performed later
        databaseManager = new DatabaseManager("CookBookDB");
        
        // Connects to the database, retrieves all the data and displays it in the table
        // This connects without applying any filters to the database
        databaseManager.connectNoFilters();
        
        // The Ingredients table is read from the database
        // The table is used to instantiate an IngredientManager object
        databaseManager.readAllTables(true);
        ingredientManager = DatabaseManager.getIngredientManager();
        
        // This block of code is placed in a thread to allow the rest of the program
        // to continue running while this block finishes running
        // This speeds up the program dramatically as the slowest parts are 
        // reading/writing to the databases
        final Thread recipes = new Thread(() -> {
            // The Recipes table is read from the database
            // It is used to instantiate a RecipeManager object
            databaseManager.readAllTables(false);
            recipeManager = DatabaseManager.getRecipeManager();
        });
        recipes.start();
    }
    
    /**
    * Method to filter the table
    * @param cmbSortBy the JComboBox that stores the field to sort the database by
    * @param spnFromHr the minimum duration's hour that must be filtered by
    * @param spnFromMin the minimum duration's minute that must be filtered by
    * @param spnToHr the maximum duration's hour that must be filtered by
    * @param spnToMin the maximum duration's minute that must be filtered by
    * @param pnlIngredients the JPanel where the ingredient JCheckBoxes are displayed
    */
    public static void filter(JComboBox cmbSortBy, JSpinner spnFromHr, JSpinner spnFromMin, JSpinner spnToHr, JSpinner spnToMin, JPanel pnlIngredients){
        // The values of all the components used in the filtering are fetched
        int sortby = cmbSortBy.getSelectedIndex();
        String sort = "ORDER BY ";
        String from, to, fromHr, fromMin, toHr, toMin, ingredients = "";
        
        switch(sortby){
            case 0 -> sort += "RecipeName";
            case 1 -> sort += "Type";
            case 2 -> sort += "Duration";
        }
        
        fromHr = "" + spnFromHr.getValue();
        fromMin = "" + spnFromMin.getValue();
        toHr = "" + spnToHr.getValue();
        toMin = "" + spnToMin.getValue();
        
        from = AppManager.concatenateDuration(fromHr, fromMin);
        to = AppManager.concatenateDuration(toHr, toMin);
        
        for(int i = 0; i<pnlIngredients.getComponentCount(); i++){
            if(pnlIngredients.getComponent(i) instanceof JCheckBox){
                JCheckBox checkbox = (JCheckBox) pnlIngredients.getComponent(i);
                if(checkbox.isSelected()){
                    ingredients += "Ingredients LIKE \"*"+checkbox.getText()+"*\" AND ";
                }
            }
        }
        // These values are used to create an SQL query which runs on the databases
        // This filters the table and displays the result on the Frame
        databaseManager.applyFilters(sort, from, to, ingredients);
        
        // If there are already records displayed in the table then the table is refreshed
        if(databaseManager.getTable() != null)
            databaseManager.displayDataInTable();
    }
    
    /**
    * Method to concatenate the duration into a single String
    * @param hour the hour value of the duration
    * @param min the minute value of the duration
    * @return the duration as a single String
    */
    public static String concatenateDuration(String hour, String min){
        // Concatenates the separate hour and minute values into a single duration String
        if(hour.length() == 1)
            hour = "0" + hour;
        if(min.length() == 1)
            min = "0" + min;
        
        return hour + ":" + min + ":00";
    }
    
    /**
    * Method to set the value of the components when a recipe has been selected to edit
    * @param name the name of the recipe being edited
    * @param txfName the JTextField where the name is displayed
    * @param cmbType JComboBox where the type of recipe is selected
    * @param spnServes JSpinner of the amount of people served
    * @param txaSteps the JTextArea where the steps are displayed
    * @param spnHour JSpinner of the duration's hour value
    * @param spnMin JSpinner of the duration's minute value
    * @param pnlIngredients the JPanel where the ingredient JCheckBoxes are displayed
    */
    public static void setComponentValues(String name, JTextField txfName, JComboBox cmbType, 
            JSpinner spnServes, JTextArea txaSteps, JSpinner spnHour, JSpinner spnMin, JPanel pnlIngredients){
        Recipe recipe = recipeManager.find(name);
        
        // Fetches the values of the recipes different fields and uses them to assign values to the components
        txfName.setText(recipe.getName());
        cmbType.setSelectedItem(recipe.getType());
        spnServes.setValue(recipe.getServes());
        txaSteps.setText(recipe.getStepsString());
        spnHour.setValue(recipe.getHourOfDuration());
        spnMin.setValue(recipe.getMinOfDuration());

        // Setting the fonts to ensure consistency
        txaSteps.setFont(new Font("Tahoma", Font.PLAIN, 14));

        // The ingredients are fetched and displayed dynamically
        pnlIngredients.setLayout(new BoxLayout(pnlIngredients, BoxLayout.Y_AXIS));
        for(int i = 0; i < recipe.getIngredientStrings().size(); i++){
            JLabel label = new JLabel(recipe.getIngredientStrings().get(i));
            label.setFont(new Font("Tahoma", Font.PLAIN, 14));
            pnlIngredients.add(label);
        }
    }
    
    /**
    * Method to fetch all the values of the recipe from the relevant components
    * These values are used to either create a new recipe or update an existing one based on what the user has selected
    * @param name the name of the recipe
    * @param txfName the JTextField where the name is displayed
    * @param cmbType JComboBox where the type of recipe is selected
    * @param spnServes JSpinner of the amount of people served
    * @param txaSteps the JTextArea where the steps are displayed
    * @param spnHour JSpinner of the duration's hour value
    * @param spnMin JSpinner of the duration's minute value
    * @param pnlIngredients the JPanel where the ingredient JCheckBoxes are displayed
    * @return Boolean whether the save has been successful or not, if any fields are empty the save is unsuccessful
    */
    public static boolean getComponentValues(String name, JTextField txfName, JComboBox cmbType, 
            JSpinner spnServes, JTextArea txaSteps, JSpinner spnHour, JSpinner spnMin, JPanel pnlIngredients){
        
        
        String n, d, s, i="", q="", t;
        int se;
        
        n = txfName.getText();
        String hour = "" + spnHour.getValue();
        String min = "" + spnMin.getValue();
        
        d = AppManager.concatenateDuration(hour, min);
        
        se = Integer.parseInt(spnServes.getValue().toString());
        
        s = txaSteps.getText().replace("\n", ", ");
        
        for(int x = 0; x < pnlIngredients.getComponentCount(); x++){
            JLabel label = (JLabel) pnlIngredients.getComponent(x);
            
            QuantityIngredient ingredient = new QuantityIngredient(label.getText());
            i += ingredient.getName() + ", ";
            q += ingredient.getQuantity() + ", ";
        }
        if(i.length() > 0)
            i = i.substring(0,i.length()-2);
        
        t = cmbType.getSelectedItem().toString();
        
        if(!n.equals("") 
                && se != 0 
                && !s.equals("") 
                && !d.equals("00:00:00")
                && pnlIngredients.getComponentCount() != 0){
            // If no name was provied, then the user has created a new recipe
            // The values received from the components are used to create a new recipe
            if(name.length() == 0){
                recipeManager.newRecipe(n, d, se, s, i, q, t);
                databaseManager.insertNewRecipe(new Recipe(n, d, se, s, i, q, t));
            }
            // if there was a name sent through then the user clicked on an existing recipe to edit
            // the recipe is then updated
            else{
                recipeManager.editRecipe(name, d, se, s, i, q, t);
                databaseManager.editRecipe(recipeManager.find(name));
            }
            return true;
        }
        else{
            String message = "Please fill all the details of your recipe";
            if(n.equals(""))
                message = "Please give your recipe a name";
            else if(se == 0)
                message = "Please enter the number of people served";
            else if(s.equals(""))
                message = "Please enter the steps of the recipe";
            else if(d.equals("00:00:00"))
                message = "Please enter the duration of the recipe";
            else if(pnlIngredients.getComponentCount() == 0)
                message = "Please enter the ingredients used in your recipe";
            
            JOptionPane.showMessageDialog(null, message);
            return false;
        }
    }
    
    /**
     * Method to display the values of the recipe on the components of the ViewRecipe screen
     * @param name the name of the recipe to be displayed
     * @param lblRecipeName
     * @param lblHours
     * @param lblMinutes
     * @param lblRecipeType
     * @param lblServes
     * @param pnlIngredients
     * @param pnlSteps 
     */
    public static void viewRecipe(String name, JLabel lblRecipeName,
            JLabel lblHours,JLabel lblMinutes,JLabel lblRecipeType,JLabel lblServes, 
            JPanel pnlIngredients, JPanel pnlSteps){
        
        Recipe recipe = recipeManager.find(name);
        
        lblRecipeName.setText("Name of Recipe: " + recipe.getName());
        lblHours.setText(recipe.getHourOfDuration()+" hr");
        lblMinutes.setText(recipe.getMinOfDuration() + " min");
        lblRecipeType.setText("Type of Recipe: " + recipe.getType());
        lblServes.setText("Serves: " + recipe.getServes());
        
        pnlIngredients.setLayout(new BoxLayout(pnlIngredients, BoxLayout.Y_AXIS));
        for(int i = 0; i < recipe.getIngredients().size(); i++){
            
            JLabel label = new JLabel(recipe.getIngredientStrings().get(i));
            label.setFont(new Font("Tahoma", Font.PLAIN, 14));
            pnlIngredients.add(label);
        }
        
        pnlSteps.setLayout(new BoxLayout(pnlSteps, BoxLayout.Y_AXIS));
        for(int i = 0; i < recipe.getSteps().size(); i++){
            
            JLabel label = new JLabel((i+1)+". "+recipe.getSteps().get(i));
            label.setFont(new Font("Tahoma", Font.PLAIN, 14));
            pnlSteps.add(label);
        }
    }
    
    /**
     * Method to display all the ingredients in JCheckBoxes that the user can use to sort the recipes
     * @param ingredientManager
     * @param tblDatabaseDisplay
     * @param pnlIngredients 
     */
    public static void displayIngredients(IngredientManager ingredientManager, JTable tblDatabaseDisplay, JPanel pnlIngredients){
        pnlIngredients.setLayout(new BoxLayout(pnlIngredients, BoxLayout.Y_AXIS));
        tblDatabaseDisplay.setRowHeight(22);

        // JCheckboxes are created dynamically using code
        for(int i = 0; i < ingredientManager.getIngredients().size(); i++){
            JCheckBox checkbox = new JCheckBox(ingredientManager.getIngredient(i).getName());
            checkbox.setFont(new Font("Tahoma", Font.PLAIN, 14));
            pnlIngredients.add(checkbox);
        }
    }
    
    /**
     * Method to display a new ingredient after the user has added one to the recipe
     * @param pnlIngredients
     * @param cmbIngredientName
     * @param cmbMeasurementType
     * @param spnQuantity 
     */
    public static void addNewIngredientToPanel(JPanel pnlIngredients, JComboBox cmbIngredientName, JComboBox cmbMeasurementType, JSpinner spnQuantity){
        String name = cmbIngredientName.getSelectedItem().toString();
        String measurementType = cmbMeasurementType.getSelectedItem().toString();
        int quantity = Integer.parseInt(spnQuantity.getValue().toString());

        pnlIngredients.setLayout(new BoxLayout(pnlIngredients, BoxLayout.Y_AXIS));

        JLabel label = new JLabel(quantity + " " + measurementType + " " + name);
        label.setFont(new Font("Tahoma", Font.PLAIN, 14));
        pnlIngredients.add(label);
    }
    
    /**
     * Method to get the available ingredients that the user can select
     * @param name the name of the recipe the user is editing
     * @return the array of available ingredients
     */
    public static String[] getAvailableIngredientNames(String name){
        String[] ingredients;
        String[] temp = new String[ingredientManager.getIngredientNames().length];
            
        try{
            if(!name.equals("")){
                // A list of the Ingredients that have not already been used are compiled
                // This is used to create a model for the ComboBox that the user uses to select ingredients
                // This ensures that the user cannot enter duplicate ingredients
                int x = 0;
                Recipe recipe = recipeManager.find(name);

                for(int i = 0; i < temp.length; i++){
                    // Ingredients are added to the list if they are not in the recipe already
                    if(!recipe.getIngredientNames().contains(ingredientManager.getIngredientNames()[i]) && !activeIngredients.contains(temp[i])){
                        temp[x] = ingredientManager.getIngredientNames()[i];
                        x++;
                    }
                }
                // The blanks at the end of the list are removed
                // This ensures that there are no blank options in the ComboBox
                ingredients = new String[x];
                for(int y = 0; y < x; y++){
                    ingredients[y] = temp[y];
                }
            }
            else{
                // If a new recipe is being created
                ingredients = new String[ingredientManager.getIngredientNames().length];
                for(int i = 0; i < ingredients.length; i++){
                    ingredients[i] = ingredientManager.getIngredientNames()[i];
                }
            }
        }
        catch(NullPointerException e){
            ingredients = ingredientManager.getIngredientNames();
        }
        return ingredients;
    }
    
    /**
     * Method to get the available ingredients that the user can select
     * Ensures that as the user edits a recipe the ComboBox updates in real time,
     * ensuring that no duplicate ingredients can be added
     * @param name recipe name that is being edited
     * @param ingredient
     * @return the array of available ingredients
     */
    public static String[] getAvailableIngredientNames(String name, String ingredient){
        String[] ingredients = getAvailableIngredientNames(name);
        String[] temp = new String[ingredients.length];
        String[] newIngredients;
        
        // Before the user saves the recipe a temporary list of the new ingredients 
        // that have been added is created to ensure no duplicates can be added
        activeIngredients.add(ingredient);
        
        int x = 0;
        
        for(int i = 0; i < ingredients.length; i++){
            if(ingredients[i] != null){
                if(!ingredients[i].equals(ingredient) && !activeIngredients.contains(ingredients[i])){
                    temp[x] = ingredients[i];
                    x++;
                }
            }
        }
        // The blanks at the end of the list are removed
        // This ensures that there are no blank options in the ComboBox
        newIngredients = new String[x];
        for(int y = 0; y < x; y++){
            newIngredients[y] = temp[y];
        }
        return newIngredients;
    }
    /**
     * Method to create the dialog box that is displayed when the user adds a new ingredient
     */
    public static void addIngredientDialog(JComboBox cmbIngredientName){
        String name, measurementType;
        
        // The same font object is used to ensure consistency
        Font font = new Font("Tahoma", Font.PLAIN, 14);
        
        // The components of the dialog box are created
        JTextField txfIngredientName = new JTextField();
        txfIngredientName.setFont(font);
        txfIngredientName.setSize(50, 20);
        
        JComboBox cmbMeasurementTypes = new JComboBox(ingredientManager.getMeasurementTypes());
        cmbMeasurementTypes.setFont(font);
        cmbMeasurementTypes.setSize(50, 20);
        
        JLabel lbl1 = new JLabel("Please enter ingredient name:");
        lbl1.setFont(font);
        
        JLabel lbl2 = new JLabel("Please choose measurement type:");
        lbl2.setFont(font);
        
        // Layout of the dialog box is defined
        JPanel pnl = new JPanel();
        pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
        pnl.setAlignmentX(JPanel.LEFT_ALIGNMENT);
        pnl.setBorder(new EmptyBorder(10, 10, 10, 10));
        pnl.add(lbl1);
        pnl.add(Box.createVerticalStrut(5));
        pnl.add(txfIngredientName);
        pnl.add(Box.createVerticalStrut(15));
        pnl.add(lbl2);
        pnl.add(Box.createVerticalStrut(5));
        pnl.add(cmbMeasurementTypes);

        // The dialog is displayed
        int dialog = JOptionPane.showConfirmDialog(null, pnl, "", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        // If the user clicks on the "OK" button then the ingredient is added to the ComboBox
        // This allows them to select the ingredient and add it to the recipe
        if(dialog == 0){
            name = txfIngredientName.getText();
            measurementType = cmbMeasurementTypes.getSelectedItem().toString();
            
            if(!name.equals("")){
                ingredientManager.addIngredient(new Ingredient(name, measurementType));
                databaseManager.insertNewIngredient(new Ingredient(name, measurementType));
                
                cmbIngredientName.setModel(new DefaultComboBoxModel(AppManager.getAvailableIngredientNames(name, cmbIngredientName.getSelectedItem().toString())));
            }
            else{
                JOptionPane.showMessageDialog(null, "Please enter a name for your ingredient");
                addIngredientDialog(cmbIngredientName);
            }
        }   
    }
}