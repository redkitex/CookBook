package cookbook;

import java.util.Scanner;

/*
 * @author Anna Phillips
 */

public class QuantityIngredient extends Ingredient{
    // When an ingredient is a part of a recipe then it has a quantity assigned to it
    // These objects extend the Ingredient class, adding in a quantity field
    private int quantity;
    
    /**
     * The default constructor
     * @param n name
     * @param mT measurement type
     * @param q quantity
     */
    public QuantityIngredient(String n, String mT, int q){
        super(n, mT);
        quantity = q;
    }
    
    /**
     * The constructor used if a long string is parsed with all three fields concatenated
     * @param i 
     */
    public QuantityIngredient(String i){
        super(i, true);
        try (Scanner scIngredient = new Scanner(i).useDelimiter(" ")) {
            quantity = scIngredient.nextInt();
        }
    }
    
    /**
     * The constructor used if only the name of the ingredient and quantity is known
     * @param i
     * @param q 
     */
    public QuantityIngredient(String i, int q){
        super(i, false);
        quantity = q;
    }
    
    /**
     * Accessor method for quantity
     * @return 
     */
    public int getQuantity(){
        return quantity;
    }
    
    /**
     * Mutator method for quantity
     * @param q 
     */
    public void setQuantity(int q){
        quantity = q;
    }
    
    /**
     * Accessor method for the ingredient name
     * @return 
     */
    @Override
    public String getName() {
        return super.getName();
    }
    
    /**
     * Method to combine all the fields into a single String
     * @return 
     */
    @Override
    public String toString(){
        return quantity + " " + super.getMeasurementType() + " " + super.getName();
    }
}
