/**
 * Class for online articles.
 * 
 * @author Austin Hall
 * @version 4/3/17
 */
public class OnlineArticle extends OnlineTextItem {
   
   private int wordCount;
   
   /**
    * Constructor for online article class.
    * @param nameIn used for name.
    * @param priceIn used for price.
    */
   public OnlineArticle(String nameIn, double priceIn) {
      
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
   /**
    * Method that sets word count.
    * @param wordCountIn used to set word count.
    */
   public void setWordCount(int wordCountIn) {
      
      wordCount = wordCountIn;
   }
}