// matt knicos
// mknicos@gmail.com

/*
 * This program is based on The Art and Science of Java by Eric S. Roberts
 * Chapter 4, Exercise 1
 * It will print to the screen the 99 bottles of beer song, in descending integers
 * Since 99 is a lot of verses to write out, I will make the Starting number of
 * "beers on the wall" variable, using a Constant Variable
 */


import acm.program.*;
@SuppressWarnings("serial")

public class BottlesOfBeer extends ConsoleProgram {
	public void run(){
		println("Lets sing a song together..");
		int startNum = INIT_NUM;
		while(startNum > 0){
		println(startNum + " bottles of beer on the wall,");
		println(startNum + " bottles of beer");
		println("Take one down, pass it araound,");
		startNum --;
		println(startNum + " bottles of beer on the wall");
		}
		
	}
	
	private static final int INIT_NUM = 6;
}
