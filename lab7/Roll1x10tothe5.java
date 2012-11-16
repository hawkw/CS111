//*****************************************************************
// Roll1x10tothe5.java
//
// Author: Hawk Weisman
// Class: CS111: Intro to Computer Science I
// Fall Semester 2012-2013
// Laboratory #7
//
// Using the Die and PairOfDice classes, simulates rolling a pair
// of dice 10000 times 100 times.
//****************************************************************

public class Roll1x10tothe5 {
    public static void main (String[] argv) {
	
	// print out the program header

	System.out.println ("Roll10000.java\n");
	System.out.println ("Author: Hawk Weisman");
	System.out.println ("Class: CS111: Intro to Computer Science I");
	System.out.println ("Fall Semester 2012-2013\nLaboratory #7\n");
	System.out.println ("Using the Die and PairOf Dice classes, simulates rolling a pair of dice");
	System.out.println ("of dice 10000 times, and then iterates that process 100 times.\n");

	// instantiate a PairOfDice object
	
	PairOfDice dice = new PairOfDice();
	int boxcars = 0;                                // stores the number of boxcars
	final int NUM_ROLLS = 10000, BOXCAR_VALUE = 12; // number of pairs of dice to roll, value of a boxcar

	// roll some dice
	for (int i = 0; i < 100; i++) {
	    for (int j = 0; j < NUM_ROLLS; j++) {
		if (dice.roll() == BOXCAR_VALUE) {
		    boxcars++;
		}
	    }
	}

	// output the results
	
	System.out.println ("Rolled " + NUM_ROLLS * 100 + " pairs of dice with " + boxcars + " boxcars.");
    }
}