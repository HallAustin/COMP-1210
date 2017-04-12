import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for WeddingCake.
 */
public class WeddingCakeTest {
   
   /**
    * Tests the getTiers method.
    */
   @Test public void getTiersTest() {
   
      WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3,
            "flour", "sugar", "buttermilk", "coffee",
            "eggs", "butter", "baking soda", "baking powder", "salt");
      Assert.assertEquals(3, c3.getTiers());
   }
   
   /**
    * Tests the setTiers method.
    */
   @Test public void setTiersTest() {
      
      WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3,
            "flour", "sugar", "buttermilk", "coffee",
            "eggs", "butter", "baking soda", "baking powder", "salt");
      c3.setTiers(2);
      Assert.assertEquals(2, c3.getTiers());
   }
   /**
    * Tests the price method.
    */
   @Test public void priceTest() {
      
      WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3,
            "flour", "sugar", "buttermilk", "coffee",
            "eggs", "butter", "baking soda", "baking powder", "salt");
      Assert.assertEquals(135, c3.price(), 0.01);
   }
}
