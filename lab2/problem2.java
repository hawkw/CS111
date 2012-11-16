//********************************************************************
// problem2.java
//
// Author: Hawk Weisman
// Course: CS111 Introduction to Computer Science I, Fall Semester 2012
// Lab 2
//
// Reads values representing a time duration in hours, minutes, and
// seconds, and prints the equivalent total number of seconds.
//********************************************************************

import java.util.Scanner;

public class problem2 {
    public static void main (String[] args){
       	int hours, minutes, seconds;      // store the user's input of hours, minutes, and seconds, respectively
	int totalSec = 0;             // accumulator for total number of seconds   
	Scanner scanner = new Scanner (System.in);
 
            // prompt the user for input
	    System.out.println ("Please enter the number of hours.");
	    hours = scanner.nextInt();
	    
	    System.out.println ("Please enter the number of minutes.");
	    minutes = scanner.nextInt();

	    System.out.println ("Please enter the number of seconds.");
	    seconds = scanner.nextInt();
	    
	    // convert hours and minutes to seconds and add them to totalSec; add number of seconds to totalSec
	    totalSec = ((hours * 60) * 60) + (minutes * 60) + seconds;

	    // print the results
	    System.out.println (hours + " hours, " + minutes + " minutes, and " + seconds + " seconds are equivalent to " + totalSec + " seconds.");
    }
}
