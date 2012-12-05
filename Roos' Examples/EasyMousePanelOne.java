/****
 * Use along with EasyMouseAppOne.java.
 *
 * When mouse enters panel, change background to black.
 * When mouse leaves panel, change background to green.
 * When mouse is pressed, change background to red
 * When mouse is released, change background to black
 ****/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EasyMousePanelOne extends JPanel
{
   private Color color;

   public EasyMousePanelOne()
   {
      setPreferredSize(new Dimension(200,200));
      setBackground(Color.green);
      addMouseListener(new MyListener());
   }

   public class MyListener implements MouseListener
   {
       public void mousePressed(MouseEvent e)
       {
         setBackground(Color.red);
       }

       public void mouseReleased(MouseEvent e)
       {
         setBackground(Color.black);
       }

       public void mouseExited(MouseEvent e)
       {
         setBackground(Color.green);
       }

       public void mouseEntered(MouseEvent e)
       {
         setBackground(Color.black);
       }

      // Unused methods:
       public void mouseClicked(MouseEvent e)
         {}
    }
}
