package chapter2;

import java.util.Scanner;

/*
 * Class: CIS150-E-Computer Science I
 * Instructor: Jeffery Thompson
 * Description: Heartbeats
 * Due: 10/06/2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Lennart Doiron
 */
public class Pgm7LD {

	public static void main(String[] args) {
		
		//Ask user for to input age of death
		Scanner input = new Scanner(System.in);
		System.out.print("Age of death: ");
		double Years =  input.nextDouble();
		
		double Days = 365.25;
		
		double Hours = 24;
				
		//Calculates how many minutes in life
		double Minutes = Years * Days * Hours * 60;
		
		//calculates total heatbeats
		double Heartbeats = Minutes * 70;
		
		//Prints to user total heartbeats, printf to avoid scientific notation
		System.out.printf("Average number of heartbeats: %.0f", Heartbeats) ;

	}

}
