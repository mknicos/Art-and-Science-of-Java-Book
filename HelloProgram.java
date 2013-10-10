/*Programming exercises from Chapter 2 THE ART AND SCIENCE OF JAVA BY ERIC ROBERTS
*/


/*This program displays "I Love Java" On the Screen as well as my name
*/

import acm.graphics.*;
import acm.program.*;

public class HelloProgram extends GraphicsProgram{
	public void run(){
		add(new Glabel("I Love Java", 100, 75))
		add(new Glabel("Matt Knicos", 400, 200))
	}
}