//******************************************************
// Circle.java
// 
// Author: Hawk Weisman
// Course: CS111: Intro to Computer Science I
// Fall Semester 2012-2013
// Laboratory #8
// Based on: Circle.java by Lewis/Loftus
//
// Represents a circle with a position, size, and color.
//*******************************************************

import java.awt.*;

public class Circle {
    private int diameter; // stores the circle's diameter
    private int x, y;     // stores the circle's x and y positions
    private Color color;  // stores the circle's color

    //-------------------------------------------------
    // Constructor: sets up a circle with a size,
    // color, and position.
    //-------------------------------------------------
    public Circle (int diameter, Color color, int x, int y) {
	this.diameter = diameter;
	this.color = color;
	this.x = x;
	this.y = y;
    }

    //-------------------------------------------------
    // Draws the circle on the specified graphics
    // context.
    //-------------------------------------------------
    public void draw (Graphics page) {
	page.setColor (color);
	page.fillOval (x, y, diameter, diameter);
    }

    //--------------------------------------------------
    // setDiameter: diameter mutator
    //--------------------------------------------------
    public void setDiameter (int diameter) {
	this.diameter = diameter;
    }
    
    //--------------------------------------------------
    // setX: mutator for the circle's x value
    //--------------------------------------------------
    public void setX (int x) {
	this.x = x;
    }

    //--------------------------------------------------
    // setY: mutator for the circle's y value
    //--------------------------------------------------
    public void setY (int y) {
	this.y = y;
    }

    //--------------------------------------------------
    // getDiameter: accessor for the circle's diameter
    //--------------------------------------------------
    public int getDiameter () {
	return diameter;
    }

    //--------------------------------------------------
    // getX: accessor for the circle's x value
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