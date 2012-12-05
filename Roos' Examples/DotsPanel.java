//********************************************************************
//  DotsPanel.java   page 420    Author: Lewis/Loftus
//                               Modified to use an array--Roos
//
//  Represents the primary panel for the Dots program on which the
//  dots are drawn.
//
//  CHANGED FROM TEXTBOOK: Number of dots is restricted to no
//  more that MAX_POINTS.
//********************************************************************

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DotsPanel extends JPanel
{
   private final int WIDTH = 300, HEIGHT = 200;
   private final int RADIUS = 6;
   private final int MAX_POINTS = 30;

   private Point[] pointList;
   private int count;

   //-----------------------------------------------------------------
   //  Sets up this panel to listen for mouse events.
   //-----------------------------------------------------------------
   public DotsPanel()
   {
      pointList = new Point[MAX_POINTS];
      count = 0;

      addMouseListener (new DotsListener());

      setBackground (Color.black);
      setPreferredSize (new Dimension(WIDTH, HEIGHT));
   }

   //-----------------------------------------------------------------
   //  Draws all of the dots stored in the list.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent(page);

      page.setColor (Color.green);

      for (int i = 0; i < count; i++)
      {
         Point drawPoint = pointList[i];
         page.fillOval (drawPoint.x - RADIUS, drawPoint.y - RADIUS,
                        RADIUS * 2, RADIUS * 2);
      }

      page.drawString ("Count: " + count, 5, 15);
   }

   //*****************************************************************
   //  Represents the listener for mouse events.
   //*****************************************************************
   private class DotsListener implements MouseListener
   {
      //--------------------------------------------------------------
      //  Adds the current point to the list of points and redraws
      //  whenever the mouse button is pressed.
      //--------------------------------------------------------------
      public void mousePressed (MouseEvent event)
      {
         if (count < MAX_POINTS)
         {
             pointList[count] =  event.getPoint();
             count++;
             repaint();
         }
      }

      //---------------------------------------------------------------
      //  Provide empty definitions for unused event methods.
      //---------------------------------------------------------------
      public void mouseClicked (MouseEvent event) {}
      public void mouseReleased (MouseEvent event) {}
      public void mouseEntered (MouseEvent event) {}
      public void mouseExited (MouseEvent event) {}
   }
}