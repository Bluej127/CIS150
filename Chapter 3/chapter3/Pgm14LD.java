package chapter3;
/*
 * Class: CIS150-E-Computer Science I
 * Instructor: Jeffery Thompson
 * Description: Prompts the user to enter a year, month, and day of the month, and displays the name of the day of the week.
 * Due: 10/27/2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Lennart Doiron
 */
import java.util.Scanner;
import java.lang.Math;

public class Pgm14LD {

	public static void main(String[] args) {
		
		//Scanner to get input from user
		Scanner input = new Scanner(System.in);
		
		//Prompts user to enter the current year
		System.out.print("Enter year (e.g., 2015): ");
		int year = input.nextInt();
		
		//Prompts user to enter the current month
		System.out.print("Enter month 1-12: ");
		int month = input.nextInt();
		
		//Prompts use to enter day of the month 
		System.out.print("Enter day of the month 1-31: ");
		int day = input.nextInt();
		
		//If statement to make January (1) to = 13 
		if (month == 1) {
			
			month = 13;
		}
		
		//If statement to make February (2) to = 14
		if (month == 2) { 
			
			month = 14;

		}
		
		//Zeller's congruence algorithm to determine what day it currently is (Gives a value of 0 to 6)
		int dayOfWeek = (day + 26 * (month + 1) / 10 + (year % 100) + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) %7;

		//Series of if and print statements to tell the user what day of the week it is based on the value of dayOfWeek (0 to 6)
		if (dayOfWeek == 0) {
			
			System.out.println("Day of the week is Saturday");
		}
		
		if (dayOfWeek == 1) {
			
			System.out.println("Day of the week is Sunday");
		}
		
		if (dayOfWeek == 2) {
			
			System.out.println("Day of the week is Monday");
		}
		
		if (dayOfWeek == 3) {
			
			System.out.println("Day of the week is Tuesday");
		}
		
		if (dayOfWeek == 4) {
			
			System.out.println("Day of the week is Wednesday");
		}
		
		if (dayOfWeek == 5) {
			
			System.out.println("Day of the week is Thursday");
		}
		
		if (dayOfWeek == 6) {
			
			System.out.println("Day of the week is Friday");
		}
		
	}
}
