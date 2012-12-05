//******************************************************
// DoorFrame.java
//
// Author: Hawk Weisman
// Course: CS111: Intro to Computer Science I
// Fall Semester 2012-2013
// Laboratory #12
//
// Demonstrates mouse events by displaying 'doors' that
// can be opened.
//******************************************************

import javax.swing.*;

public class DoorFrame {
	public static void main (String[] argv) {
		JFrame frame = new JFrame ("Doors!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new DoorPanel());
		frame.pack();
		frame.setVisible(true);
	}		
}