//*********************************************************************************
// automaticCupper.java
// Version 3.1
// Author: Hawk Weisman
// Last Modified: in olden days, before the Fall
//
// Simulates everybody's favourite Computer Science professor (in glorious double
// precision).
//
// Copyright 2012 Conjectural Technologies, Ltd.. All rights reserved.
//
//********************************************************************************

import java.util.Scanner;

public class automaticCupper {
    public static void main (String[] args) { // spelled wrong

	// have some wariables

	double phaseOfTheMoon;
	String phrase = "";

	Scanner scannah = new Scanner (System.in); // scannah


	System.out.println("\n");
        System.out.println("\"" + "Marnin! Please enter yer text to Cupperize." + "\"");
        String cupperize = scannah.nextLine();

	/*
	 * NOTE: this part is extremely bletcherous and there's probably a non-stupid way to do it,
	 * but I haven't come up with that yet.
	 */

	// I'm allowed to make up words 'cuz I'm the perfesser
	cupperize = cupperize.replace("v", "w");
	cupperize = cupperize.replaceAll("Java", "Javer");
	cupperize = cupperize.replaceAll("java", "javer");
	cupperize = cupperize.replaceAll("data", "dater");
	cupperize = cupperize.replaceAll("algorithm", "algerizm");
	cupperize = cupperize.replaceAll("smart", "schmart");
	cupperize = cupperize.replaceAll("Scanner", "scannah");
	cupperize = cupperize.replaceAll("rationale", "ration-ee-luh");
	cupperize = cupperize.replaceAll("GB", "gigerbyte");
	cupperize = cupperize.replaceAll("gigabyte", "gigerbyte");
	cupperize = cupperize.replaceAll("gb", "gigerbyte");
	cupperize = cupperize.replaceAll("megabyte", "megerbyte");
	cupperize = cupperize.replaceAll("extra", "extry");
	cupperize = cupperize.replaceAll("Hi", "Marnin");
	cupperize = cupperize.replaceAll("Hello", "Marnin");
	cupperize = cupperize.replaceAll("Morning", "Marnin");
	cupperize = cupperize.replaceAll("Good morning", "Marnin");
	cupperize = cupperize.replaceAll("You're", "Yer");
	cupperize = cupperize.replaceAll("you're", "yer");
	cupperize = cupperize.replaceAll("your", "yer");
	cupperize = cupperize .replaceAll("professor", "perfesser");

        System.out.println ("\n" + "\"" + cupperize + "\"");
	
        phaseOfTheMoon = Math.random();

	// values of beta will give rise to dom!
	    
        if (phaseOfTheMoon > 0.5) {
	    phrase = "go in peace, ";
	} else if (phaseOfTheMoon <= 0.5) {
	    phrase = "do good work, ";
	} else { 
	    System.out.println("Jerk! Math is broken, come back later.");
        }
	    
	System.out.print("\n" + "\"" + "Be well, " + phrase);
	
	for (int i = 0; i < 3; i++) {
	    System.out.print("and review");
	    if (i < 2) {
		System.out.print(", ");
	    } else {
		System.out.print("!" + "\"" + "\n" + "\n");
	    }
	}
    }
}