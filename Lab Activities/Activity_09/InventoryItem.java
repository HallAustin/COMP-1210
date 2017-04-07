/**
 * Class used in the inventory driver program.
 *
 * @author Austin Hall
 * @version 4/3/17
 */
public class InventoryItem {
   
   protected double price;
   protected String name;
   private static double taxRate = 0;
   /**
    * Constructor for the class.
    * @param nameIn used for name.
    * @param priceIn used for price.
    */
   public InventoryItem(String nameIn, double priceIn) {
   
      name = nameIn;
      price = priceIn;
      
   }
   
   //Methods
   
   /**
    * Method that returns name.
    * @return name.
    */
   public String getName() {
      return name;
   }
   
   /**
    * Method that calculates the cost.
    * @return the price multiplied by tax rate.
    */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   
   /**
    * Method that setx the tax rate.
    * @param taxRateIn used to set rate.
    */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   /**
    * Method that creates string to return.
    * @return string to print.
    */
   public String toString() {
      return name + ": $" + calculateCost();
   }
}