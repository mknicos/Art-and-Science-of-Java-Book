Matt Knicos
mknicos@gmail.com


import java.awt.Color;

import acm.program.*;
import acm.graphics.*;
/*
 * This program will draw a target such as one would use in Archery.
 * 
 * PROGRAMMING EXERCISE #6, Chapter 2
 */
public class DrawTarget extends GraphicsProgram {
	public void run(){
		GOval outterCircle = new GOval(300, 300, 300, 300);
		outterCircle.setFilled(true);
		outterCircle.setColor(Color.RED);
		
		GOval innerCircle  = new GOval(350, 350, 200, 200);
		innerCircle.setFilled(true);
		innerCircle.setColor(Color.WHITE);
		
		GOval bullsEye = new GOval(400, 400, 100, 100);
		bullsEye.setFilled(true);
		bullsEye.setColor(Color.RED);
		
		
		add(outterCircle);
		add(innerCircle);
		add(bullsEye);
	}

}