/**
 * Class for cake items in the bakery.
 *
 * @author Austin Hall
 * @version 4/26/17
 */
public class Cake extends BakedItem {
   
   //instance variables
   protected int layers;
   /** CLASS VARIABLES. */
   public static final double BASE_RATE = 8.0;
   
   /**
    * Constructor for the cake class.
    * @param nameIn used for name.
    * @param flavorIn used for flavor.
    * @param quantityIn used for quantity.
    * @param layersIn used for layers.
    * @param ingredientsIn used for ingredients.
    */
   public Cake(String nameIn, String flavorIn, int quantityIn,
                     int layersIn, String... ingredientsIn) {
      
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      layers = layersIn;                     
   }
   
   /**
    * Returns the amount of layers.
    * @return layers.
    */
   public int getLayers() {
      
      return layers;
   }
   
   /**
    * Sets the amount of layers.
    * @param layersIn used for layers.
    */
   public void setLayers(int layersIn) {
      
      layers = layersIn;
   }
   /**
    * Returns the price.
    * @return the price.
    */
   public double price() {
      
      return (BASE_RATE * layers) * quantity;
   }
}