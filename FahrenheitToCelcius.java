/*matt knicos
mknicos@gmail.com
*/

package chapterTwoExercizes;

import acm.program.*;

@SuppressWarnings("serial")
/*THE ART AND SCIENCE OF JAVA BY ERIC S. ROBERTS
 * CHAPTER 3 Exercise 5
 * 
 *This program will ask for an input in Degrees Fahrenheit and output
 *the equivalent in degrees Celcius. The output is truncated to an integer for readability
 */

public class FahrenheitToCelcius extends ConsoleProgram{
	public void run(){
		println("This program converts Fahrenheit to Celsius");
		double f = readDouble("Enter degrees Fahrenheit: ");
		double c = (f - 32) * 5 / 9;
		println(f + " degrees Fahrenheit is equal to " + (int)c + " degrees Celcius.");
		
	}
}
