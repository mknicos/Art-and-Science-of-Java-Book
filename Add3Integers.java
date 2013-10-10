Matt Knicos
mknicos@gmail.com

import acm.program.*; 

/*
 * This program will take three integers as input by the user and display their sum
 * 
 * PROGRAMMING EXERCISE #3 Chapter 2
 */
@SuppressWarnings("serial")

public class Add3Integers extends ConsoleProgram {
	
	public void run() {
		println("This program will add three integers.");
		int n1 = readInt("Enter n1: ");
		int n2 = readInt("Enter n2: ");
		int n3 = readInt("Enter n3: ");
		int total = n1 + n2 + n3;
		println ("The total is " + total + ".");
		
	}

}