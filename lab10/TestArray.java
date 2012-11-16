//*************************************************************
// TestArray.java
//
// Author: Hawk Weisman
// Course: CS111: Intro to Computer Science I
// Fall Semester 2012-2013
// Laboratory #10
// 
// Tests the functionality of the LinearArray class.
//*************************************************************

import java.util.Scanner;

public class TestArray {
	
    //-----------------------------------------------------
    // readIntArray(size): returns an array with a number of
    // elements equal to size
    //-----------------------------------------------------
    public static int[] readIntArray(int size) {
	Scanner scan = new Scanner(System.in);
	int[] array = new int[size];
	for (int i = 0; i < size; i++) {
	    System.out.println ("Please enter element " + i + ".");
	    array[i] = scan.nextInt();
		}			
	return array;
    }
    
    public static void main (String[] argv) {
	
	Scanner scan = new Scanner(System.in);

	int size = 0;   	// size of the array to be tested
	int arrayTwoSize = 0;   // size of the second array
	
	System.out.println("TestArray\n");
	System.out.println("Author: Hawk Weisman");
	System.out.println("Course: CS111: Intro to Computer Science I");
	System.out.println("Fall Semester 2012-2013");
	System.out.println("Laboratory #10\n");
	System.out.println("Tests the functionality of the LinearArray class.\n");
	
	System.out.println("Please enter the size of the array.");
	    
	size = scan.nextInt();
	
	LinearArray testArray = new LinearArray(readIntArray(size));
	
	// Test the sum method
	System.out.println("The sum of each element in the array is " + testArray.sum());

	// Test the product method
	System.out.println("The product of each element in the array is " + testArray.product());

	//Test the maximum method
	System.out.println("The maximum element in the array is " + testArray.maximum());

	// Test the Minimum method
	System.out.println("The minimum element in the array is " + testArray.minimum());

	//Test the inOrder method
	System.out.println ("Now testing the inOrder method.");
	if (testArray.inOrder() == true)
		System.out.println ("The array is in order.");
	else
		System.out.println ("The array is not in order.");
	
	// Test the reverse method
	testArray.reverse();
	System.out.println("Testing the reverse method.");
	System.out.println(testArray.toString());
	testArray.reverse();

	// test the largerThanEach method for the integer 47
       	System.out.println ("Now testing the largerThanEach method.");
	if (testArray.largerThanEach(47) == true) {
	    System.out.println ("47 is larger than each element in the array.");
		} else {
	    System.out.println ("47 is not larger than each element in the array.");
	}

	// test largerThanEach again for the integer 4
	if (testArray.largerThanEach(4) == true) {
	    System.out.println ("4 is larger than each element in the array.");
		} else {
	    System.out.println ("4 is not larger than each element in the array.");
	}
	    
	// test the sum of two arrays method
	System.out.println("Now testing the sum of two arrays method.");
	System.out.println("Please enter the size of the  second array.");
	arrayTwoSize = scan.nextInt();
	int[] arrayTwo = readIntArray(arrayTwoSize);
	System.out.println("Now printing the second array.");
	for (int i = 0; i < arrayTwo.length; i++)
	    System.out.print(arrayTwo[i] + " ");
	System.out.println("The sum of the two arrays is: " + testArray.sum(arrayTwo));
	
	// test the linearSearch method for the number 4
	System.out.println("Now testing the linearSearch method for the number 4.");

	if (testArray.linearSearch(4) == -1) 
	    System.out.println("The number 4 does not exist in this array.");
	else
	    System.out.println ("4 is at index " + testArray.linearSearch(4));

	// test linearSearch again for the number 27
	System.out.println("Now testing the linearSearch method for the number 27.");

	if (testArray.linearSearch(27) == -1) 
	    System.out.println("The number 27 does not exist in this array.");
	else
	    System.out.println ("27 is at index " + testArray.linearSearch(27));

	// test rotateLeft
	System.out.println ("Now testing rotateLeft.");
	int[] rotated = testArray.rotateLeft();
	System.out.println ("The rotated array is: ");
	for (int i = 0; i < rotated.length; i++)
	    System.out.print(rotated[i] + " ");
	
	// test sort (ascending)
	System.out.println("Now testing ascending bubble-sort.");
	testArray.sort(1);
	System.out.println(testArray.toString());
	
	// test sort (descending)
	System.out.println("Now testing descending bubble-sort.");
	testArray.sort(-1);
	System.out.println(testArray.toString());
	
    }
}

	
	
