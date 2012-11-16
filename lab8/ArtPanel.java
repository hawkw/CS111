//*************************************************
// ArtPanel.java
// 
// Author: Hawk Weisman
// Based on: SplatPanel.java by Lewis/loftus
// Course: CS111: Intro to Computer Science I
// Fall Semester 2012-2013
// Laboratory #8
//
// Creates a panel containing something loosely
// resembling a work of art.
//************************************************


import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ArtPanel extends JPanel {

    private Rect r1, r2, r3, r4, r5, r6;      // six unique rectangles
    private Circle c1, c2, c3, c4, c5, c6;    // and six unique circles

    private final int SIZE_MAX = 200;  // maximum size of the smallest side of a rectangle
    private final int POS_MAX = 400;   // maximum x-value for the randomly generated position

    // random values for each rectangle
    private int random1, random2, random3, random4, random5, random6;
    Random random = new Random ();

    //----------------------------------------------
    // Constructor: creates six rectangles
    // and the circles which inhabit them.
    //----------------------------------------------
    public ArtPanel() {

	// random values for each rectangle
	random1 = random.nextInt (SIZE_MAX);
	random2 = random.nextInt (SIZE_MAX);
	random3 = random.nextInt (SIZE_MAX);
	random4 = random.nextInt (SIZE_MAX);
	random5 = random.nextInt (SIZE_MAX);
	random6 = random.nextInt (SIZE_MAX);


	// set up the rectangles
	r1 = new Rect (random1, random1 * 2, Color.cyan, random.nextInt(POS_MAX), random.nextInt (POS_MAX));
	r2 = new Rect (random2, random2 * 2, Color.magenta, random.nextInt(POS_MAX), random.nextInt (POS_MAX));
	r3 = new Rect (random3, random3 * 2, Color.yellow, random.nextInt(POS_MAX),  random.nextInt (POS_MAX));
	r4 = new Rect (random4 * 2, random4, Color.red, random.nextInt(POS_MAX), random.nextInt (POS_MAX));
	r5 = new Rect (random5 * 2, random5, Color.green, random.nextInt(POS_MAX), random.nextInt (POS_MAX));
	r6 = new Rect (random6 * 2, random6, Color.blue, random.nextInt(POS_MAX), random.nextInt (POS_MAX));

	// set up the circles linked to the horizontal rectangles
	c1 = new Circle (r1.getWidth(), Color.orange, r1.getX(), r1.getY());
	c2 = new Circle (r2.getWidth(), Color.white, r2.getX(), r2.getY() + (r2.getHeight() - r2.getWidth()));
	c3 = new Circle (r3.getWidth(), Color.pink, r3.getX(), r3.getY());

	//instantiate the circles linked to the vertical rectangles
	c4 = new Circle (r4.getHeight(), Color.lightGray, r4.getX(), r4.getY());
			 c5 = new Circle (r5.getHeight(), Color.gray,  r5.getX() + (r5.getWidth() - r5.getHeight()), r5.getY());
	c6 = new Circle (r6.getHeight(), Color.darkGray, r6.getX(), r6.getY());

	setPreferredSize (new Dimension (800, 900));
	setBackground (Color.black);
    }

    //-----------------------------------------------
    // paintComponent: draws this panel by requesting
    // that each shape draw itself.
    //-----------------------------------------------
    public void paintComponent (Graphics page) {

	super.paintComponent(page);

	r1.draw(page);
	r2.draw(page);
	r3.draw(page);
	r4.draw(page);
	r5.draw(page);
	r6.draw(page);

	c1.draw(page);
	c2.draw(page);
	c3.draw(page);
	c4.draw(page);
	c5.draw(page);
	c6.draw(page);
	
    }
}

	
		       
		       