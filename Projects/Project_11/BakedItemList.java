import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * @author Austin Hall
 * @version 4/17/17
 */
public class BakedItemList {
   
   private String listName;
   private BakedItem[] itemList = new BakedItem[100];
   private int itemCount;
   private String[] excludedRecords = new String[30];
   private int excludedCount;
   private static int listCount = 0;
   
   /** 
    * Constructor.
    */
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
    * @return itemList returns list.
    */
   public BakedItem[] getItemList() {
      
      return itemList;
   }
    
    /**
     * @param listIn used to set list.
     */
   public void setItemList(BakedItem[] listIn) {
      
      itemList = listIn;
      
      for (int i = 0; i < itemList.length; i++) {
         
         itemCount += 1;
      }        
   }
   
   /**
    * @return itemCount returns count.
    */
   public int getItemCount() {
      
      return itemCount;
   } 
   
   /**
    * @param itemCountIn used to set itemCount.
    */
   public void setItemCount(int itemCountIn) {
      
      itemCount = itemCountIn;
   } 
   
   /**
    * @return excludedRecords.
    */
   public String[] getExcludedRecords() {
      
      return excludedRecords;
   }
   
   /**
    * @param exRecIn sets excluded records.
    */
   public void setExcludedRecords(String[] exRecIn) {
      
      excludedRecords = exRecIn;
               
      for (int i = 0; i < excludedRecords.length; i++) {
         
         excludedCount += 1;
      }
   }
   
   /**
    * @return excludedCount.
    */
   public int getExcludedCount() {
      
      return excludedCount;
   }
   
   /**
    * @param countIn used to set count.
    */
   public void setExcludedCount(int countIn) {
      
      excludedCount = countIn;
   }
   
   /**
    * @return listCount returns count.
    */
   public static int getListCount() {
      
      return listCount;
   }
   
   /**
    * sets list count to 0.
    */
   public static void resetListCount() {
      
      listCount = 0;
   }
   
   /**
    * @param fileName used to read in the file name.
    * @throws IOException when no file name is read.
    */
   public void readItemFile(String fileName) throws IOException {
      
      Scanner fileScan = new Scanner(new File(fileName));
      listName = fileScan.nextLine();
      String[] info;
      String typeString;
      char type;
    
      while (fileScan.hasNext()) {
         Scanner scan = new Scanner(System.in);
         String input = scan.nextLine();
         info = input.split(",");
         typeString = info[0];
         type = typeString.toUpperCase().charAt(0);
         
         //variables
         
         String nameIn;
         String flavorIn;
         int quantityIn;
         double crustCostIn;
         int layersIn;
         int tiersIn;
         String[] ingredientsIn = new String[50];
         int j;
         String[] ingredientsInTrim;
         
         switch (type) {
            
            case 'C':
               try {
                  nameIn = info[1];
                  flavorIn = info[2];
                  quantityIn = Integer.parseInt(info[3]);
                  ingredientsIn = new String[50];
                  j = 0;
                  for (int i = 0; i < info.length - 4; i++) {
                  
                     ingredientsIn[i] = info[i + 4];
                     j++;
                  }
                  ingredientsInTrim = Arrays.copyOf(ingredientsIn, j);
                  Cookie c = new Cookie(nameIn, flavorIn, quantityIn,
                        ingredientsInTrim);
                  itemList[itemCount] = c;
                  itemCount++;
                  break;
               } 
               catch (NumberFormatException e) {
                  String result = "*** " + e + " in:\n" + input;
                  excludedRecords[excludedCount] = result;
                  excludedCount++;
               } 
               catch (java.util.NoSuchElementException e) {
                  String result = "*** " + e + " in:\n" + input;
                  excludedRecords[excludedCount] = result;
                  excludedCount++;
               }
               
               catch (ArrayIndexOutOfBoundsException e) {
                  NoSuchElementException r = new NoSuchElementException();
                  String result = "*** " + r + " in:\n" + input;
                  excludedRecords[excludedCount] = result;
                  excludedCount++;
               }
               
            
            case 'P':
               nameIn = info[1];
               flavorIn = info[2];
               quantityIn = Integer.parseInt(info[3]);
               crustCostIn = Double.parseDouble(info[4]);
               ingredientsIn = new String[50];
               j = 0;
               for (int i = 0; i < info.length - 5; i++) {
                  
                  ingredientsIn[i] = info[i + 5];
                  j++;
               }
               ingredientsInTrim = Arrays.copyOf(ingredientsIn, j);
               Pie p = new Pie(nameIn, flavorIn, quantityIn, crustCostIn,
                     ingredientsInTrim);
               itemList[itemCount] = p;
               itemCount++;
               break;
            
            case 'K':
               nameIn = info[1];
               flavorIn = info[2];
               quantityIn = Integer.parseInt(info[3]);
               layersIn = Integer.parseInt(info[4]);
               ingredientsIn = new String[50];
               j = 0;
               for (int i = 0; i < info.length - 5; i++) {
                  
                  ingredientsIn[i] = info[i + 5];
                  j++;
               }
               ingredientsInTrim = Arrays.copyOf(ingredientsIn, j);
               Cake k = new Cake(nameIn, flavorIn, quantityIn, layersIn,
                     ingredientsInTrim);
               itemList[itemCount] = k;
               itemCount++;
               break;
               
            case 'W':
               nameIn = info[1];
               flavorIn = info[2];
               quantityIn = Integer.parseInt(info[3]);
               layersIn = Integer.parseInt(info[4]);
               tiersIn = Integer.parseInt(info[5]);
               ingredientsIn = new String[50];
               j = 0;
               for (int i = 0; i < info.length - 6; i++) {
                  
                  ingredientsIn[i] = info[i + 6];
                  j++;
               }
               ingredientsInTrim = Arrays.copyOf(ingredientsIn, j);
               WeddingCake w = new WeddingCake(nameIn, flavorIn, quantityIn,
                     layersIn, tiersIn, ingredientsInTrim);
               itemList[itemCount] = w;
               itemCount++;
               break;
               
            default:
               excludedRecords[excludedCount] = input;
               excludedCount++;
               break;
               
         }
      }
   }
   
   /**
    * @return result as a string that returns list.
    */
   public String generateReport() {
      
      String result = "---------------------------------------\n"
         + "Report for Auburn's Best Bakery\n"
         + "---------------------------------------\n\n";
      for (int i = 0; i < itemCount; i++) {
         
         result += itemList[i].toString() + "\n\n";
      }
      
      return result;   
   }
   
   /**
    * @return result as a string by class.
    */
   public String generateReportByClass() {
      
      BakedItem[] itemListCopy = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(itemListCopy);
      String result = "---------------------------------------\n"
         + "Report for Auburn's Best Bakery (by Class)\n"
         + "---------------------------------------\n\n";
      for (int i = 0; i < itemCount; i++) {
         
         result += itemListCopy[i].toString() + "\n\n";
         
      }
      return result;
   }
   
   /**
    * @return result as a string of list by price.
    */
   public String generateReportByPrice() {
      
      BakedItem[] itemListCopy = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(itemListCopy, new PriceComparator());
      String result = "---------------------------------------\n"
         + "Report for Auburn's Best Bakery (by Class)\n"
         + "---------------------------------------\n\n";
      for (int i = 0; i < itemCount; i++) {
         
         result += itemListCopy[i].toString() + "\n\n";
         
      }
      return result;
   }
   
   /**
    * @return result as string sorted by flavor.
    */
   public String generateReportByFlavor() {
      
      BakedItem[] itemListCopy = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(itemListCopy, new FlavorComparator());
      String result = "---------------------------------------\n"
         + "Report for Auburn's Best Bakery (by Class)\n"
         + "---------------------------------------\n\n";
      for (int i = 0; i < itemCount; i++) {
         
         result += itemListCopy[i].toString() + "\n\n";
         
      }
      return result;
   }
   
   /**
    * @return result as string of excluded records.
    */
   public String generateExcludedRecordsReport() {
      
      String result = "---------------------------------------\n"
         + "Exluded Records Report\n"
         + "---------------------------------------\n\n";
      for (int i = 0; i < excludedCount; i++) {
         
         result += "*** invalid category *** for line:\n"
            + excludedRecords[i] + "\n";
      }
      return result;
   }
   
}