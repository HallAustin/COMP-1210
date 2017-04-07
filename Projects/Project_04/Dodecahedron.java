
import java.text.DecimalFormat;
/**
 * This class is used to create new objects.
 *
 * @author Austin Hall
 * @version 2/7/17
 */
public class Dodecahedron {

   //instance variables
   private String label = "";
   private String color = "";
   private double edge = 0;
   
   /**
    * Constructor for the Dodecahedron class.
    * @param labelIn used as label for class.
    * @param colorIn used as color for class.
    * @param edgeIn used as edge length for class.
    */
   public Dodecahedron(String labelIn, String colorIn,
                        double edgeIn) {
              
      setLabel(labelIn);
      setColor(colorIn);
      setEdge(edgeIn);
   
   }
   /**
    * This method returns the label.
    * @return label returns the label
    */
   public String getLabel() {
      return label;
   }
   /**
    * This method sets the label.
    * @param labelIn used as label for class.
    * @return isLabelSet.
    */
   public boolean setLabel(String labelIn) {
      boolean isLabelSet = false;
      if (labelIn != null) {
         labelIn.trim();
         label = labelIn;
         isLabelSet = true;
      }
      return isLabelSet;
   }
   /**
    * This method returns the color of class.
    * @return color.
    */
   public String getColor() {
      return color;
   } 
   /**
    * This method sets the color of the class.
    * @param colorIn used as color for class.
    * @return isColorSet.
    */
   public boolean setColor(String colorIn) {
      boolean isColorSet = false;
      
      if (colorIn != null) {
         colorIn.trim();
         color = colorIn;
         isColorSet = true;
      }
      return isColorSet;
   }
   /**
    * This method returns the edge length.
    * @return edge.
    */
   public double getEdge() {
      
      return edge;
   }
   /**
    * This method sets the edge length.
    * @param edgeIn used as edge length of class.
    * @return isSet.
    */
   public boolean setEdge(double edgeIn) {
      boolean isEdgeSet = false;
      if (edgeIn > 0) {
         edge = edgeIn;
         isEdgeSet = true;
      }
      return isEdgeSet;
   }
   /**
    * This method calculates surface area of class.
    * @return surfaceAreaValue.
    */
   public double surfaceArea() {
      
      double surfaceArea = 3 * (Math.sqrt(25
         + (10 * Math.sqrt(5))))
         * Math.pow(edge, 2);
      return surfaceArea;
   }
   /**
    * This method calculates volume of class.
    * @return volumeValue.
    */
   public double volume() {
      double volume = Math.pow(edge, 3) 
         * ((15 + (7 * Math.sqrt(5))) / (4));
      return volume;
   }
   /**
    * This method calculates ratio of surface area to volume.
    * @return surfaceVolRatio.
    */
   public double surfaceToVolumeRatio() {
      double surfaceVolRatio = surfaceArea() / volume();
      return surfaceVolRatio;
   }
   /**
    * This method creates a string of the information of class.
    * @return output.
    */
   public String toString() {
   
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      
      String output = "Dodecahedron \"" + label + "\" is "
         + color + " with 30 edges of length " + edge
         + " units.\n"
         + "\tsurface area = " + fmt.format(surfaceArea()) + " square units\n"
         + "\tvolume = " + fmt.format(volume()) + " cubic units\n"
         + "\tsurface/volume ratio = "
         + fmt.format(surfaceToVolumeRatio());
      return output;
   }
}