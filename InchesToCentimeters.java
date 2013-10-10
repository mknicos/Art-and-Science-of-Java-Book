package chapterTwoExercizes;

import acm.program.*;

@SuppressWarnings("serial")
/*
 * This program will convert a given input of feet and inches in centimeters
 */

public class InchesToCentimeters extends ConsoleProgram {
	
	public void run() {
		println("This program converts feet to centimeters.");
		double feet = readDouble("Enter whole number of feet: ");
		double inches = readDouble("Enter number of inches: ");
		
		double cm = (feet * CM_PER_FEET) + (inches * CM_PER_INCH);
		
		println(feet + "ft and " + inches + "in is equal to " + cm + "cm");
	}
	
	private static final double CM_PER_INCH = 2.54;
	private static final double CM_PER_FEET = 30.48;
}
