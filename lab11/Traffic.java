//*************************************************************
// Traffic.java
//
// Author: Hawk Weisman
// Course: CS111: Intro to Computer Science I
// Fall Semester 2012-2013
// Laboratory #11
//
// Simulates a two-way intersection.
//**************************************************************

import java.util.*;

public class Traffic {
    
    private int[] eastbound; // the number of cars that travel
                             // east per time interval  
                        
    private int[] westbound; // the number of cars that travel
                             // west per time interval

    private double e;        // stores the current value of the 
                             // eastbound car

    private double w;        // stores the current value of the
                             // westbound car

    private int slices;    // the number of slices per interval
    private int intervals; // the number of intervals in the sim
    private long seed;     // seed for the random number gen
    private double leftChance; // chance a car will turn left            

    //------------------------------------------------------------
    // constructor(intervals, slices, leftChance, seed): sets up a 
    // Traffic object with a number of intervals, a number of time
    // slices per intervals, 
    //------------------------------------------------------------
    public Traffic (int intervals, int slices, double leftChance, long seed) {
        this.intervals = intervals;
	this.slices = slices;
	this.leftChance = leftChance;
	this.seed = seed;
    }

    //------------------------------------------------------------
    // simulate(): conducts the simulation and returns the results
    // as a string
    //------------------------------------------------------------
    public String simulate () {

	String results = new String (); // stores the sim's results

	Random randomNumber = new Random (seed);

	eastbound = new int[intervals];
	westbound = new int[intervals];
	e = 1;    // at the beginning of the simulation, neither
	w = 1;    // car wishes to turn left.

	for (int i = 0; i < intervals; i++) {
	    for (int j = 0; j < slices; j++) {
		if (e >= leftChance) 
			e = randomNumber.nextDouble();
		if (w >= leftChance)
			w = randomNumber.nextDouble();
		if (e >= leftChance && w >= leftChance) {
		    eastbound[i]++; // the eastbound car may pass
		    westbound[i]++; // the westbound car may pass
		}
		if (e < leftChance && w >= leftChance) 
		    westbound[i]++; // the westbound car may pass
		if (w < leftChance && e >= leftChance) 
		    eastbound[i]++; // the eastbound car may pass
		if (e < leftChance && w < leftChance) {
		    eastbound[i]++; // the eastbound car may pass
		    westbound[i]++; // the westbound car may pass
			e = 1;
			w = 1;
		} 
	    }
	}

	    // create the result string
	    results =  ("  Interval \t   Eastbound \t   Westbound");
	    for (int k = 0; k < intervals; k++)
		results = results + "\n\t" + (k + 1) + "\t\t" + eastbound[k] + "\t\t" + westbound[k];		      
	    // return the results string
	    return results;
    }

	//------------------------------------------------------------
	// toString(): returns the state of the Traffic object as a
	// string.
	//------------------------------------------------------------
	public String toString() {
	    return "Intervals:\tTime Slices:\tLeft Turn Probability:\tRandom Seed:" +
		"\n" + intervals + "\t" + slices + "\t\t" + leftChance + "\t" + seed;
	}
}
		    
    
    
