//***********************************************************************************************
// problem2.java
//
// Author: Hawk Weisman
// Course: CS111: Into to Computer Science I, Fall Semester, 2012-2013
// Laboratory #4 problem 2
//
// Reads in the radius of a sphere and computes its volume and surface area to four decimal places.
//*************************************************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class problem2 {
    public static void main(String[] args){

	//----------------------------------------------------------------------------------------
	// set up variables and objects, get user-inputted data
	//----------------------------------------------------------------------------------------
	
	// set up a Scanner to read in user data
	Scanner scan = new Scanner(System.in);

	// set up a DecimalFormat object to format the output to four decimal places
	DecimalFormat outputFormat = new DecimalFormat ("0.####");

	double radius; // radius of the sphere (defined by user)
	double volume; // volume of the sphere
	double surfaceArea; // surface area of the sphere

	// print out the program header
	System.out.println("problem2.java \n \n" + "Author: Hawk Weisman \n" + "Course: CS111: Intro to Computer Science 1"
			   + "Fall Semester 2012-2013 \n" + "Laboratory #4 problem 2 \n \n" +  "Reads in the radius"
			   + "of a sphere and computes its volume and surface area to four decimal places. \n");

	// prompt the user for data
	System.out.println("Please enter the radius of the sphere.");
	radius = scan.nextDouble();

	//----------------------------------------------------------------------------------------
	// compute the volume using the formula v = (4/3)*pi*r^3
	//----------------------------------------------------------------------------------------

	volume = (4/3) * Math.PI * Math.pow(radius, 3);

	//----------------------------------------------------------------------------------------
	// compute the surface area using the formula a = 4 * pi * r^2
	//----------------------------------------------------------------------------------------

	surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

	//----------------------------------------------------------------------------------------
	// format and output the data
	//----------------------------------------------------------------------------------------
	
	System.out.println("The volume of a sphere of radius " + radius + " is " + outputFormat.format(volume) +
			   ", and the surface area is " + outputFormat.format(surfaceArea) + ".");
    }
}


	


