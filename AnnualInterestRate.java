package chapterTwoExercizes;

import acm.program.*;
@SuppressWarnings("serial")

/*
 * This program will compute a final account balance based on an initial balance and
 * an annual interest rate
 */


public class AnnualInterestRate extends ConsoleProgram{
	public void run(){
		println("This program computes an account balance based on annual interest rate.");
		double balance = readDouble("Enter begining account balance: ");
		double rate = readDouble("Enter interest rate as a percentage: ");
		double endBalance = (balance * (rate/100)) + balance;
		double twoYearBalance = (endBalance * (rate/100)) + endBalance;
		println("The final balnce after one year is " + endBalance);
		println("The balance after two years will be " + twoYearBalance);
	}
}
