//Matt Knicos
//mknicos@gmail.com

/*
 * This program builds upon a previously written program that adds three integers
 * and allows the program to add ten integers using loops.
 */


package chapterFour;
import acm.program.*;

@SuppressWarnings("serial")

public class AddingIntegers extends ConsoleProgram{
	public void run(){
		println("This program adds ten integers.");
		int total = 0;
		for (int i = 0; i < 10; i++){
			int value = readInt("Enter Integer: ");
			total += value;
		}
		println("The total is " + total + ".");
	}
}
