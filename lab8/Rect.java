//******************************************************
// Rect.java
// 
// Author: Hawk Weisman
// Course: CS111: Intro to Computer Science I
// Fall Semester 2012-2013
// Laboratory #8
// Based on: Circle.java by Lewis/Loftus
//
// Represents a rectangle with a position, size, and color.
//*******************************************************

import java.awt.*; 

public class Rect {
    private int w, h;     // stores the rectangle's width and height
    private int x, y;     // stores the circle's x and y positions
    private Color color;  // stores the circle's color

    //-------------------------------------------------
    // Constructor: sets up a rectangle with a width
    // height, color, and x/y position
    //-------------------------------------------------
    public Rect (int w, int h, Color color, int x, int y) {
		this.w = w;
		this.h = h;
		this.color = color;
		this.x = x;
		this.y = y;
    }

    //-------------------------------------------------
    // Draws the rectangle on the specified graphics
    // context.
    //-------------------------------------------------
    public void draw (Graphics page) {
		page.setColor (color);
		page.fillRect (x, y, w, h);
    }

    //--------------------------------------------------
    // setWidth: mutator for the rectangle's width
    //--------------------------------------------------
    public void setWidth (int width) {
		this.w = w;
    }
    
    //--------------------------------------------------
    // setHeight: mutator for the rectangle's height
    //--------------------------------------------------
    public void setHeight (int h) {
		this.h = h;
    }

    //--------------------------------------------------
    // setX: mutator for the rectangle's x value
    //--------------------------------------------------
    public void setX (int x) {
	this.x = x;
    }

    //--------------------------------------------------
    // setY: mutator for the rectange's y value
    //--------------------------------------------------
    public void setY (int y) {
	this.y = y;
    }

    //--------------------------------------------------
    // getHeight: accessor for the rectangle's height
    //--------------------------------------------------
    public int getHeight () {
	return h;
    }

    //--------------------------------------------------
    // getWidth: accessor for the rectangle's hidth
    //--------------------------------------------------
    public int getWidth () {
	return w;
    }

    //--------------------------------------------------
    // getX: accessor for the rectangle's x value
    //--------------------------------------------------
    public int getX () {
	return x;
    }

     //--------------------------------------------------
    // getY: accessor for the circle's y value
    //--------------------------------------------------
    public int getY () {
	return y;
    }
}