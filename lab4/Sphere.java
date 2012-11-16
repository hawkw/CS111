//***************************************************************************************
// Sphere.java
//
// Author: Hawk Weisman
// Course: CS111: Intro to Computer Science I, Fall Semester 2012-2013
// Laboratory #4 problem 3
//
// Represents a sphere with methods to calculate and return the volume and surface area.
// Last modified: September 28, 2012
//***************************************************************************************

import java.text.DecimalFormat;

public class Sphere {

    private double diameter;       // stores the sphere's diameter

    // decimalFormat object to format volume & surfaceArea
    DecimalFormat outputFormat = new DecimalFormat ("0.###");  

    //--------------------------------------------------------------
    // Constructor: sets the initial diameter
    //--------------------------------------------------------------

    public Sphere (double diameter) {
	 this.diameter = diameter; 
    }

    //--------------------------------------------------------------
    // getDiameter: returns the sphere's current diameter
    //--------------------------------------------------------------
    
    public double getDiameter () {
	return diameter;
    }

    //--------------------------------------------------------------
    // setDiameter: mutator for the sphere's diameter
    //--------------------------------------------------------------

    public void setDiameter (double diameter) {
	this.diameter = diameter;
    }

    //--------------------------------------------------------------
    // calcVolume: calculates the sphere's volume using the formula
    // v = (4/3) * Pi * r^3 and returns it to three decimal places
    //--------------------------------------------------------------

    public double calcVolume () {
	return (4.0/3.0) * Math.PI * Math.pow((diameter/2), 3);
    }

    //--------------------------------------------------------------
    // calcSurfaceArea: calculates the surface area using the formula
    // a = 4 * Pi * r^2 and returns it to three decimal places
    //--------------------------------------------------------------

    public double calcSurfaceArea () {

	// compute the surface area
	return  4.0 * Math.PI * Math.pow((diameter/2), 2);
       
    }

    //--------------------------------------------------------------
    // toString: returns the state of this sphere as a string
    //--------------------------------------------------------------

    public String toString () {
	return "Diameter: " + outputFormat.format(diameter);
    }
}
	

