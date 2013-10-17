//matt knicos
//mknicos@gmail.com

import acm.program.*;
import acm.graphics.*;


// This program will build a checkerboard. The code is from Stanford's CS106A class. Its is 
// translated here to help me go through it line by line and to practice for loops. The most
// difficult part for me to understand was how to fill in the correct boxes. I like the
// idea of using even on odd for determining this.


@SuppressWarnings("serial")

public class CheckerboardBuilder extends GraphicsProgram{
	
// Number of rows on the board
	private static final int NUM_ROWS = 8;

// Number of columns on the board
	private static final int NUM_COLUMNS = 8;

	public void run(){
		int sqrSize = getHeight() / NUM_ROWS;
		for (int i = 0; i < NUM_ROWS; i ++){
			for (int j = 0; j < NUM_COLUMNS; j ++){
				double x = i * sqrSize;
				double y = j * sqrSize;
				GRect square = new GRect( x , y , sqrSize, sqrSize);
				square.setFilled((i+j) % 2 != 0);
				add(square);
			}
		}
	}
}
