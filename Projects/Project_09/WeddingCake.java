/**
 * Class for Wedding Cake items in the bakery.
 * 
 * @author Austin Hall
 * @version 4/6/17
 */
public class WeddingCake extends Cake {
   
   //instance variables
   private int tiers;
   
   /** CLASS VARIABLES. */
   public static final double BASE_RATE = 15.0;
   
   /**
    * Constructor for the WeddingCake class.
    * @param nameIn used for name.
    * @param flavorIn used for flavor.
    * @param quantityIn used for quantity.
    * @param layersIn used for layers.
    * @param tiersIn used for tiers.
    * @param ingredientsIn used for ingredients.
    */
   public WeddingCake(String nameIn, String flavorIn,
         int quantityIn, int layersIn,
         int tiersIn, String ... ingredientsIn) {
      
      super(nameIn, flavorIn, quantityIn, layersIn, ingredientsIn);
      tiers = tiersIn;                  
   }
   
   /**
    * Returns the amount of tiers.
    * @return tiers.
    */
   public int getTiers() {
      
      return tiers;
   }
   
   /**
    * Sets the amount of tiers.
    * @param tiersIn used for tiers.
    */
   public void setTiers(int tiersIn) {
      
      tiers = tiersIn;
   }
   
   /**
    * Calculates the price.
    * @return the price.
    */
   public double price() {
      
      return (BASE_RATE * layers * tiers) * quantity;
   }
}