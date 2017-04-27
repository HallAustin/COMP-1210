import org.junit.Assert;
import org.junit.After;
import org.junit.Test;

/**
 * Test class for Cookie.
 */
public class CookieTest {
   
   /**
    * Tests the price method.
    */
   @Test public void cookiePriceTest() {
      
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip",
                     12, "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      
      Assert.assertEquals(4.20, c.price(), 0.01);
   }
   
   /**
    * Tests the getName method.
    */
   @Test public void getNameTest() {
   
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip",
                     12, "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      Assert.assertEquals("", "Chips Delight", c.getName());   
   }
   
   /**
    * Tests the setName method.
    */
   @Test public void setNameTest() {
      
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip",
                     12, "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      c.setName("Test");
      Assert.assertEquals("", "Test", c.getName());
   }
   
   /** 
    * Tests the getFlavor method.
    */
   @Test public void getFlavorTest() {
      
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip",
                     12, "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      Assert.assertEquals("", "Chocolate Chip", c.getFlavor());
   }
   
   /**
    * Tests the setFlavor method.
    */
   @Test public void setFlavorTest() {
      
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip",
                     12, "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      c.setFlavor("Test");
      Assert.assertEquals("", "Test", c.getFlavor());   
   }
   
   /**
    * Tests the getQuantity method.
    */
   @Test public void getQuantityTest() {
   
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip",
                     12, "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      Assert.assertEquals(12, c.getQuantity(), 0.01);
   }
   
   /**
    * Tests the setQuantity method.
    */
   @Test public void setQuantityTest() {
      
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip",
                     12, "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      c.setQuantity(18);
      Assert.assertEquals(18, c.getQuantity(), 0.01);
   }
   
   /**
    * Tests the getIngredients method.
    */
   @Test public void getIngredientsTest() {
      
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip",
                     12, "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      String test = c.getIngredients()[1];
      Assert.assertEquals("", "sugar", test);
   }
   /**
    * Tests the setIngredients method.
    */
   @Test public void setIngredientsTest() {
   
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip",
                     12, "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      String[] ingredientsIn = {"test1", "test2", "test3", "test4",
         "test5", "test6"};
      c.setIngredients(ingredientsIn);
      Assert.assertEquals("", "test4", c.getIngredients()[3]);
   }
   
   /**
    * Tests the getCount method.
    */
   @Test public void getCountTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip",
                     12, "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      Assert.assertEquals("", 1, c.getCount());
   }
   
   /**
    * Tests the resetCount method.
    */
   @Test public void resetCountTest() {
      
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip",
                     12, "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
      BakedItem.resetCount();
      Assert.assertEquals("", 0, c.getCount()); 
   }
   
   /**
    * Tests the toString method.
    */
   @Test public void toStringTest() {
      
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip",
                     12, "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
                     
      Assert.assertEquals("Cookie: Chips Delight - Chocolate Chip	"
         + "Quantity: 12	Price: $4.20"
         + "\n(Ingredients: flour, sugar, dark chocolate chips, "
         + "butter, baking soda, " 
         + "\nsalt)", c.toString());
   }
   
   /**
    * Resets the count after each test.
    */
   @After public void after() {
      BakedItem.resetCount();
   }
}
