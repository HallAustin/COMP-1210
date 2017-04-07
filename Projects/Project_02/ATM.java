import java.util.Scanner;
/**
 * Program to calculate least amount of currency in a number of dollars.
 *
 * @author Austin Hall
 * @version 1/20/17
 */
 
public class ATM {
  /**
   * Prints least amount of each type of dollar to reach amount specified.
   * @param args Command line arguments - (not used).
   */
   public static void main(String[] args) {
    
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int moneyAmount = 0;
      int getTwenties = 0;
      int getTens = 0;
      int getFives = 0;
      int getOnes = 0;
      int moneyLimit = 500;
      int originalAmount = 0;
      
      //Prompts user for amount of money
      System.out.print("Enter the amount: ");
      moneyAmount = userInput.nextInt();
      originalAmount = moneyAmount;
     
      if (moneyAmount > moneyLimit) { //program will not calculate
         System.out.println("Limit of $500 exceeded!");
      }
      else { //program will calculate entered amount
      
        //Prints bills by denomination
         System.out.println("Bills by denomination:");
        
        //Algorithm to get least amount of money
         getTwenties = moneyAmount / 20;
         moneyAmount -= (getTwenties * 20);
         getTens = moneyAmount / 10;
         moneyAmount -= (getTens * 10);
         getFives = moneyAmount / 5;
         moneyAmount -= (getFives * 5);
         getOnes = moneyAmount;
         
         //Prints denomination of money and how many of each
         System.out.println("\t$20: " + getTwenties);
         System.out.println("\t$10: " + getTens);
         System.out.println("\t$5: " + getFives);
         System.out.println("\t$1: " + getOnes);
         
         //Prints algorithm used to find how many of each dollar was found
         System.out.println("$" + originalAmount + " = (" + getTwenties 
            + " * $20) + (" + getTens + " * $10) + (" + getFives 
            + " * $5) + (" + getOnes + " * $1)");
         
      }  
   }
}