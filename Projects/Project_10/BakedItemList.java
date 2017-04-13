import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class BakedItemList {
   
   private String listName;
   private BakedItem[] itemList = new BakedItem[100];
   private int itemCount;
   private String[] excludedRecords = new String[30];
   private int excludedCount;
   private static int listCount = 0;
   
   //Constructor
   
   public BakedItemList() {
      
      listName = "";
      itemCount = 0;
      excludedCount = 0;
      listCount++;
   }
   
   /**
    * Returns the list name.
    * @return listName.
    */
   public String getListName() {
      
      return listName;
   }
   
   /**
    * Sets the list name.
    * @param listNameIn used to set listName.
    */
   public void setListName(String listNameIn) {
         
      listName = listNameIn;
   }
   
   /**
    * 
    */
   public BakedItem[] getItemList() {
      
      return itemList;
   }
    
    /**
     * 
     */
   public void setItemList(BakedItem[] listIn) {
      
      itemList = listIn;
      
      for (int i = 0; i < itemList.length; i++) {
         
         itemCount += 1;
      }        
   }
   
   /**
    *
    */
   public int getItemCount() {
      
      return itemCount;
   } 
   
   /**
    *
    */
   public void setItemCount(int itemCountIn) {
      
      itemCount = itemCountIn;
   } 
   
   /**
    *
    */
   public String[] getExcludedRecords() {
      
      return excludedRecords;
   }
   
   /**
    *
    */
   public void setExcludedRecords(String[] exRecIn) {
      
      excludedRecords = exRecIn;
               
      for (int i = 0; i < excludedRecords.length; i++) {
         
         excludedCount += 1;
      }
   }
   
   /**
    *
    */
   public int getExcludedCount() {
      
      return excludedCount;
   }
   
   /**
    * 
    */
   public void setExcludedCount(int countIn) {
      
      excludedCount = countIn;
   }
   
   /**
    *
    */
   public static int getListCount() {
      
      return listCount;
   }
   
   /**
    *
    */
   public static void resetListCount() {
      
      listCount = 0;
   }
   
   /**
    *
    */
   public void readItemFile(String fileName) throws IOException {
      
      Scanner scan = new Scanner(new File(fileName));
      
      while (scan.hasNext()) {
      
         Scanner lineScan = new Scanner(
            scan.nextLine()).useDelimiter(",");
         
         while (lineScan.hasNext()) {
            
            String nameIn;
            String flavorIn;
            double crustCostIn;
            double weightIn;
            int quantityIn;
            int layersIn;
            int tiersIn;
            BakedItem item;
            String[] ingredientsIn = new String[50];
            
            switch ((lineScan.next()).charAt(0)) {
               
               case 'C':
                  nameIn = lineScan.next();
                  flavorIn = lineScan.next();
                  quantityIn = Integer.parseInt(lineScan.next());
                  
                  while (lineScan.hasNext()) {
                     
                     for (int i = 0; i < ingredientsIn.length
                           && ingredientsIn[i] != null; i++) {
                        
                        ingredientsIn[i] = lineScan.next();         
                     }
                  }
                  
                  item = new Cookie(nameIn, flavorIn,
                           quantityIn, ingredientsIn);
                           
                  itemList[itemCount] = item;
                  itemCount++;
                  break;
               
               case 'P':
                  nameIn = lineScan.next();
                  flavorIn = lineScan.next();
                  quantityIn = Integer.parseInt(lineScan.next());
                  crustCostIn = Double.parseDouble(lineScan.next());
                  
                  while (lineScan.hasNext()) {
                     
                     for (int i = 0; i < ingredientsIn.length
                           && ingredientsIn[i] != null; i++) {
                        
                        ingredientsIn[i] = lineScan.next();         
                     }
                  }
                  
                  item = new Pie(nameIn, flavorIn,
                        quantityIn, crustCostIn, ingredientsIn);
                  
                  itemList[itemCount] = item;
                  itemCount++;
                  break;
                  
               case 'K':
                     
                  nameIn = lineScan.next();
                  flavorIn = lineScan.next();
                  quantityIn = Integer.parseInt(lineScan.next());
                  layersIn = Integer.parseInt(lineScan.next());
                     
                  while (lineScan.hasNext()) {
                     
                     for (int i = 0; i < ingredientsIn.length
                           && ingredientsIn[i] != null; i++) {
                        
                        ingredientsIn[i] = lineScan.next();         
                     }
                  }
                  
                  item = new Cake(nameIn, flavorIn, quantityIn,
                        layersIn, ingredientsIn);
                  
                  itemList[itemCount] = item;
                  itemCount++;
                  break;
               
               case 'W':
                  
                  nameIn = lineScan.next();
                  flavorIn = lineScan.next();
                  quantityIn = Integer.parseInt(lineScan.next());
                  layersIn = Integer.parseInt(lineScan.next());
                  tiersIn = Integer.parseInt(lineScan.next());
                  
                  while (lineScan.hasNext()) {
                     
                     for (int i = 0; i < ingredientsIn.length
                           && ingredientsIn[i] != null; i++) {
                        
                        ingredientsIn[i] = lineScan.next();         
                     }
                  }
                  
                  item = new WeddingCake(nameIn, flavorIn, quantityIn,
                           layersIn, tiersIn, ingredientsIn);
                           
                  itemList[itemCount] = item;
                  itemCount++;
                  break;
                  
               default:
                  
                  System.out.println("*** invalid category *** for line:\n");
                  excludedRecords[excludedCount] = lineScan.nextLine();
                  excludedCount++;
            
                  
                  
            
            
                  
            }
         }
      }
       
      
   }
   
   /**
    *
    */
   public String generateReport() {
      
      return "";
   }
   
   /**
    *
    */
   public String generateReportByClass() {
      
      return "";
   }
   
   /**
    *
    */
   public String generateReportByPrice() {
      
      return "";
   }
   
   /**
    *
    */
   public String generateReportByFlavor() {
      
      return "";
   }
   
   /**
    *
    */
   public String generateExcludedRecordsReport() {
      
      return "";
   }
}