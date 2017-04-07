import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

public class DodecahedronList2 {
   
   private String listName = "";
   private Dodecahedron[] dList;
   private int numberOfDodecahedrons;
            
   public DodecahedronList2(String listNameIn, 
                  Dodecahedron[] dListIn,
                  int numberOfDodecahedronsIn) {
   
      listName = listNameIn;
      dList = dListIn;
      numberOfDodecahedrons = numberOfDodecahedronsIn;
   }
   public String getName() {
      return listName;
   }
   public int numberOfDodecahedrons() {
      return numberOfDodecahedrons;
   }
   public double totalSurfaceArea() {
      double total = 0;
      
      for (int i = 0; i < dList.length; i++) {
         total += dList[i].surfaceArea();
      }
      return total;
   }
   public double totalVolume() {
      double total = 0;
      
      for (int i = 0; i < dList.length; i++) {
         total += dList[i].volume();
      }
      return total;
   }
   public double averageSurfaceArea() {
      double total = 0;
      
      for (int i = 0; i < dList.length; i++) {
         total += dList[i].surfaceArea();
      }
      total = total / (double) numberOfDodecahedrons;
      return total;
   }
   public double averageVolume() {
      double total = 0;
      
      for (int i = 0; i < dList.length; i++) {
         total += dList[i].volume();
      }
      total = total / (double) numberOfDodecahedrons;
      return total;
   
   }
   public double averageSurfaceToVolumeRatio() {
      double total = 0;
      
      for (int i = 0; i < dList.length; i++) {
         total += dList[i].surfaceToVolumeRatio();
      }
      total = total / (double) numberOfDodecahedrons;
      return total;
   
   }
   public String toString() {
      String result = "\n" + listName + "\n";
      for (int i = 0; i < dList.length; i++) {
         result += "\n" + dList[i] + "\n";
      }
      return result;
   }
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----"; 
      result += "\nNumber of Dodecahedrons: " + numberOfDodecahedrons();
      result += "\ntotal surface area: " + df.format(totalSurfaceArea()); 
      result += "\ntotal volume: "  + df.format(totalVolume());
      result += "\naverage volume: "  + df.format(averageVolume());
      result += "\naverage surface area: " + df.format(averageSurfaceArea());
      result += "\naverage surface/volume ratio: "
               + df.format(averageSurfaceToVolumeRatio());
      return result;
   }
   
   //*************************************************
   //***************** BEGIN NEW METHODS *************
   //*************************************************
   
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
   
      DodecahedronList2 dL = new DodecahedronList2(listName, myList, numDodecahedrons);
   
      return dL;
   }
   public void addDodecahedron(String labelIn, String colorIn,
                              double edgeIn) {
      
      Dodecahedron d = new Dodecahedron(labelIn, colorIn, edgeIn);
      dList[numberOfDodecahedrons] = d;
      numberOfDodecahedrons++;                  
   }
   public Dodecahedron findDodecahedron(String labelIn) {
      Dodecahedron d = null;
      for (int i = 0; i < numberOfDodecahedrons; i++) {
         if (dList[i].getLabel() == labelIn) {
            d = dList[i];
         }
      }
      return d;   
   }
   public Dodecahedron deleteDodecahedron(String labelIn) {
      Dodecahedron d = null;
      int index = -1;
      for (int i = 0; i < numberOfDodecahedrons; i++) {
         if (dList[i].getLabel() == labelIn) {
            for (int j = i; j < numberOfDodecahedrons - 1; j++) {
               dList[j] = dList[j + 1];
            }
            d = dList[numberOfDodecahedrons - 1];
            dList[numberOfDodecahedrons - 1] = null;
            numberOfDodecahedrons--;
            break;
         }
      }
      return d;
   }
   public boolean editDodecahedron(String labelIn, String colorIn,
                                 double edgeIn) {
      boolean isSet = false;
      Dodecahedron d = null;
      for (int i = 0; i < numberOfDodecahedrons; i++) {
         if (dList[i].getLabel() == labelIn) {
            dList[i].setColor(colorIn);
            dList[i].setEdge(edgeIn);
            isSet = true;
         }
      }  
      return isSet;                            
   }
}