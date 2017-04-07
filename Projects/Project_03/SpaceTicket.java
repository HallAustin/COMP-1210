import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
 * Program to accept ticket number and print ticket info.
 * 
 * @author Austin Hall 
 * @version 1/29/17
 */
public class SpaceTicket {
   /**
    * Accepts ticket number and prints out information one time.
    * @param args Command line - (not used).
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String ticketCode;
      char category;
      String priceString;
      String time;
      String month;
      String day;
      String year;
      String hour;
      String minute;
      double price = 0.0;
      double cost = 0.0;
      int ticketLength = 0;
      String seat;
      String description;
      int prizeNumber = 0;
      
      
      
      // prompts user for ticket code
      System.out.print("Enter ticket code: ");
      ticketCode = new String(userInput.nextLine());
      //trims ticket code
      ticketCode = ticketCode.trim();
      
      //checks to see if ticket number is long enough
      ticketLength = ticketCode.length();
      
      if (ticketLength >= 25) { // The program provides ticket info
         
         //splits ticket code into parts
         ticketCode.trim();
         priceString = ticketCode.substring(0, 8);
         price = Double.parseDouble(priceString);
         category = ticketCode.charAt(8);
         time = ticketCode.substring(9, 13);
         hour = ticketCode.substring(9, 11);
         minute = ticketCode.substring(11, 13);
         month = ticketCode.substring(13, 15);
         day = ticketCode.substring(15, 17);
         year = ticketCode.substring(17, 21);
         seat = ticketCode.substring(21, 24);
         description = ticketCode.substring(24);
         
         if (category == 's') { // apply student discount
            cost = price * .75;
         }
         else if (category == 'c') { //apply child discount
            cost = price * .65;
         }
         else { //leave ticket price as is
            cost = price;
         }
         // random number generator
         Random rnd = new Random();
         int prizeNum = rnd.nextInt(999999) + 1;
         
      
         //formatting for price and cost
         price /= 100;
         cost /= 100;
         DecimalFormat priceFmt = new DecimalFormat("$#,##0.00");
         String priceFormatted = priceFmt.format(price);
         String costFormatted = priceFmt.format(cost);
         DecimalFormat randomFmt = new DecimalFormat("000000");
         String prizeNumFormatted = randomFmt.format(prizeNum);
         
         
         
         //prints ticket information
         System.out.print("Space Ticket: " + description);
         System.out.print("\nDate: " + month + "/" + day + "/" + year);
         System.out.print("   Time: " + hour + ":" + minute);
         System.out.print("   Seat: " + seat);
         System.out.print("\nPrice: " + priceFormatted);
         System.out.print("   Category: " + category);
         System.out.print("   Cost: " + costFormatted);
         System.out.print("\nPrize Number: " + prizeNumFormatted);
         
         
      }
      else { // The ticket is displayed as invalid
      
         System.out.print("*** Invalid ticket code ***"
            + "\nTicket code must have at least 25 characters.");
      }
   }
}