package cookbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 * @author Anna Phillips
 */

public class DatabaseManager {
    
    private final String name;
    private JTable table;
    private TableModel tableModel;
    private Connection connection;
    private ResultSet resultSet;
    
    private String orderBy = "ORDER BY RecipeName";
    
    private final String SELECT_FROM = "SELECT RecipeName, Duration, Serves, Type, Ingredients FROM tblRecipes ";
    
    private static RecipeManager recipeManager;
    private static IngredientManager ingredientManager;
    
    /**
     * Constructor method for the DatabaseManager
     * @param n 
     */
    public DatabaseManager(String n){
        name = n;
    }
    
    /**
     * Mutator method for the table
     * @param tbl 
     */
    public void setTable(JTable tbl){
        table = tbl;
    }
    
    /**
     * Accessor method for the ingredientManager
     * @return 
     */
    public static IngredientManager getIngredientManager(){
        return ingredientManager;
    }
    
    /**
     * Accessor method for the recipeManager
     * @return 
     */
    public static RecipeManager getRecipeManager(){
        return recipeManager;
    }
    
    /**
     * Mutator method for orderBy
     * @param ob 
     */
    public void setOrderBy(String ob){
        orderBy = ob;
    }
    
    /**
     * Connects to the database without applying any filters
     */
    public void connectNoFilters(){
        connect(SELECT_FROM + orderBy);

        final Thread thread = new Thread(() -> {
            if(table != null){
                displayDataInTable();
            }
        });
        thread.start();
    }
    
    /**
     * Applies the filters to the database and runs a query on the data
     * The filtered database is then displayed in the table
     * @param ob
     * @param fromDuration
     * @param toDuration
     * @param ingredients 
     */
    public void applyFilters(String ob, String fromDuration, String toDuration, String ingredients){     
        // An SQL query is compiled below
        String where = "WHERE Duration >= \"" + fromDuration + "\" AND Duration <= \"" + toDuration + "\" ";
        
        if(ingredients.endsWith("AND "))
            ingredients = " AND " + ingredients.substring(0, ingredients.length()-4);
        where += ingredients;
        
        connect(SELECT_FROM + where + ob);
    }
    
    /**
     * Sets all the filters back to their default setting, where all the recipes are visible and in order of name
     * @param sortBy
     * @param fromHr
     * @param fromMin
     * @param toHr
     * @param toMin
     * @param ingredients 
     */
    public void resetFilters(JComboBox sortBy, JSpinner fromHr, JSpinner fromMin, JSpinner toHr, JSpinner toMin, JPanel ingredients){
        sortBy.setSelectedIndex(0);
        fromHr.setValue(Integer.parseInt(recipeManager.getMinDuration().substring(0, 2)));
        fromMin.setValue(Integer.parseInt(recipeManager.getMinDuration().substring(3, 5)));
        toHr.setValue(Integer.parseInt(recipeManager.getMaxDuration().substring(0, 2)));
        toMin.setValue(Integer.parseInt(recipeManager.getMaxDuration().substring(3, 5)));
        
        
        for(int i = 0; i<ingredients.getComponentCount(); i++){
            if(ingredients.getComponent(i) instanceof JCheckBox checkbox){
                checkbox.setSelected(false);
            }
        }
    }
    
    /**
     * Inserts a new recipe into the Recipes table
     * @param recipe 
     */
    public void insertNewRecipe(Recipe recipe){
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://" + name + ".accdb");
            
            var statement = connection.prepareStatement("INSERT INTO tblRecipes (RecipeName, Duration, Serves, NumSteps, Steps, NumIngredients, Ingredients, Quantities, Type) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            statement.setString(1, recipe.getName());
            statement.setString(2, recipe.getDuration());
            statement.setInt(3, recipe.getServes());
            statement.setInt(4, recipe.getSteps().size());
            statement.setString(5, recipe.getStepsString().replace("\n", ", "));
            statement.setInt(6, recipe.getIngredients().size());
            statement.setString(7, recipe.exportedIngredients());
            statement.setString(8, recipe.exportedQuantities());
            statement.setString(9, recipe.getType());
                    
            statement.executeUpdate();
        }
        
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Please ensure that you give your recipe a unique name.");
        }
    }
    
    /**
     * Updates a recipe in the Recipes table
     * @param recipe 
     */
    public void editRecipe(Recipe recipe){
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://" + name + ".accdb");
            
            // PreparedStatements are used to protect against SQL Injections
            var statement = connection.prepareStatement("UPDATE tblRecipes SET Duration=?, Serves=?, NumSteps=?, Steps=?, NumIngredients=?, Ingredients=?, Quantities=?, Type=? WHERE RecipeName = ?");
            
            statement.setString(1, recipe.getDuration());
            statement.setInt(2, recipe.getServes());
            statement.setInt(3, recipe.getSteps().size());
            statement.setString(4, recipe.getStepsString().replace("\n", ", "));
            statement.setInt(5, recipe.getIngredients().size());
            statement.setString(6, recipe.exportedIngredients());
            statement.setString(7, recipe.exportedQuantities());
            statement.setString(8, recipe.getType());
            statement.setString(9, recipe.getName());
                    
            statement.executeUpdate();
        }
        
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Please ensure that you give your recipe a unique name.");
        }
    }
    
    /**
     * Inserts a new Ingredient into the Ingredients table
     * @param ingredient 
     */
    public void insertNewIngredient(Ingredient ingredient){
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://" + name + ".accdb");
            
            // A Prepared statement reduces the risk of SQL Injections and errors
            var statement = connection.prepareStatement("INSERT INTO tblIngredients (IngredientName, Measurement) VALUES (?, ?)");
            statement.setString(1, ingredient.getName());
            statement.setString(2, ingredient.getMeasurementType());
            
            System.out.println(statement.toString());
            statement.executeUpdate();
        }
        catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    
    /**
     * Accessor method for the table
     * @return 
     */
    public JTable getTable(){
        return table;
    }
    
    /**
     * This method can read both the Ingredients and the Recipes tables in the database
     * If ingredients is true then the Ingredients table is read and the ingredientsManager object instantiated
     * If ingredients is false then the Recipe table is read and the recipeManager object instantiated
     * @param ingredients 
     */
    public void readAllTables(boolean ingredients){
        String query;
        Connection connection;
        ResultSet resultSet;
        
        // The queries are defined depending on which table is being read from
        if(ingredients)
            query = "SELECT IngredientName, Measurement FROM tblIngredients";
        else
            query = "SELECT RecipeName, Duration, Serves, NumSteps, Steps, NumIngredients, Ingredients, Quantities, Type FROM tblRecipes";
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
            // A connection with the database is established
            connection = DriverManager.getConnection("jdbc:ucanaccess://" + name + ".accdb");
            Statement st = connection.createStatement();
            // the corresponding query is executed and the output obtained
            resultSet = st.executeQuery(query);

            // Depending on which table was read, the corresponding Manager is instantiated
            if(ingredients)
                ingredientManager = new IngredientManager(DbUtils.resultSetToNestedList(resultSet));
            else
                recipeManager = new RecipeManager(DbUtils.resultSetToNestedList(resultSet));
        }
        catch(ClassNotFoundException cnfex) {
            System.out.println("Problem in loading or registering MS Access JDBC driver");
            cnfex.printStackTrace();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "There was an error: " + e);
        }
    }
    
    /**
     * Displays the data collected from the database in the table
     */
    public void displayDataInTable(){
        if(tableModel != null)
            table.setModel(tableModel);
    }
    
    /**
     * The central method to connect to the database and apply read-only queries
     * @param query the query to be run
     */
    private void connect(String query){
        try{
            if(query != null){
                try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                }
                catch(ClassNotFoundException cnfex) {
                    JOptionPane.showMessageDialog(null, "Problem in loading or registering MS Access JDBC driver");
                }
                // A connection is established with the database
                connection = DriverManager.getConnection("jdbc:ucanaccess://" + name + ".accdb");
                Statement st = connection.createStatement();
                // The query is run on the database and a resultSet is obtained
                resultSet = st.executeQuery(query);
                
                // The records from the database are displayed in the table
                tableModel = DbUtils.resultSetToTableModel(resultSet);
            }
            else{
                table.removeAll();
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}