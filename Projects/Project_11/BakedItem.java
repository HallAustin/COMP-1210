import java.text.DecimalFormat;
/**
 * Class for baked items in bakery.
 * 
 * @author Austin Hall
 * @version 4/6/17
 */
public abstract class BakedItem implements Comparable<BakedItem> {

   //instance variables
   protected String name = "";
   protected String flavor = "";
   protected int quantity = 0;
   protected String[] ingredients;
   protected static int count = 0;
   
   /**
    * Constructor for BakedItem class.
    * @param nameIn used for name.
    * @param flavorIn used for flavor.
    * @param quantityIn used for quantiy.
    * @param ingredientsIn used for ingredients.
    */
   public BakedItem(String nameIn, String flavorIn, int quantityIn,
                     String... ingredientsIn) {
    
      name = nameIn;
      flavor = flavorIn;
      quantity = quantityIn;
      ingredients = ingredientsIn;
      count++;                       
   }
   
   //methods
   /**
    * Returns the name.
    * @return name.
    */
   public String getName() {
      
      return name;
   }
   
   /**
    * Sets the name.
    * @param nameIn used to set name.
    */
   public void setName(String nameIn) {
      
      name = nameIn;
   }
   
   /**
    * Returns the flavor.
    * @return flavor.
    */
   public String getFlavor() {
   
      return flavor;
   }
   /** 
    * Sets the flavor.
    * @param flavorIn used for flavor.
    */
   public void setFlavor(String flavorIn) {
      
      flavor = flavorIn;
   }
   
   /**
    * Returns the quantity.
    * @return quantity.
    */
   public int getQuantity() {
      
      return quantity;
   }
   
   /**
    * Sets the quantity.
    * @param quantityIn used for quantity.
    */
   public void setQuantity(int quantityIn) {
      
      quantity = quantityIn;
   }
   /**
    * Returns the ingredients.
    * @return ingredients.
    */
   public String[] getIngredients() {
      
      return ingredients;
   }
   
   /**
    * Sets the ingredients.
    * @param ingredientsIn used for ingredients.
    */
   public void setIngredients(String... ingredientsIn) {
      
      ingredients = ingredientsIn;
   }
   
   /**
    * Returns the count.
    * @return count.
    */
   public static int getCount() {
      
      return count;
   }
   
   /**
    * Resets the count.
    */
   public static void resetCount() {
      
      count = 0;
   }
   
   /**
    * Creates a string to print in driver.
    * @return result.
    */
   public final String toString() {
      
      String ingredientsString = "";
      int j = 0;
      for (int i = 0; i < ingredients.length; i++) {
         
         if (j == ingredients.length) {
            
            ingredientsString += ingredients[i];
         }
         else if (j < 5 && (i != ingredients.length - 1)) {
            
            ingredientsString += ingredients[i] + ", ";
            j++;
         }
         else if (j == 5 && (i != ingredients.length - 1)) {
            
            ingredientsString += "\n" + ingredients[i] + ", ";
            j = 0;
         }
         else if (j == 5 && (i == ingredients.length - 1)) {
            
            ingredientsString += "\n" + ingredients[i];
            j++;
         }
         else {
            ingredientsString += ingredients[i];
            j++;
         }
      }
      
      DecimalFormat dF = new DecimalFormat("$#,##0.00");
      
      String result = this.getClass().toString().substring(6) + ": "
                     + name + " - " + flavor + "\tQuantity: " + quantity
                     + "\tPrice: " + dF.format(price()) + "\n(Ingredients: "
                     + ingredientsString + ")";
      
      return result;
      
   }
   /**
    * Abstract method overridden in derived classes.
    * @return a double.
    */
   public abstract double price();
   
   
   //--------------------------------------------//
   //---------------PROJECT 10-------------------//
   //--------------------------------------------//
   
   /**
    * @param object compares to other object.
    * @return an int based on how they compare.
    */
   public int compareTo(BakedItem object) {
      
      return this.toString().toLowerCase().compareTo(object.toString()
         .toLowerCase());
   }
}