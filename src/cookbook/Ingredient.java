package cookbook;

import java.util.Scanner;

/*
 * @author Anna Phillips
 */

public class Ingredient {
    private String name;
    private String measurementType;
    
    /**
     * Default constructor for Ingredient
     * @param n name
     * @param mT measurement type
     */
    public Ingredient(String n, String mT){
        name = n;
        measurementType = mT;
    }
    
    /**
     * Additional constructor for Ingredient
     * An Ingredient object may be instantiated with just the name of the ingredient (in which case longStr is false) 
     * or with a long String that include the quantity and measurementType (in which case longStr is true)
     * @param i
     * @param longStr whether the ingredient is instantiated with a given measurement type or not
     */
    public Ingredient(String i, boolean longStr){
        // 
        if(longStr){
            try (Scanner scIngredient = new Scanner(i).useDelimiter(" ")) {
                scIngredient.nextInt();
                measurementType = scIngredient.next();
                name = scIngredient.next();
            }
        }
        else{
            name = i;
            measurementType = AppManager.ingredientManager.getIngredient(i).getMeasurementType();
        }
        
    }
     /**
      * Accessor method for name
      * @return 
      */
    public String getName(){
        return name;
    }
    
    /**
     * Accessor method for measurement type
     * @return 
     */
    public String getMeasurementType(){
        return measurementType;
    }
    
    /**
     * Combines all the fields into a single String
     * @return 
     */
    @Override
    public String toString(){
        return measurementType + " " + name;
    }
}
