import java.util.Scanner;
import java.io.IOException;

/**
 * Driver program that provides a menu with options.
 * 
 * @author Austin Hall
 * @version 3/15/17
 */   
public class DodecahedronList2MenuApp {
    
    /**
     * Gives user a menu to choose options from.
     * @param args Command Line - (not used).
     * @throws IOException if file is not found.
     */
   public static void main(String[] args) throws IOException {
         
      String dListName = "*** no list name assigned ***";
      Dodecahedron[] myList = new Dodecahedron[20];
      DodecahedronList2 myDList = new DodecahedronList2(dListName, myList, 0);
      String fileName;
         
      String code = "";
         
      Scanner scan = new Scanner(System.in);
         
      System.out.println("Dodecahedron List System Menu\n"
                       + "R - Read File and Create Dodecagedron List\n"
                       + "P - Print Dodecahedron List\n" 
                       + "S - Print Summary\n"
                       + "A - Add Dodecahedron\n"   
                       + "D - Delete Dodecahedron\n"   
                       + "F - Find Dodecahedron\n"
                       + "E - Edit Dodecahedron\n"
                       + "Q - Quit");
                       
      do {
         System.out.print("\nEnter code [R, P, S, A, D, F, E, or Q]: ");
         
         String label;
         String color;
         double edge;
         
         
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) {
            case 'R':
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
               
               myDList = myDList.readFile(fileName);
               
               System.out.println("\tFile read in and "
                        + "DodecahedronList object created\n");
               break;
            
            case 'P':
               System.out.println(myDList.toString());
               break;
               
            case 'S':
               System.out.println("\n" + myDList.summaryInfo() + "\n");
               break;
               
            case 'A':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tColor: ");
               color = scan.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
               
               myDList.addDodecahedron(label, color, edge);
               System.out.println("\t*** Dodecahedron added ***\n");
               break;
            
            case 'D':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (myDList.deleteDodecahedron(label) != null) {
                  myDList.deleteDodecahedron(label);
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
            
            case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (myDList.findDodecahedron(label) != null) {
                  System.out.print(myDList.findDodecahedron(label)
                                    .toString() + "\n");
               }
               
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               
               }
               break;
            
            case 'E':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\n\tColor: ");
               color = scan.nextLine();
               System.out.print("\n\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
               
               if (myDList.findDodecahedron(label) != null) {
                  myDList.editDodecahedron(label, color, edge);
                  System.out.println("\"" + label + "\" successfully edited\n");
               }
               else {
                  System.out.println("\"" + label + "\" not found\n");
               }
               break;
            
            default:
               System.out.println("\t*** invalid code ***\n");
         }     
         
      
      } while (!code.equalsIgnoreCase("Q"));
   }
}