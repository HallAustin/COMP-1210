/**
 * Driver program for the Bakery.
 *
 * @author Austin Hall
 * @version 4/6/17
 */
public class BakeryPart1 {
   
   /**
    * Creates each type of item and prints them out.
    * @param args Command Line - (not used).
    */
   public static void main(String[] args) {
      
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip",
                     12, "flour", "sugar", "dark chocolate chips",
                     "butter", "baking soda", "salt");
                     
      Pie p1 = new Pie("Weekly Special", "Apple", 1, 0, "flour",
                     "sugar", "apples", "cinnamon", "butter",
                     "baking soda", "salt");
                     
      Pie p2 = new Pie("Summer Special", "Key Lime", 1, 2, "flour",
                     "sugar", "lime juice", "lemon juice",
                     "graham crackers", "butter", "baking soda", "salt");
                     
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1, "flour", "sugar",
                     "cocoa powder", "vanilla", "eggs", "butter", 
                     "baking soda", "baking powder", "salt");
                     
      Cake c2 = new Cake("2-Layer", "Red Velvet", 1, 2, "flour", "sugar",
                     "cocoa powder", "food coloring", "eggs", "butter",
                     "baking soda", "baking powder", "salt");
      
      WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3,
                     "flour", "sugar", "buttermilk", "coffee", "eggs",
                     "butter", "baking soda", "baking powder", "salt");
                     
      //print out all bakery orders
      System.out.println(c.toString() + "\n");
      
      System.out.println(p1.toString() + "\n");
      
      System.out.println(p2.toString() + "\n");
      
      System.out.println(c1.toString() + "\n");
      
      System.out.println(c3.toString() + "\n");
      
   }
}