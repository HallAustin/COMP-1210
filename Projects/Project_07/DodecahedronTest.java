import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class DodecahedronTest {
   @Test public void labelTest() {
      Dodecahedron d = new Dodecahedron("", "", 0);
      d.setLabel("test");
      Assert.assertEquals("test", d.getLabel());
   }
   @Test public void colorTest() {
      Dodecahedron d = new Dodecahedron("", "", 0);
      d.setColor("blue");
      Assert.assertEquals("blue", d.getColor());
   }
   @Test public void edgeTestTrue() {
      Dodecahedron d = new Dodecahedron("", "", 0);
      Assert.assertEquals(true, d.setEdge(1));
   }
   @Test public void edgeTestFalse() {
      Dodecahedron d = new Dodecahedron("", "", 0);
      Assert.assertEquals(false, d.setEdge(0));
   }
   @Test public void getEdgeTest() {
      Dodecahedron d = new Dodecahedron("", "", 0);
      Assert.assertEquals(0, d.getEdge(), .000001);
   }
   @Test public void surfaceAreaTest() {
      Dodecahedron d = new Dodecahedron("", "", 0.25);
      Assert.assertEquals(1.290358, d.surfaceArea(), 0.000001);
   }
   @Test public void volumeTest() {
      Dodecahedron d = new Dodecahedron("", "", 0.25);
      Assert.assertEquals(0.1197362, d.volume(), 0.000001);
   }
   @Test public void surfaceToVolumeRatioTest() {
      Dodecahedron d = new Dodecahedron("", "", 0.25);
      Assert.assertEquals(10.776671, d.surfaceToVolumeRatio(), 0.000001);
   }
}
