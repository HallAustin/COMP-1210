/**
 * Abstract class used for special cases.
 *
 * @author Austin Hall
 * @version 4/3/17
 */
public abstract class OnlineTextItem extends InventoryItem {
   
   /**
    * Constructor for the OnlineTextItem class.
    * @param nameIn used for name.
    * @param priceIn used for price.
    */
   public OnlineTextItem(String nameIn, double priceIn) {
      
      super(nameIn, priceIn);
   }   
   
   /**
    * Method overrides calculateCost in other classes.
    * @return price.
    */
   public double calculateCost() {
      return price;
   }
}