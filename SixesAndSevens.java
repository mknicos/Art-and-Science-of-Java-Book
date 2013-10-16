// Matt Knicos
// mknicos@gmail.com


import acm.program.*;

/*The Art and Science of Java by Eric S Roberts
 * Chapter 4, Exercise 4
 * 
 * This program will display the integers between 1 and 100 that are divisible 
 * by either 6 or 7, but NOT both 6 and 7. This program uses the "for" loop.
 * After writing it, I'm wondering if there is a way to nest || && these blocks
 * and avoid the if/ elseif statements all together, so I will attempt that with
 * the next version. It just doesn't seem like the beset way to write this, however
 * it is successful at the task.
 */
@SuppressWarnings("serial")


public class SixesAndSevens extends ConsoleProgram{
	public void run(){
		println("This program will print out every number 1 through 100 that is");
		println("divisable by 6 and 7 but not both");
		for (int i = 1; i <= 100; i++ ){
			if ((i % 6 == 0) && (i % 7 == 0)){
				;
			} else if (i % 6 == 0){
				println(i);
			} else if (i % 7 == 0){
				println(i);
			} else {
				;
			}
		}
	}
}
