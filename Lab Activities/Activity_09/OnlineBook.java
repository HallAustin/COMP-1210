/**
 * Class for online book objects.
 *
 * @author Austin Hall
 * @version 4/3/17
 */
public class OnlineBook extends OnlineTextItem {
   
   protected String author;
   
   /**
    * Constructor for online book class.
    * @param nameIn used for name.
    * @param priceIn used for price.
    */
   public OnlineBook(String nameIn, double priceIn) {
      
      super(nameIn, priceIn);
      author = "Author Not Listed";
      
   }
   
   /**
    * Method that overrides toString in InventoryItem class.
    * @return string representing info in object.
    */
   public String toString() {
      return name + " - " + author + ": $" + price;
   }
   
   /**
    * Method that sets author.
    * @param authorIn used to set the author's name.
    */
   public void setAuthor(String authorIn) {
      
      author = authorIn;
   }
}