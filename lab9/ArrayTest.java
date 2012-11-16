//*************************************************************
// ArrayTest.java
//
// Author: Hawk Weisman
// Course: CS111: Intro to Computer Science I
// Fall Semester 2012-2013
// Laboratory #9
// 
// Demonstrates some basic functions of an array.
//*************************************************************

public class ArrayTest {
    
    //---------------------------------------------------------
    // populate(array): sets the first element of the array's
    // equal to the array's length and each following element
    // to the array's length minus it's position in the array
    //---------------------------------------------------------
    public static void populate (int[] array) {
	for (int i = 0; i < array.length; i++)
	    array[i] = array.length - i;
    }

    //---------------------------------------------------------
    // sum(array): returns the sum of all the array's elements
    //---------------------------------------------------------
    public static int sum (int[] array) {
	int sum = 0;     // stores the sum of the array elements
	for (int i = 0; i < array.length; i++) 
	    sum = sum + array[i];
	return sum;
    }
    
    //----------------------------------------------------------
    // product(array): computes the product of all the elements
    // in the array.
    //----------------------------------------------------------
    public static int product (int[] array) {
	int product = array[0];     // store the product
	for (int i = 1; i < array.length; i++)
	    product = product * array[i];
	return product;
    }

    //-----------------------------------------------------------
    // maximum(array): returns the array's largest element 
    //-----------------------------------------------------------
    public static int maximum (int[] array) {
	int max = 0;     // stores the largest array element
	for (int i = 0; i < array.length; i++) {
	    if (array[i] > max) {
		max = array[i];
		    }
	}
	return max;
    }

    //-----------------------------------------------------------
    // reverse(array): reverses the order of the array's elements
    //-----------------------------------------------------------
    public static void reverse (int[] array) {
	int swap = 0;      // stores the element being swapped
	for (int i = array.length-1; i >= array.length/2; i--) {
	    swap = array[array.length-1-i];
	    array[array.length-1-i] = array[i];
	    array[i] = swap;
	}
    }

    //-----------------------------------------------------------
    // inOrder(array); returns true if the array's elements are
    // in ascending order.
    //-----------------------------------------------------------
    public static boolean inOrder (int[] array) {
	for (int i = 0; i < array.length -1; i++) {
	    if (array[i] >= array[i+1])
		return false;
	}
	return true;
    }
		
    //----------------------------------------------------------
    // largerThanEach(array, int): returns true if the integer
    // is larger than each element in the array.
    //----------------------------------------------------------
    public static boolean largerThanEach (int[] array, int integer) {
	for (int i = 0; i < array.length; i++) {
	    if (integer <= array[i])
		return false;
	}
	return true;
    }
	
    public static void main (String[] argv) {
	int[] testArray = new int[10]; 

	populate(testArray);
	
	// print out the program header
	System.out.println("ArrayTest\n");
	System.out.println("Author: Hawk Weisman");
	System.out.println("Class: CS111: Intro to Computer Science I");
	System.out.println("Fall Semester 2012-2013");
	System.out.println("Laboratory #9");
	System.out.println("\nDemonstrates some functions of an array.\n");

	// label and print each array element
	for (int i = 0; i < testArray.length; i++) {
	    System.out.println ("testArray[" + i + "] = " + testArray[i]);
	}
	
	// test the sum method
	System.out.println ("\nNow testing the sum() method."); 
	System.out.println ("The sum of the array's elements is: " + sum(testArray));
	
	// test the product method
	System.out.println ("\nNow testing the product() method.");
	System.out.println ("The product of the array's elements is: " + product(testArray));

	// test the maximum method
       	System.out.println ("\nNow testing the maximum() method.");
	System.out.println ("The greatest element in the array is: " + maximum(testArray));
	
	// test the inOrder method
       	System.out.println ("\nNow testing the inOrder() method.");
	if (inOrder(testArray) == true) {
	    System.out.println ("The array is in order!");
		} else {
	    System.out.println ("The array is not in order!");
	}
	    
	// test the reverse method
       	System.out.println ("\nNow testing the reverse() method.");
	System.out.println ("The array is now in reverse order:");
	reverse(testArray);
	
	// test the inOrder method again
       	System.out.println ("\nNow repeating the test of the inOrder() method.");
	if (inOrder(testArray) == true) {
	    System.out.println ("The array is now in order!");
		} else {
	    System.out.println ("The array is still not in order!");
	}
	
	// test the largerThanEach method for the integer 47
       	System.out.println ("\nNow testing the largerThanEach method.");
	if (largerThanEach(testArray, 47) == true) {
	    System.out.println ("47 is larger than each element in the array.");
		} else {
	    System.out.println ("47 is not larger than each element in the array.");
	}
	// test largerThanEach again for the integer 4
	if (largerThanEach(testArray, 4) == true) {
	    System.out.println ("4 is larger than each element in the array.");
		} else {
	    System.out.println ("4 is not larger than each element in the array.");
	    
	}
    }
}	
	
	