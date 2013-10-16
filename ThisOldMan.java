// Matt Knicos
// mknicos@gmail.com


import acm.program.*;

/*
 * The Art and Science of Java by Eric Roberts, Chapter 4, exercise 2
 * 
 * This program will print out the lyrics to "This Old Man", replacing numbers
 * and words in each verse to make each verse unique.
 */

@SuppressWarnings("serial")

public class ThisOldMan extends ConsoleProgram{
	public void run(){
		int startNum = 1;
		String verseWord = "";
		while(startNum <= 10){
			switch(startNum){
			case 1: verseWord = "thumb"; break;
			case 2: verseWord = "shoe"; break ;
			case 3: verseWord = "knee"; break ;
			case 4: verseWord = "door"; break ;
			case 5: verseWord = "hive"; break ;
			case 6: verseWord = "sticks"; break ;
			case 7: verseWord = "heaven"; break ;
			case 8: verseWord = "pate"; break ;
			case 9: verseWord = "spine"; break ;
			case 10: verseWord = "shin"; break ;
			}	
				println("This old man, he played " + startNum);
				println("He played knick-knack on my " + verseWord);
				println("With a knick-knack, paddy-whack,");
				println("Give your dog a bone.");
				println("This old man came rolling home");
			startNum ++;
			}
		}
	}
