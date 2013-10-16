// matt knicos
// mknicos@gmail.com

/*
 * This program is based on The Art and Science of Java by Eric S. Roberts
 * Chapter 4, Exercise 1
 * It will print to the screen the 99 bottles of beer song, in descending integers
 * However, 99 verses is a lot to write out. In the first version of this program
 * the number of verses was varied by a constant variable, however, in this version
 * the program will ask for users input as for where to start the song.
 */


import acm.program.*;
@SuppressWarnings("serial")

public class BottlesOfBeer extends ConsoleProgram {
	public void run(){
		println("Lets sing a song together..");
		println("We are going to sing the ever popular hit, 99 bottles of beer");
		println("But 99 takes such a long time :-(");
		int startNum = readInt("What number would you like the song to start at? ");
		while(startNum > 0){
		println(startNum + " bottles of beer on the wall,");
		println(startNum + " bottles of beer");
		println("Take one down, pass it araound,");
		startNum --;
		println(startNum + " bottles of beer on the wall");
		}
	}
}
