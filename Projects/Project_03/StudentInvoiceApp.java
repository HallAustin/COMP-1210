import java.util.Scanner;
public class StudentInvoiceApp {
   
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int numb = 0;
      
      StudentInvoice ex = new StudentInvoice("", "", 0, 0);
      
      //prompt for the name
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      //prompts for student number
      System.out.print("Enter your student number: ");
      numb = userInput.nextLine();
      
      //prompts for tuition and fees
      System.out.print("Enter your tuition amount & fees: ");
      tuition = userInput.nextDouble();
   }
}