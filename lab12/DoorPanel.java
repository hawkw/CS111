//******************************************************
// DoorPanel.java
//
// Author: Hawk Weisman
// Course: CS111: Intro to Computer Science I
// Fall Semester 2012-2013
// Laboratory #12
//
// Demonstrates mouse events by displaying 'doors' that
// can be opened.
//******************************************************

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DoorPanel extends JPanel {
	
	private final int WIDTH = 600, HEIGHT = 200; // the panel's dimensions
	private final int NUM_DOORS = 9;			 // the number of doors
	
	private int prize = 0;			// which door contains the 'prize'
	private boolean winner = false; // whether or not the player has 'won'
	
	private Door[] doors;	// array to store the Door objects
	
	Random prizePicker = new Random (); // picks which door is the 'prize'
	
	//--------------------------------------------------
	// constructor(): sets up a new DoorPanel
	//--------------------------------------------------
	public DoorPanel () {
		
		// make some doors
		doors = new Door[NUM_DOORS];
		for (int i = 0; i < doors.length; i++) {
			doors[i] = new Door((30 + (i*60)), 30);
		}
		
		// pick a random door to contain a prize
		prize = prizePicker.nextInt(8);
		
		// set up the panel
		addMouseListener (new DoorListener());
		addMouseMotionListener (new DoorListener());
		setBackground (Color.green);
		setPreferredSize (new Dimension(WIDTH, HEIGHT));	
	}
	
	//--------------------------------------------------
	// paintComponent (g): draws the doors in the
	// graphics object g.
	//--------------------------------------------------
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		// loop through and draw the doors
		for (int i = 0; i < doors.length; i++) {
			doors[i].draw(g);
		}
		
		// if the player has 'won', print out "You won!"
		if (winner == true) {
			g.setColor(Color.black);
			g.drawString("You win!", 10, 10);
		}
	}


	//*******************************************************
	// implements a listener for mouse events
	//*******************************************************
	public class DoorListener implements MouseListener, MouseMotionListener {
		
		//---------------------------------------------------
		// mouseExited(): when the mouse leaves the window,
		// closes all the doors and makes them invisible.
		//---------------------------------------------------
		public void mouseExited (MouseEvent event) {
			for (int i = 0; i < doors.length; i++) {
				doors[i].close();
				doors[i].setVisible(false);
				prize = prizePicker.nextInt(8);
				winner = false;
			}
			repaint();
		}
	
		//---------------------------------------------------
		// mouseMoved(): checks if each door contains the
		// mouse location, and if so, makes it visible
		//---------------------------------------------------
		public void mouseMoved (MouseEvent event) {
			for (int i = 0; i < doors.length; i++) {
				if (doors[i].contains(event.getPoint()) == true)
					doors[i].setVisible(true);
			}
			repaint();
		}
		
		//---------------------------------------------------
		// mousePressed(): checks if each door contains the
		// mouse location, and if so, opens that door
		//---------------------------------------------------
		public void mousePressed (MouseEvent event) {
			for (int i = 0; i < doors.length; i++) {
				if (doors[i].contains(event.getPoint()) == true){
					doors[i].open();
					if (i == prize) 
						winner = true;
				}
			}
			repaint();
		}
	
		//---------------------------------------------------
		// mouseReleased(): closes all the doors
		//---------------------------------------------------
		public void mouseReleased (MouseEvent event) {
			for (int i = 0; i < doors.length; i++) {
				doors[i].close();
			}
			repaint();
	}
	
		public void mouseClicked (MouseEvent event) {}
		public void mouseEntered (MouseEvent event) {}
		public void mouseDragged (MouseEvent event) {}
	}
}