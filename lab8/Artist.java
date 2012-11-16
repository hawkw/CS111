//*******************************************
// Artist.java
//
// Author: Hawk Weisman
// Based on: Splat.java by Lewis/Loftus
// Class: CS111: Intro to Computer Science I
// Fall Semester 2012 - 2013
// Laboratory #8
//
// Creates a panel containing something
// that loosely resembles art.
//******************************************

import javax.swing.*;
import java.awt.*;

public class Artist {
    public static void main(String[] args) {
	
	JFrame frame = new JFrame ("Have some art!");
	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	
	frame.getContentPane().add(new ArtPanel());

	frame.pack();
	frame.setVisible (true);
    }
}