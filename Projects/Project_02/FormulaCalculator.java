import java.util.Scanner;
/**
 * Program that needs inputs for x,y,z to calculate a formula.
 *
 * @author Austin Hall
 * @version 1/20/17
 */
public class FormulaCalculator {
  /**
   * Program that calculates a formula and prints the results one time.
   * @param args Command line arguments - (not used).
   */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      String name = "";
      double inputX = 0;
      double inputY = 0;
      double inputZ = 0;
      double result = 0;
      
      //prints the fomula used in the calculator
      System.out.println("result = (2x - 7.4) (4y + 9.3)"
         + " (6z - 11.2) / xyz");
         
      //prompts user to enter numbers for x,y,z
      System.out.print("\tEnter x: ");
      inputX = userInput.nextDouble();
      System.out.print("\tEnter y: ");
      inputY = userInput.nextDouble();
      System.out.print("\tEnter z: ");
      inputZ = userInput.nextDouble();
      
      if ((inputX * inputY * inputZ) == 0) { //result is 0.0
         result = 0;
      }
      else { //program calculates formula using user input
      
         result = (((inputX * 2) - 7.4) * ((inputY * 4) + 9.3) * (
            (inputZ * 6) - 11.2)) / (inputX * inputY * inputZ);
      }
      //prints result using user inputs
      System.out.println("result = " + result);
      
   }
}