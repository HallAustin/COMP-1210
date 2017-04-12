import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for BakeryPart1.
 */
public class BakeryPart1Test {
   
   /**
    * Tests the count method.
    */
   @Test public void countTest() {
   
      //covers the default constructor
      BakeryPart1 bp1 = new BakeryPart1();
      
      //checks class variable count
      BakedItem.resetCount();
      BakeryPart1.main(null);
      
      Assert.assertEquals("BakedItem.count should be 6. ",
                           6, BakedItem.getCount());
   
   }
}
