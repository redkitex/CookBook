package cookbook;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Anna Phillips
 */

public class RecipeManager {
    private List<Recipe> recipes = new ArrayList<>();
    private int numRecipes = 0;
    
    /**
     * The list that is received from the database is used to create an array of recipe objects
     * All the data pertaining to the recipe is extracted and stored
     * @param recipes 
     */
    public RecipeManager(List recipes){
        String name, duration, steps, ingredients, quantities, type;
        int serves;
        
        for(int i = 0; i < recipes.size(); i++){
            List recipe = (List) recipes.get(i);
            
            name = recipe.get(0).toString();
            duration = recipe.get(1).toString();
            serves = Integer.parseInt(recipe.get(2).toString());
            steps = recipe.get(4).toString();
            ingredients = (String) recipe.get(6);
            quantities = (String) recipe.get(7);
            type = (String) recipe.get(8);
            
            // A new recipe is created and stored in the array
            this.recipes.add(new Recipe(name, duration, serves, 
                    steps, ingredients, 
                    quantities, type));
            numRecipes++;
        }
    }
    
    /**
     * Method to add a new recipe to the list
     * @param n name of the recipe
     * @param d duration of the recipe
     * @param se amount of people it serves
     * @param s steps to follow
     * @param i ingredients
     * @param q quantities of ingredients
     * @param t type of recipe
     */
    public void newRecipe(String n, String d, int se, String s, String i, String q, String t){
        // Creates a new recipe
        recipes.add(new Recipe(n, d, se, s, i, q, t));
    }
    
    /**
     * Method to edit the existing values of the recipe
     * @param name
     * @param d duration of the recipe
     * @param se amount of people it serves
     * @param s steps to follow
     * @param i ingredients
     * @param q quantities of ingredients
     * @param t type of recipe
     */
    public void editRecipe(String name, String d, int se, String s, String i, String q, String t){
        // Updates all the values of the recipe's fields when it is edited
        find(name).setDuration(d);
        find(name).setServes(se);
        find(name).setSteps(s);
        find(name).setIngredients(i, q);
        find(name).setType(t);
    }
    
    /**
     * The minimum duration of all the recipes
     * @return 
     */
    public String getMinDuration(){
        // Returns the shortest duration of all the recipes
        String min = "99:50:00";
        
        for(int i = 0; i < recipes.size(); i++){
            if(recipes.get(i).getDuration().compareTo(min) < 0)
                min = recipes.get(i).getDuration();
        }
        return min;
    }
    
    /**
     * The maximum duration of all the recipes
     * @return 
     */
    public String getMaxDuration(){
        // Returns the longest duration of all the recipes
        String max = "00:00:00";
        
        for(int i = 0; i < recipes.size(); i++){
            if(recipes.get(i).getDuration().compareTo(max) > 0)
                max = recipes.get(i).getDuration();
        }
        return max;
    }
    
    /**
     * The recipe with name n
     * @param n the name of the recipe
     * @return 
     */
    public Recipe find(String n){
        // Finds the Recipe object by name
        Recipe recipe = null;
        
        for(int i = 0; i < numRecipes; i++){
            if(recipes.get(i).getName().equals(n))
                recipe = recipes.get(i);
        }
        return recipe;
    }
}
