import java.text.DecimalFormat;

public class Dodecahedron {
   private String label;
   private String color;
   private double edge = 0.0;
   
   public Dodecahedron(String labelIn, String colorIn,
                     double edgeIn) {
   
   
   }
   public String getLabel() {
      return label;
   }
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn != null) {
         label = labelIn;
         isSet = true;
      }
      return isSet;
   }
   public String getColor() {
      return color;
   }
   public boolean setColor(String colorIn) {
      boolean isSet = false;
      if (colorIn != null) {
         color = colorIn;
         isSet = true;
      }
      return isSet;
   }
   public double getEdge() {
      return edge;
   }
   public boolean setEdge(double edgeIn) {
      boolean isSet = false;
      if (edgeIn > 0) {
         edge = edgeIn;
         isSet = true;
      }
      return isSet;
   }
   public double surfaceArea() {
      return 3 *(Math.sqrt(25 + 10 * Math.sqrt(5))) *
         Math.pow(edge, 2);
   }
   public double volume() {
      return ((15 + 7 * Math.sqrt(5))/4) * Math.pow(edge, 3);
   }
   public double surfaceToVolumeRatio() {
      return surfaceArea() / volume();
   }
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      return "Dodecahedron \"" + getLabel() + "\" is \""
         + getColor() + "\" with 30 edges of length "
         + getEdge() + "units."
         + "\n\tsurface area = " + fmt.format(surfaceArea())
         + " square units"
         + "\n\tvolume = " + fmt.format(volume())
         + " cubic units"
         + "\n\tsurface/volume ratio = "
         + fmt.format(surfaceToVolumeRatio());
   }
}