import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

/**
 * Program to create an array of objects.
 * 
 * @author Austin Hall
 * @version 3/15/17
 */
public class DodecahedronList2 {
   
   private String listName = "";
   private Dodecahedron[] dList;
   private int numberOfDodecahedrons;
    /**
     * Constructor for the DodecahedronList2 class.
     * @param listNameIn used for listName input.
     * @param dListIn used for array input.
     * @param numberOfDodecahedronsIn used for num of obj.
     */     
   public DodecahedronList2(String listNameIn, 
                  Dodecahedron[] dListIn,
                  int numberOfDodecahedronsIn) {
   
      listName = listNameIn;
      dList = dListIn;
      numberOfDodecahedrons = numberOfDodecahedronsIn;
   }
   /**
    * This method returns the name of the list.
    * @return listName.
    */
   public String getName() {
      return listName;
   }
   /**
    * this method returns the number of objects.
    * @return numberOfDodecahedrons.
    */
   public int numberOfDodecahedrons() {
      return numberOfDodecahedrons;
   }
   /**
    * This method calculates the total surface area.
    * @return total.
    */
   public double totalSurfaceArea() {
      double total = 0;
      
      for (int i = 0; i < numberOfDodecahedrons; i++) {
         total += dList[i].surfaceArea();
      }
      return total;
   }
   /**
    * This method calculates the total volume.
    * @return total.
    */
   public double totalVolume() {
      double total = 0;
      
      for (int i = 0; i < numberOfDodecahedrons; i++) {
         total += dList[i].volume();
      }
      return total;
   }
   /**
    * This method calculates the avg surface area.
    * @return total.
    */
   public double averageSurfaceArea() {
      double total = 0;
      
      for (int i = 0; i < numberOfDodecahedrons; i++) {
         total += dList[i].surfaceArea();
      }
      total = total / (double) numberOfDodecahedrons;
      return total;
   }
   /**
    * This method calculates the avg volume.
    * @return total.
    */
   public double averageVolume() {
      double total = 0;
      
      for (int i = 0; i < numberOfDodecahedrons; i++) {
         total += dList[i].volume();
      }
      total = total / (double) numberOfDodecahedrons;
      return total;
   
   }
   /**
    * This method calculates the avg surface area/volume ratio.
    * @return total.
    */
   public double averageSurfaceToVolumeRatio() {
      double total = 0;
      
      for (int i = 0; i < numberOfDodecahedrons; i++) {
         total += dList[i].surfaceToVolumeRatio();
      }
      total = total / (double) numberOfDodecahedrons;
      return total;
   
   }
   /**
    * This method creates a string to return info.
    * @return result.
    */
   public String toString() {
      String result =  listName + "\n";
      for (int i = 0; i < numberOfDodecahedrons; i++) {
         result += "\n" + dList[i].toString() + "\n";
      }
      return result;
   }
   /**
    * This method creates a summary of the list.
    * @return result.
    */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----"; 
      result += "\nNumber of Dodecahedrons: " + numberOfDodecahedrons();
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea()); 
      result += "\nTotal Volume: "  + df.format(totalVolume());
      result += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
      result += "\nAverage Volume: "  + df.format(averageVolume());
      result += "\nAverage Surface/Volume Ratio: "
               + df.format(averageSurfaceToVolumeRatio());
      return result;
   }
   
   //*************************************************
   //***************** BEGIN NEW METHODS *************
   //*************************************************
   /**
    * This method returns the array of objects.
    * @return dList.
    */
   public Dodecahedron[] getList() {
      return dList;  
   }
   
   /**
    * This method reads a file and creates an array.
    * @param fileNameIn used to create an array.
    * @throws IOException when file has no more to read.
    * @return dL.
    */
   public DodecahedronList2 readFile(String fileNameIn) throws IOException {
   
      Scanner scanFile = new Scanner(new File(fileNameIn));
      Dodecahedron[] myList = new Dodecahedron[20];
      String dListName = "";
      int numDodecahedrons = 0;
      String color = "", label = "";
      double edge = 0;
   
      listName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         color = scanFile.nextLine();
         edge = Double.parseDouble(scanFile.nextLine());
      
         Dodecahedron d = new Dodecahedron(label, color, edge);
         myList[numDodecahedrons] = d;
         numDodecahedrons++;
      }
   
      DodecahedronList2 dL = new DodecahedronList2(listName, 
                              myList, numDodecahedrons);
   
      return dL;
   }
   /**
    * This method reads a dodecahedron and adds it to the array.
    * @param labelIn used as label.
    * @param colorIn used as color.
    * @param edgeIn used as edge length.
    */
   public void addDodecahedron(String labelIn, String colorIn,
                              double edgeIn) {
      
      Dodecahedron d = new Dodecahedron(labelIn, colorIn, edgeIn);
      dList[numberOfDodecahedrons] = d;
      numberOfDodecahedrons++;                  
   }
   /**
    * This method reads a label and finds a dodecahedron.
    * @param labelIn used to find object.
    * @return dod if equals labelIn and null if it doesnt.
    */
   public Dodecahedron findDodecahedron(String labelIn) {
      numberOfDodecahedrons();
      
      if (numberOfDodecahedrons > 0) {
         for (int i = 0; i < numberOfDodecahedrons; i++) {
            if (dList[i].getLabel().equalsIgnoreCase(labelIn)) {
               return dList[i];
            }
         }
         return null;
      }
      else {
         return null;
      }
   }
   /**
    * This method finds an object and deletes it.
    * @param labelIn used to find the object.
    * @return d.
    */
   public Dodecahedron deleteDodecahedron(String labelIn) {
      Dodecahedron[] dListCopy = new Dodecahedron[1];
      
      for (int i = 0; i < numberOfDodecahedrons; i++) {
         if (dList[i].getLabel().equals(labelIn)) {
            dListCopy[0] = findDodecahedron(labelIn);
            for (int j = i; j < numberOfDodecahedrons - 1; j++) {
               dList[j] = dList[j + 1];
            }
            dList[numberOfDodecahedrons - 1] = null;
            numberOfDodecahedrons--;
         }
      }
      return dListCopy[0];
   }
   /**
    * This method finds an object and edits it.
    * @param labelIn used to find the object.
    * @param colorIn used to edit the color.
    * @param edgeIn used to edit the edge length.
    * @return isSet.
    */
   public boolean editDodecahedron(String labelIn, String colorIn,
                                 double edgeIn) {
      if (numberOfDodecahedrons != 0) {
         boolean result = false;
         for (Dodecahedron d : dList) {
            if (d.getLabel().equals(labelIn)) {
               d.setColor(colorIn);
               d.setEdge(edgeIn);
               result = true;
               break;
            }
         }
         return result;
      } 
      else {
         return false;
      }                             
   }
}