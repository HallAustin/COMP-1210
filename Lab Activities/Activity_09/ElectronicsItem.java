/**
 * Class for electronics items.
 *
 * @author Austin Hall
 * @version 4/3/17
 */
public class ElectronicsItem extends InventoryItem {
   
   /** @var SHIPPING_COST. */
   public static final double SHIPPING_COST = 1.5;
   protected double weight;
   /**
    * Constructor for the class.
    * @param nameIn used for name.
    * @param priceIn used for price.
    * @param weightIn used for weight.
    */
   public ElectronicsItem(String nameIn, double priceIn,
                     double weightIn) {
      
      super(nameIn, priceIn);
      weight = weightIn;
                     
   }
   /**
    * This method calculates the cost.
    * @return the cost plus the shipping cost times weight.
    */
   public double calculateCost() {
   
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}