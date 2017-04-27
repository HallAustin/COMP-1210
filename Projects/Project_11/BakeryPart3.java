import java.io.IOException;

/**
 * Driver program for bakery.
 * @author Austin Hall
 * @version 4/26/17
 */
public class BakeryPart3 {
   
   /**
    * Main method to generate report of a file.
    * @param args Command line used to read in file name.
    */
   public static void main(String[] args) {
      
      if (args.length == 0 || args[0] == null || args[0].equals("")) {
         
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
      else {
            
         String fileName = args[0];
         try {
            
            BakedItemList b = new BakedItemList();
            b.readItemFile(fileName);
            System.out.println(b.generateReport());
            System.out.println(b.generateReportByClass());
            System.out.println(b.generateReportByPrice());
            System.out.println(b.generateReportByFlavor());
            System.out.println(b.generateExcludedRecordsReport());
         } 
         catch (IOException e) {
            System.out.println("Attempted to read file: " + fileName
               + " (No such file or directory)\n"
               + "Program ending.");
         
         }
      }
   }
}