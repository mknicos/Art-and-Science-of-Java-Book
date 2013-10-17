//Matt Knicos
//mknicos@gmail.com


import acm.program.*;

@SuppressWarnings("serial")
/*The Art and Science of Java Chapter 4, EX 9
 * This program will compute and print out the Fibonacci Numbers. Instead of 
 * starting at one and ending at the constant variable, it will ask for user input and
 * display the corresponding number of Fibonacci Numbers.
 * Honestly, this was a lot of "code guessing" and testing until
 * it turned out to work. Something about the simplicity of the pattern
 * I couldn't wrap my head around.
 */
public class FibonacciCounting extends ConsoleProgram{
	public void run(){
		println("This program will print out the Fibonacci Numbers.");
		int fibNumEnd = readInt("How many Fibonacci Numbers would you like to print? ");
		int fNum1 = 0;
		int fNum2 = 1;
		int count = 0;
		int total = 0;
		println(fNum1);
		while(count <= fibNumEnd){
			total = fNum1 + fNum2;
			println(total);
			fNum1 = fNum2;
			fNum2 = total;
			count ++;
		}
	}
}
