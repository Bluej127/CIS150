package chapter2;

import java.util.Scanner;

/*
 * Class: CIS150-E-Computer Science I
 * Instructor: Jeffery Thompson
 * Description: Dinner Bill calculator
 * Due: 10/06/2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Lennart Doiron
 */
public class Pgm10LD {

	public static void main(String[] args) {
		
		//Prompts user to give price of their bill
		Scanner getBill = new Scanner(System.in);
		System.out.print("Price of bill: ");
		double bill =  getBill.nextDouble();
		
		//Prompts user to give percentage they want to tip
		Scanner getTip = new Scanner(System.in);
		System.out.print("Percentage to tip: ");
		double tip =  getTip.nextDouble();
		
		//Calculates the amount to tip and prints it to user
		double amountToTip = tip * 0.01 * bill;
		System.out.print("Amount to tip: ");
		System.out.println(amountToTip);
	}

}
