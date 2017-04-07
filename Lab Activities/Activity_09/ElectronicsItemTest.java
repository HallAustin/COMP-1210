import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class ElectronicsItemTest {

   
   @Before public void setUp() {
      InventoryItem.setTaxRate(0.08);
   }
   
   @Test public void toStringTest() {
      
      setUp();
      ElectronicsItem ele = new ElectronicsItem(
            "Monitor", 100, 10.0);
      
      Assert.assertEquals("Monitor: $123.0", ele.toString());
   }
}
