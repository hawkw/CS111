//************************************************************
// Door.java
//
// Author: Hawk Weisman
// Course: CS111: Intro to Computer Science I
// Fall Semester 2012-2013
// Laboratory #12
//
// Represents a door.
//*************************************************************

import java.awt.*;

public class Door {
	
	private int x, y;		 // stores the door's position
	private boolean visible; // whether or not the door is drawn
	private boolean open;	 // whether or not the door is open
	
	private final int WIDTH = 40;	// stores the door's height
	private final int HEIGHT = 80;  // stores the door's width
	
	//----------------------------------------------------------
	// constructor(x, y): creates a new door object with a
	// position equal to the x and y values given in the args.
	//----------------------------------------------------------
	public Door (int x, int y) {
		this.x = x;
		this.y = y;
		visible = false;
		open = false;
	}
	
	//----------------------------------------------------------
	// draw(g): draws a door in the graphics object g.
	//----------------------------------------------------------
	public void draw (Graphics g) {
		if (open == true) {
			g.setColor(Color.blue);
		} else {
			g.setColor(Color.yellow);	
		} 
		if (visible == true)
			g.fillRect(x, y, WIDTH, HEIGHT);
	}
	
	//-----------------------------------------------------------
	// contains(p): returns true if point p lies within the 
	// boundaries of the rectangle.
	//-----------------------------------------------------------
	public boolean contains (Point p) {
		if (p.x >= x && p.y >= y && p.x <= (x + WIDTH) && p.y <= (y + HEIGHT)) {
			return true;
		} else {
			return false;
		}
	}
	
	//-----------------------------------------------------------
	// setVisible(b): sets the door's visibility equal to b
	//-----------------------------------------------------------
	public void setVisible (boolean b) {
		visible = b;
	}
	
	//-----------------------------------------------------------
	// open(): opens the door
	//-----------------------------------------------------------
	public void open () {
		open = true;
	}
	
	//-----------------------------------------------------------
	// close(): closes the door
	//-----------------------------------------------------------
	public void close () {
		open = false;
	}
}