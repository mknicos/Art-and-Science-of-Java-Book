//Matt Knicos
//mknicos@gmail.com

/*
 * This program builds upon a previously written program that adds integers. Instead of
 * only being able to add ten integers or three integers, by changing the constant
 * variable N_VALUES, you can adapt the program to work for any number of 
 * integers
 */


package chapterFour;
import acm.program.*;

@SuppressWarnings("serial")

/*
 * This was the first version of the code, which required a pre-determined and known
 * number of integers to be added.
 * 
 * 
public class AddingIntegers extends ConsoleProgram{
	public void run(){
		println("This program adds " + N_VALUES + " integers.");
		int total = 0;
		for (int i = 0; i < N_VALUES; i++){
			int value = readInt("Enter Integer: ");
			total += value;
		}
		println("The total is " + total + ".");
	}
	private static final int N_VALUES = 10;
}

*/


/*
 * In this version, the program can add any number of integers, using a sentinel to
 * stop the program on command.
 */

public class AddingIntegers extends ConsoleProgram {
	public void run(){
		println("This program adds integers");
		println("Enter the values, one per line.");
		println("When you are finished adding numbers, enter " + SENTINEL);
		int total = 0;
		while (true){
			int value = readInt("Enter Integer: ");
			if (value == 0) break;
			total += value;
		}
		println("The total is " + total);
	}
	private static final int SENTINEL = 0;
}























