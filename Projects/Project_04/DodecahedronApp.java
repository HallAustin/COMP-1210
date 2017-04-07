import java.util.Scanner;
/**
 * Program that calls on Dodecahedron class.
 * 
 * @author Austin Hall
 * @version 2/7/17
 */
public class DodecahedronApp {
   /**
    * Prompts user for input and creates new class.
    * @param args Command line - (not used).
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      Dodecahedron userD = new Dodecahedron("", "", 0.0);
      //prompts user for input of dodecahedron
      System.out.println("Enter label, color, and edge length for"
         + " a dodecahedron.");
      
      //prompts user for label of dodecahedron
      System.out.print("\tlabel: ");
      userD.setLabel(userInput.nextLine());
      
      //prompts user for color of dodecahedron
      System.out.print("\tcolor: ");
      userD.setColor(userInput.nextLine());
      
      //prompts user for edge length of dodecahedron
      System.out.print("\tedge: ");
      String edgeString = userInput.nextLine();
      double edgeValue = Double.parseDouble(edgeString);
      
      if (edgeValue > 0) {
         userD.setEdge(edgeValue);
         userD.volume();
         userD.surfaceArea();
         userD.surfaceToVolumeRatio();
         System.out.println("");
         System.out.print(userD);
      }
      else {
         System.out.print("Error: edge must be greater than 0.");
      }
   }
}