//*************************************************************
// TrafficTest.java
//
// Author: Hawk Weisman
// Course: CS111: Intro to Computer Science I
// Fall Semester 2012-2013
// Laboratory #11
//
// Demonstrates the ability of Traffic.class to simulate an
// intersection.
//**************************************************************

import java.util.Scanner;

public class TrafficTest {
    
    //----------------------------------------------------------
    // runs the Traffic simulation with the following parameters:
    // time intervals: 12, slices per interval: 100, 
    // left turn probability: 0.2, and random seed = 5.
    //---------------------------------------------------------- 
    public static void main(String[] argv) {

	int intervals;       // number of intervals
	int slices;          // slices per interval

	final double LEFT_CHANCE = 0.2;    // chance of a left turn
	final long SEED = 5; // seed for the random number generator

	Scanner scan = new Scanner (System.in);
	
	// print out the program header
	System.out.println ("TrafficTest\n\nAuthor:Hawk Weisman");
	System.out.println ("Course: CS111: Intro to Computer Science I");
	System.out.println ("Fall Semester 2012-2013\nLaboratory #11\n");
	System.out.println ("Demonstrates the ability fo Traffic.class to simulate an intersection.\n");

	// prompt the user for input:
	System.out.println ("Please enter the number of intervals to be simulated.");
	intervals = scan.nextInt();
	
	System.out.println ("Please enter the number of time slices per interval.");
	slices = scan.nextInt();
	
	// print out the simulation perameters
	System.out.println ("\nThe simulation perameters are as follows:");
	System.out.println ("Intervals: " + intervals + " Time Slices: " + slices + " Left Turn Probability: " + LEFT_CHANCE + " Random Seed: " + SEED + "\n");

	// set up the simulation object
	Traffic simulation = new Traffic (intervals, slices, LEFT_CHANCE, SEED);
	
	// run the simulation and print out the results
	System.out.println (simulation.simulate());
			    
    }
}
