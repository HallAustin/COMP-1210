/**
 * Class that inherits BakedItem for pie items.
 * 
 * @author Austin Hall
 * @version 4/26/17
 */
public class Pie extends BakedItem {
   
   //instance variables
   private double crustCost;
   
   /** CLASS VARIABLES. */
   public static final double BASE_RATE = 12.0;
   
   /**
    * Constructor for pie class.
    * @param nameIn used for name.
    * @param flavorIn used for flavor.
    * @param quantityIn used for quantity.
    * @param crustCostIn used for crust cost.
    * @param ingredientsIn used for ingredients.
    */
   public Pie(String nameIn, String flavorIn, int quantityIn,
                     double crustCostIn, String... ingredientsIn) {
   
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      crustCost = crustCostIn;                  
   }
   /**
    * Returns the crust cost.
    * @return crustCost.
    */
   public double getCrustCost() {
      
      return crustCost;
   }
   
   /**
    * Sets the crust cost.
    * @param crustCostIn used to set crust cost.
    */
   public void setCrustCost(double crustCostIn) {
      
      crustCost = crustCostIn;
   }                  
   
   /**
    * Calculates the price.
    * @return the price.
    */
   public double price() {
      
      return (BASE_RATE + crustCost) * quantity;
   }
   
   
}