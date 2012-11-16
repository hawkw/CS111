//************************************************************************
// problem1.Java
//
// Author: Hawk Weisman
// Course: CS111: Intro to Computer Science I, Fall Semester 2012-2013
// Laboratory #4, problem 1
//
// Computes the distance between two points on a Cartesian plane.
//***********************************************************************

import java.util.Scanner;

public class problem1 {
    public static void main (String[] args){

	Scanner scan = new Scanner (System.in); // scanner to read in user data

	int x1,x2,y1,y2; // x1 and x2 store the x coordinate values, and y1 and y2 store the y coordinate values
	double distance; // the distance between the points

	// print the program header

	System.out.println("problem1.java \n \n" + "Author: Hawk Weisman \n" +"Course: CS111: Intro to Computer Science I, "
			   + "Fall Semester 2012-2013 \n" + "Laboratory #4, problem 1 \n \n"
			   + "Computes the distance between two points on a Cartesian plane.");

	//prompt the user for values

	System.out.println("Please enter the x-value of the first ordered pair");
	x1 = scan.nextInt();
	System.out.println("Please enter the y-value of the first ordered pair");
	y1 = scan.nextInt();
	System.out.println("Please enter the x-value of the second ordered pair.");
	x2 = scan.nextInt();
	System.out.println("Please enter the y-value of the second ordered pair.");
	y2 = scan.nextInt();

	// do the computation
	
	distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
	
	// print the result

	System.out.println("The distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + distance +".");
    }
}

	