/**
 * Driver program for the Inventory class.
 * 
 * @author Austin Hall
 * @version 4/3/17
 */
public class InventoryDriver {
   /**
    * Main method for driver program.
    * @param args Command line - (not used).
    */
   public static void main(String[] args) {
      
      InventoryItem.setTaxRate(0.05);
      
      InventoryItem inv = new InventoryItem("Oil change kit",
            39.99);
            
      ElectronicsItem elec = new ElectronicsItem("Cordless phone",
            80.00, 1.8);
            
      OnlineArticle art = new OnlineArticle("Java News", 8.50);
      art.setWordCount(700);
      
      OnlineBook book = new OnlineBook("Java for Noobs", 13.37);
      book.setAuthor("L. G. Jones");
      
      System.out.println(inv.toString());
      System.out.println(elec.toString());
      System.out.println(art.toString());
      System.out.println(book.toString());
   }
}