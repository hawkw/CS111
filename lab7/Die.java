//******************************************************************
// Die.java
//
// Author: Hawk Weisman        Based on: Die.java by Lewis/Loftus
// Course: CS111: Introduction to Computer Science I
// Fall Semester 2012-2013
// Laboratory #7
//
// Represents one die with faces showing values between 1 and 6.
//*****************************************************************

public class Die {
    private final int MAX = 6, MIN = 1;  // maximum and minimum face values
    private int faceValue;               // current value showing on the die

    //-------------------------------------------------------------
    // constructor: sets the initial face value
    //-------------------------------------------------------------
    public Die() {
	faceValue = roll();
    }

    //-------------------------------------------------------------
    // roll: rolls the dice and returns the result
    //-------------------------------------------------------------
    public int roll() {
	faceValue = (int)(Math.random() *  MAX) +1;
	return faceValue;
    }

    //--------------------------------------------------------------
    // setFaceValue: mutator for faceValue
    //--------------------------------------------------------------
    public void setFaceValue(int value) {
	if (value > MAX || value < MIN) {
	    System.out.println ("The die's value must be between 1 and 6.");
	} else {
	    faceValue = value;
	}
    }

    //-------------------------------------------------------------
    // getFaceValue: accessor for faceValue
    //-------------------------------------------------------------
    public int getFaceValue() {
	return faceValue;
    }

    //-------------------------------------------------------------
    // toString: returns a string representation of this die
    //-------------------------------------------------------------
    public String toString() {
	String result = Integer.toString(faceValue);
	return result;
    }
}