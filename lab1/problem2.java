//***********************************************************************
// problem2.Java
// Prints the sum of the first 200 odd positive integers.
//
// Author: Hawk Weisman
// Course: CS111: Introduction to Computer Science 1
// Semester: Fall 2012-2013
//***********************************************************************

public class problem2 {
    public static void main (String[] args){
	int sum = 0;         // 'sum' stores the (increasing) value as the program loops through the integers.
	int next = 1;        // 'next' stores the value of the next number to be added to 'sum'.
	while (next < 400) {
	    sum = sum + next;      // add the next number to 'sum'.
	    next = next + 2;       // add 2 to 'next' to increment by odd numbers.
	}
	    System.out.println ("problem2.java" + "\n" + "Prints the sum of the first 200 odd positive integers." + "\n" + "\n" + "Author: Hawk Weisman" + "\n" + "Course: CS1111: Introduction to Computer Science 1" + "\n" + "Semester: Fall 2012 + 2013" + "\n" + "\n" + "The sum of the first 200 odd positive integers is " + sum);
    }
}
	