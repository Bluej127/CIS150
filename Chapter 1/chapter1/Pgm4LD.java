package chapter1;
/*
 * Class: CIS150-E-Computer Science I
 * Instructor: Jeffery Thompson
 * Description: Write a program to display the population for each of the next five years.
 * Due: 09/29/2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Lennart Doiron
 */
public class Pgm4LD {
	
	public static void main(String[] args) {
		//Amount of people in original year 
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
		
		//Prints initial pop of year 2023
		//printf (%.0f is the format specifier) to avoid scientific notation
		System.out.printf("pop: %.0f", pop);
		System.out.println(" year: 2023");
		
		pop = pop+births-deaths+immigrants;
			
		//print pop of year 2024
		System.out.printf("pop: %.0f", pop); 
		System.out.println(" year: 2024");
		
		pop = pop+births-deaths+immigrants;
		
		//print pop of year 2025
		System.out.printf("pop: %.0f", pop);
		System.out.println(" year: 2025");
			
		pop = pop+births-deaths+immigrants;
			
		//print pop of year 2026
		System.out.printf("pop: %.0f", pop); 
		System.out.println(" year: 2026");
			
		pop = pop+births-deaths+immigrants;
		
		//print pop of year 2027
		System.out.printf("pop: %.0f", pop); 
		System.out.println(" year: 2027");
			
		pop = pop+births-deaths+immigrants;
		
		//print pop of year 2028
		System.out.printf("pop: %.0f", pop); 
		System.out.println(" year: 2028");
		}
}
