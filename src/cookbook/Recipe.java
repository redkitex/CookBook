package cookbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * @author Anna Phillips
 */

public class Recipe {
    private String name, duration, type;
    private int serves;
    private List<String> steps = new ArrayList<>();
    private List<QuantityIngredient> ingredients = new ArrayList<>();
    
    /**
     * Constructor for the Recipe
     * @param n name of the recipe
     * @param d duration of the recipe
     * @param se amount of people it serves
     * @param s steps to follow
     * @param i ingredients
     * @param q quantities of ingredients
     * @param t type of recipe
     */
    public Recipe(String n, String d, int se, String s, String i, String q, String t){
        name = n;
        duration = d;
        serves = se;
        type = t;
        
        steps = new ArrayList<>();
        
        // Gets the steps from the String
        extractSteps(s);
        
        // get the ingredients and the quantities from the strings, instantiating the ingredients list
        extractIngredients(i, q);
    }
    
    /**
     * Extract the steps from the String
     * @param s 
     */
    private void extractSteps(String s){
        Scanner scSteps = new Scanner(s).useDelimiter(", ");
        int j =0;
        steps = new ArrayList<>();
        
        while(scSteps.hasNext()){
            steps.add(scSteps.next());
            j++;
        }
        scSteps.close();
    }
    
    /**
     * The ingredients and quantities are stored separately in the database,
     * This method joins the two different fields into single objects
     * @param i
     * @param q 
     */
    private void extractIngredients(String i, String q){
        int j = 0;
        ingredients = new ArrayList<>();
        
        Scanner scIngredients = new Scanner(i).useDelimiter(", ");
        Scanner scQuantities = new Scanner(q).useDelimiter(", ");
        
        while(scIngredients.hasNext()){
            String ingred = scIngredients.next();
            int quantity = scQuantities.nextInt();
            
            ingredients.add(new QuantityIngredient(ingred, quantity));
            j++;
        }
    }
    
    /**
     * Accessor method for the name
     * @return name
     */
    public String getName(){
        return name;
    }
    
    /**
     * Accessor method for the amount of people served
     * @return serves
     */
    public int getServes(){
        return serves;
    }
    
    /**
     * Accessor method for duration
     * @return duration
     */
    public String getDuration(){
        return duration;
    }
    
    /**
     * Extracts the hour value of the duration
     * @return hour value of the duration
     */
    public int getHourOfDuration(){
        return Integer.parseInt(duration.substring(0,2));
    }
    
    /**
     * Extracts the minute value of the duration
     * @return minute value of the duration
     */
    public int getMinOfDuration(){
        return Integer.parseInt(duration.substring(3,5));
    }
    
    /**
     * Accessor method for steps
     * @return steps
     */
    public List<String> getSteps(){
        return steps;
    }
    
    /**
     * All the fields of the ingredients are concatenated into a single String
     * This is used to display the ingredients on the frmNewRecipe screen
     * @return 
     */
    public List<String> getIngredientStrings(){
        List<String> output = new ArrayList<>();
        
        for(int i = 0; i < ingredients.size(); i++){
            output.add(ingredients.get(i).toString());
        }
        return output;
    }
    
    /**
     * Accessor method for the names of the ingredients used in the recipe
     * @return names of the ingredients used in the recipe
     */
    public List<String> getIngredientNames(){
        List<String> output = new ArrayList<>();
        
        for(int i = 0; i < ingredients.size(); i++){
            output.add(ingredients.get(i).getName());
        }
        return output;
    }
    
    /**
     * Accessor method for the ingredients
     * @return ingredients
     */
    public List<QuantityIngredient> getIngredients(){
        return ingredients;
    }
    
    /**
     * Combines the ingredients into a string used to store the ingredients when the recipes are exported to the database
     * @return 
     */
    public String exportedIngredients(){
        String output = "";
        
        for(int i = 0; i < ingredients.size(); i++){
            output += ingredients.get(i).getName() + ", ";
        }
        
        if(output.length() > 0)
            output = output.substring(0, output.length()-2);
        
        return output;
    }
    
    /**
     * Combines the quantities into a string used to store the quantities when the recipes are exported to the database
     * @return 
     */
    public String exportedQuantities(){
        String output = "";
        
        for(int i = 0; i < ingredients.size(); i++){
            output += ingredients.get(i).getQuantity() + ", ";
        }
        
        if(output.length() > 0)
            output = output.substring(0, output.length()-2);
        
        return output;
    }
    
    /**
     * The steps are concatenated into a string
     * This method is used to display the steps
     * @return 
     */
    public String getStepsString(){
        String output = "";
        
        for(int i = 0; i < steps.size(); i++){
            output += steps.get(i) + "\n";
        }
        if(output.length() > 0)
            output = output.substring(0, output.length()-1);
        
        return output;
    }
    
    /**
     * Accessor method for the type
     * @return type
     */
    public String getType(){
        return type;
    }
    
    /**
     * Mutator method for the name
     * @param n
     */
    public void setName(String n){
        name = n;
    }
    
    /**
     * Mutator method for the duration
     * @param d
     */
    public void setDuration(String d){
        duration = d;
    }
    
    /**
     * Mutator method for the serves
     * @param s
     */
    public void setServes(int s){
        serves = s;
    }
    
    /**
     * Mutator method for the type
     * @param t
     */
    public void setType(String t){
        type = t;
    }
    
    /**
     * Mutator method for the name
     * @param i ingredients
     * @param q quantities
     */
    public void setIngredients(String i, String q){
        extractIngredients(i, q);
    }
    
    /**
     * Mutator method for the steps
     * @param s
     */
    public void setSteps(String s){
        extractSteps(s);
    }
}
