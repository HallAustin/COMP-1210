import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for Cake.
 */
public class CakeTest {
   /**
    * Tests the getLayers method.
    */
   @Test public void getLayersTest() {
   
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1,
               "flour", "sugar", "cocoa powder", "vanilla", "eggs",
               "butter", "baking soda", "baking powder", "salt");
      Assert.assertEquals("", 1, c1.getLayers());
   }
   
   /**
    * Tests the setLayers method.
    */
   @Test public void setLayersTest() {
      
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1,
               "flour", "sugar", "cocoa powder", "vanilla", "eggs",
               "butter", "baking soda", "baking powder", "salt");
         
      c1.setLayers(2);
      Assert.assertEquals("", 2, c1.getLayers());
   }
   
   /**
    * Tests the price method.
    */
   @Test public void priceTest() {
      
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1,
               "flour", "sugar", "cocoa powder", "vanilla", "eggs",
               "butter", "baking soda", "baking powder", "salt");
         
      Assert.assertEquals(8, c1.price(), 0.01);
   }
}
