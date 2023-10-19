package chapter2;
/*
 * Class: CIS150-E-Computer Science I
 * Instructor: Jeffery Thompson
 * Description: Projected Population II
 * Due: 10/06/2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Lennart Doiron
 */
import java.util.Scanner;

public class Pgm6LD {

	public static void main(String[] args) {
		
		//Amount of people in original year 2023
		double pop = 334233854.0;
		
		//Amount of days in a year (including leap year)
		double days = 365.25;
		
		//Amount of seconds in a year
		double seconds = days * 24.0 * 60.0 * 60.0;
		
		//Amount of births in a year
		double births = seconds / 7.0;
		
		//Amount of deaths in a year
		double deaths = seconds / 13.0;
		
		//Amount of immigrants in a year
		double immigrants = seconds / 45.0;
		
		//Amount changed per year
		double popChange = births - deaths + immigrants;
		
		//New scanner to get user input
		Scanner input = new Scanner(System.in);
		
		//Asks user for requested year
		System.out.print("Enter Year: ");
		int year =  input.nextInt();
		
		//Calculates the difference between the years
		int yearChange = year - 2023;
			
		//Calculates what the final population would be
		double finalPop = yearChange * popChange + pop;
		
		//Prints total predicted pop of inputed year, printf to avoid scientific notation
		System.out.printf("pop: %.0f", finalPop); 
		System.out.println(" year: " + year);
	
	}
}
