//*************************************************************
// LinearArray.java
//
// Author: Hawk Weisman
// Based on: ArrayTest.java by Hawk Weisman
// Course: CS111: Intro to Computer Science I
// Fall Semester 2012-2013
// Laboratory #10
// 
// Bundles a linear array with some behaviours.
//*************************************************************

public class LinearArray {

    private int[] array;

    //--------------------------------------------------------
    // constructor(array): sets up a new LinearArray object 
    // equal to the array given in the argument
    //--------------------------------------------------------
    public LinearArray (int[] array) {
	this.array = array;
    }
    
    //---------------------------------------------------------
    // populate: sets the first element of the array's
    // equal to the array's length and each following element
    // to the array's length minus it's position in the array
    //---------------------------------------------------------
    public void populate () {
	for (int i = 0; i < array.length; i++)
	    array[i] = array.length - i;
    }

    //---------------------------------------------------------
    // sum: returns the sum of all the array's elements
    //---------------------------------------------------------
    public int sum () {
	int sum = 0;     // stores the sum of the array elements
	for (int i = 0; i < array.length; i++) 
	    sum = sum + array[i];
	return sum;
    }
    
    //----------------------------------------------------------
    // sum(b): returns the sum of this array's elements and
    // array b's elements.
    //----------------------------------------------------------
    public int sum (int[] b) {
	int sum = 0;  // stores the sum of the elements being added

	if (array.length >= b.length) {
	    for (int i = 0; i < b.length; i++) 
		sum = sum + array[i] + b[i];
	} else {
	    for (int i = 0; i < array.length; i++) 
		sum = sum + array[i] + b[i];
	}
	return sum;
    }
    //----------------------------------------------------------
    // product: computes the product of all the elements
    // in the array.
    //----------------------------------------------------------
    public int product () {
	int product = array[0];     // store the product
	for (int i = 1; i < array.length; i++)
	    product = product * array[i];
	return product;
    }

    //-----------------------------------------------------------
    // maximum: returns the array's largest element 
    //-----------------------------------------------------------
    public int maximum () {
	int max = 0;     // stores the largest array element
	for (int i = 0; i < array.length; i++) {
	    if (array[i] > max) {
		max = array[i];
		    }
	}
	return max;
    }

    //-----------------------------------------------------------
    // minimum: returns the array's smallest element 
    //-----------------------------------------------------------
    public int minimum () {
	int min = this.maximum();     // stores the smallest array element
	for (int i = 0; i < array.length; i++) {
	    if (array[i] < min) {
		min = array[i];
		    }
	}
	return min;
    }

    //-----------------------------------------------------------
    // reverse: reverses the order of the array's elements
    //-----------------------------------------------------------
    public void reverse () {
	int swap = 0;      // stores the element being swapped
	for (int i = array.length-1; i >= array.length/2; i--) {
	    swap = array[array.length-1-i];
	    array[array.length-1-i] = array[i];
	    array[i] = swap;
	}
    }

    //-----------------------------------------------------------
    // inOrder: returns true if the array's elements are
    // in ascending order, and false if they are not
    //-----------------------------------------------------------
    public boolean inOrder () {
	for (int i = 0; i < array.length -1; i++) {
	    if (array[i] >= array[i+1])
		return false;
	}
	return true;
    }
		
    //----------------------------------------------------------
    // largerThanEach(int): returns true if the integer
    // is larger than each element in the array.
    //----------------------------------------------------------
    public boolean largerThanEach (int integer) {
	for (int i = 0; i < array.length; i++) {
	    if (integer <= array[i])
		return false;
	}
	return true;
    }

    //-----------------------------------------------------------
    // linearSearch(k): returns the index of k if k occurs in the
    // array, and -1 otherwise.
    //-----------------------------------------------------------
    public int linearSearch(int k) {
	for (int i = 0; i < array.length; i++) {
	    if (array[i] == k)
		return i;
	}
	return -1;
    }

    //-------------------------------------------------------------
    // rotateLeft: returns the instance array with all the elements
    // moved one position to the left and the first element placed
    // at the end.
    //-------------------------------------------------------------
    public int[] rotateLeft () {
	int[] rotated = new int[array.length]; // stores the rotated array
	rotated[rotated.length-1] = array[0];
	for (int i = 0; i < rotated.length-1; i++) {
	    rotated[i] = array[i+1];
		}
	return rotated;
    }

    //------------------------------------------------------------
    // sort (direction): arranges the elements of the instance 
    // array in descending order if direction == 1 and in ascending
    // order otherwise. Uses bubble-sort. I feel bad about this.
    // (Cupper wouldn't let me use insertion sort).
    //------------------------------------------------------------
    public void sort (int direction) {
	int swap = 0; // stores elements being swapped
	if (direction == 1) {
	    for (int i = array.length -1; i >= 0; i--) {
		for (int j = 1; j < array.length; j++) {
		    if (array[j-1] < array[j]) {
			swap = array[j-1];
			array[j-1] = array[j];
			array[j]= swap;
		    }
		}
	    }
	} else {
	    for (int i = array.length -1; i >= 0; i--) {
		for (int j = 1; j < array.length; j++) {
		    if (array[j-1] > array[j]) {
			swap = array[j-1];
			array[j-1] = array[j];
			array[j]= swap;
		    }
		}
	    }
	}
    }
		    
    //-----------------------------------------------------------
    // toString(): returns the state of the LinearArray object
    // as a labeled string
    //-----------------------------------------------------------
    public String toString () {
	String toString = "The array contains " + array.length + " elements: " + array[0];
	    for (int i = 1; i < array.length; i++) {
		toString = toString + ", " + array[i];
	    }
	return toString;
    }
}
	
