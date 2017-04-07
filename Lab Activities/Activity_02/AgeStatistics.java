import java.util.Scanner;
   
/**
* Program to print someone's name, age, gender, and max heart rate.
*
* @author Austin Hall
* @version 1/20/17
*/

public class AgeStatistics {
  /**
     * Prints name, age, gender, and heart rate one time.
     * @param args Command line arguments - (not used).
     */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      //Prompts the user for their name
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      //Prompts the user for their age
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      //Prompts the user for their gender
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      //converts age to minutes
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
         
      //converts age to centuries
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
         
     //display max heart rate
      System.out.print("Your max heart rate is ");
      if (gender == 1) { //calculate female MHR
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
      else { //calculate male MHR
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
     //Prints max heart rate
      System.out.println(maxHeartRate + " beats per minute.");
   }
   
}