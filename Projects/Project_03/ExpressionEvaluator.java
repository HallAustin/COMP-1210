import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Program to compute the value of an expression.
 *
 * @author Austin Hall
 * @version 1/29/17
 */
public class ExpressionEvaluator {
   /**
    * Evaluates an expression and prints answer one time.
    * @param args Command line - (not used).
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double x = 0.0;
      double result = 0.0;
      int leftOfDecimal = 0;
      int rightOfDecimal = 0;
      int decimalPosition = 0;
      int resultLength = 0;
      String stringResult;
      String resultFormatted;
      int lengthOfResult = 0;
      
      // prompts user for input for x
      System.out.println("Enter a value for x: ");
      x = Double.parseDouble(userInput.nextLine());
      
      // calculates formula
      result = Math.pow((3 * Math.pow(x, 5)) - (2 * Math.pow(x, 3)), 2);
      result /= Math.sqrt(Math.abs(16 * Math.pow(x, 7))) + 1;
      
      // determines how many digits to left and right of decimal
      stringResult = Double.toString(result);
      decimalPosition = stringResult.indexOf('.');
      lengthOfResult = stringResult.length();
      leftOfDecimal = stringResult.substring(0, decimalPosition).length();
      rightOfDecimal = stringResult.substring(decimalPosition + 1,
         lengthOfResult).length();
         
      // formats and prints results
      DecimalFormat fmt = new DecimalFormat("#,##0.0####");
      resultFormatted = fmt.format(result);
      
      System.out.print("Result: " + result);
      System.out.print("\n# digits to left of decimal point: " + leftOfDecimal);
      System.out.print("\n# digits to right of decimal point: "
                          + rightOfDecimal);
      System.out.print("\nFormatted Result: " + resultFormatted);
      
   }
}
