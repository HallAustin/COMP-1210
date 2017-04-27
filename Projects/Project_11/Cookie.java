/**
 * Class for Cookie items in the bakery.
 *
 * @author Austin Hall
 * @version 4/26/17
 */
public class Cookie extends BakedItem {
   
   /** CLASS VARIABLES. */
   public static final double BASE_RATE = 0.35;
   
   /**
    * Constructor for the Cookie class.
    * @param nameIn used for name.
    * @param flavorIn used for flavor.
    * @param quantityIn used for quantity.
    * @param ingredientsIn used for ingredients.
    */
   public Cookie(String nameIn, String flavorIn, int quantityIn,
                  String... ingredientsIn) {
      
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
   }
   /**
    * Calculates the price.
    * @return the price.
    */
   public double price() {
      
      return BASE_RATE * (double) quantity;
   }
}