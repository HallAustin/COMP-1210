/**
 * @author Austin Hall
 * @version 4/26/17
 */
public class InvalidCategoryException extends Exception {
   
   /**
    * Constructor for class.
    * @param category used to return the category that error was caught.
    */
   public InvalidCategoryException(String category) {
      
      super("For category: " + "\"" + category + "\"");
   }
}