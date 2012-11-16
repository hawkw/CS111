//***************************************************************************
// problem3.java
//
// Author: Hawk Weisman
// Course: CS111: Introduction to Computer Science I, Fall Semester 2012-2013
// Lab 3, Problem 3
//
// Determines the fewest number of each bill and coin needed to represent a 
// monetary amount in American currency.
//***************************************************************************

import java.util.Scanner;

public class problem3 {
    public static void main(String[] argv) {
	
	// make a scanner to grab the value of the money and a variable to store it
	Scanner moneyGrabber = new Scanner (System.in);
	double moneyValue;
	int cents;

	// print out the program header
	System.out.println("problem3.java\n  \n Author: Hawk Weisman"+ 
			   "\n Course: CS111: Introduction to Computer Science I, Fall Semester 2012-2013 \n" + 
			   " Lab 3 Problem 3 \n \n Determines the fewest number of each bill and coin needed to represent " +
			   "a monetary amount in American currency. \n");

	// prompt the user for data
	System.out.println("Enter the money amount:");
	
	// take the money...
	moneyValue = moneyGrabber.nextDouble();

	// ...and run (the conversion to cents)
	cents =(int) (moneyValue * 100);

	// break up the cents into various coinage
	int AlexHamiltons = cents / 1000;
	cents = cents % 1000;

	int AbeLincolns = cents / 500;
	cents = cents % 500;

	int GeorgeWashingtons = cents / 100;
	cents = cents % 100;
	
	int quarters = cents / 25;
	cents = cents % 25;

	int dimes = cents / 10;
	cents = cents % 10;

	int nickels = cents / 5;
	cents = cents % 5;

	// print out the results (finally)

	System.out.println(moneyValue + " is equivalent to: \n"
			   + AlexHamiltons + " ten dollar bills \n"
			   + AbeLincolns + " five dollar bills \n"
			   + GeorgeWashingtons + " one dollar bills \n"
			   + quarters + " quarters \n"
			   + dimes + " dimes \n"
			   + nickels + " nickels \n"
			   + cents + " pennies");
    }
}