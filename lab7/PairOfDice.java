//*****************************************************************
// PairOfDice.java
//                                                                                                                                                                             
// Author: Hawk Weisman                                                                                                                         
// Course: CS111: Introduction to Computer Science I                                                                                                                                
// Fall Semester 2012-2013                                                                                                                                                          
// Laboratory #7                                                                                                                                                                    
//                                                                                                                                                                                  
// Represents two dice using multiple instances of Die.class.                                                                                                                   
//*****************************************************************      

public class PairOfDice {

    private Die die1, die2;

    //-------------------------------------------------------------
    // constructor: instantiates a PairOfDice object and the two
    // Die objects within it
    //-------------------------------------------------------------
    
    public PairOfDice() {
       die1 = new Die();
       die2 = new Die();
    }

    //--------------------------------------------------------------
    // getDie1FaceValue: accessor for the faceValue of die1
    //--------------------------------------------------------------
    
    public int getDie1FaceValue () {
	return die1.getFaceValue();
    }

    //--------------------------------------------------------------
    // getDie2FaceValue: accessor for the faceValue of die1
    //--------------------------------------------------------------
    
    public int getDie2FaceValue () {
        return die2.getFaceValue();
    }
    
    //--------------------------------------------------------------
    // setDie1FaceValue: accessor for the faceValue of die1
    //--------------------------------------------------------------
    
    public void setDie1FaceValue (int faceValue) {
        die1.setFaceValue(faceValue);
    }
    
    //--------------------------------------------------------------
    // setDie2FaceValue: accessor for the faceValue of die1
    //--------------------------------------------------------------
    
    public void setDie2FaceValue (int faceValue) {
        die2.setFaceValue(faceValue);
    }

    //--------------------------------------------------------------
    // roll: Rolls both Die objects and returns their sum
    //--------------------------------------------------------------

    public int roll() {
	return die1.roll() + die2.roll();
    }

    //--------------------------------------------------------------
    // sum: returns the sum of the face values of both Die objects
    //--------------------------------------------------------------

    public int sum() {
	return die1.getFaceValue() + die2.getFaceValue();
    }

    //--------------------------------------------------------------
    // toString: returns a string containing the state of this object
    //--------------------------------------------------------------

    public String toString() {
	return "Die 1: " + die1.getFaceValue() + " Die 2: " + die2.getFaceValue();
    }
}