/****
 * Simple demonstration of mouse events--used along with program
 * EasyMousePanelOne.java
 ****/
import javax.swing.*;

public class EasyMouseAppOne {
   public static void main(String[] args) {
      JFrame frame = new JFrame("Easy Mouse App: #1");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(new EasyMousePanelOne());
      frame.pack();
      frame.setVisible(true);
   }
}
