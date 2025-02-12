package cookbook;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Anna Phillips
 */

public class IngredientManager {
    private List<Ingredient> ingredients = new ArrayList<>();
    
    /**
     * Default Constructor for the IngredientManager
     * Takes a list of ingredients and uses it to instantiate a list of Ingredient objects
     * @param ingredientsList 
     */
    public IngredientManager(List ingredientsList){
        for(int i = 0; i < ingredientsList.size(); i++){
            List ingredient = (List) ingredientsList.get(i);
            
            ingredients.add(new Ingredient(ingredient.get(0).toString(), 
                    ingredient.get(1).toString()));
        }
        sort(ingredients);
    }
    
    /**
     * Adds an ingredients to the list
     * @param i 
     */
    public void addIngredient(Ingredient i){
        ingredients.add(i);
        sort(ingredients);
    }
    
    /**
     * Sorts the list alphabetically
     * @param list 
     */
    public void sort(List<Ingredient> list){
        list.sort((o1, o2)-> o1.getName().compareTo(o2.getName()));
    }
    
    /**
     * Accessor method for the ingredients
     * @return 
     */
    public List<Ingredient> getIngredients(){
        return ingredients;
    }
    
    /**
     * Finds and returns the Ingredient at index i 
     * @param i
     * @return 
     */
    public Ingredient getIngredient(int i){
        return ingredients.get(i);
    }
    
    /**
     * Finds and returns the Ingredient object with a name of n
     * @param n
     * @return 
     */
    public Ingredient getIngredient(String n){
        for(int i = 0; i < ingredients.size(); i++){
            if(ingredients.get(i).getName().equalsIgnoreCase(n))
                return ingredients.get(i);
        }
        return null;
    }
    
    /**
     * Creates and returns an array of the names of all ingredients in the database
     * @return 
     */
    public String[] getIngredientNames(){
        String[] output = new String[ingredients.size()];
        for(int i = 0; i < ingredients.size(); i++){
            output[i] = ingredients.get(i).getName();
        }
        return output;
    }
    
    /**
     * Creates and returns an array of all the unique measurement types in the database
     * @return 
     */
    public String[] getMeasurementTypes(){
        int x = 0;
        String[] output, temp = new String[ingredients.size()];
        
        List<String> outputList = new ArrayList<>();
        
        for(int i = 0; i < ingredients.size(); i++){
            if(!outputList.contains(ingredients.get(i).getMeasurementType())){
                temp[x] = ingredients.get(i).getMeasurementType();
                outputList.add(ingredients.get(i).getMeasurementType());
                x++;
            }
        }
        // blanks at the end of the array are removed
        output = new String[x];
        for(int i = 0; i < x; i++){
            output[i] = temp[i];
        }
        return output;
    }
    
    /**
     * Combines all the fields into a single String
     * @return 
     */
    @Override
    public String toString(){
        String output = "" + ingredients.size()+"\n";
        
        for(int i = 0; i < ingredients.size(); i++){
            output += ingredients.get(i).toString() + "\n";
        }
        return output;
    }
}
