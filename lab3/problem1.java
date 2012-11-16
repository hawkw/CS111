//***************************************************************************
// problem1.java
// Author: Hawk Weisman
// Course: CS111: Introduction to Computer Science I, Fall Semester 2012-2013
// Lab 3, Problem 1
//
// Prompts the user for information and prints a block of text.
// ***************************************************************************

import java.util.Scanner;

public class problem1 {
    public static void main (String[] args) {

	// set up the scanner and variables to collect user data

	Scanner scan = new Scanner (System.in);
	String name, college, petName;
	int age; 

	// prompt the user for data

	System.out.println("Please enter your name and press enter.");
	name = scan.nextLine();
	
	System.out.println("Please enter your age and press enter.");
	age = scan.nextInt();
	scan.nextLine();

	System.out.println("Please enter the college you attend and press enter.");
	college = scan.nextLine();

	System.out.println("Please enter the name of your pet and press enter.");
	petName = scan.nextLine();

	// print out the program header

	System.out.println("problem1.java");
	System.out.println("Author: Hawk Weisman");
	System.out.println("Course: CS111: Introduction to Computer Science I, Fall Semester 2012-2013");
	System.out.println("Lab 3, Problem 1 \n");
	System.out.println("Prompts the user for information and prints a block of text. \n");    

	// print out the text
	
	System.out.println("Hello, my name is " + name + " and I am " + age + " years");
	System.out.println("old. I'm enjoying my time at " + college + ", though");
	System.out.println("I miss my pet " + petName + " very much!");
	    }
}