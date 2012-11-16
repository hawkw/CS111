//*****************************************************************
// Roll10000.java
//
// Author: Hawk Weisman
// Class: CS111: Intro to Computer Science I
// Fall Semester 2012-2013
// Laboratory #7
//
// Using the Die and PairOfDice classes, simulates rolling a pair
// of dice 1000 times, counting the number of boxcars (double 
// sixes) that occur.
//****************************************************************

public class Roll10000 {
    public static void main (String[] argv) {
	
	// print out the program header

	System.out.println ("Roll10000.java\n");
	System.out.println ("Author: Hawk Weisman");
	System.out.println ("Class: CS111: Intro to Computer Science I");
	System.out.println ("Fall Semester 2012-2013\nLaboratory #7\n");
	System.out.println ("Using the Die and PairOf Dice classes, simulates rolling a pair of dice");
	System.out.println ("of dice 10000 times, counting the number of boxcars (double sixes) that occur.\n");

	// instantiate a PairOfDice object
	
	PairOfDice dice = new PairOfDice();
	int boxcars = 0;                                // stores the number of boxcars
	final int NUM_ROLLS = 10000, BOXCAR_VALUE = 12; // number of pairs of dice to roll, value of a boxcar

	// roll some dice
	for (int i = 0; i < NUM_ROLLS; i++) {
	    if (dice.roll() == BOXCAR_VALUE) {
		boxcars++;
	    }
	}

	// output the results
	
	System.out.println ("Rolled " + NUM_ROLLS + " pairs of dice with " + boxcars + " boxcars.");
    }
}