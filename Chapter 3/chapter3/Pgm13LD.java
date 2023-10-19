package chapter3;
/*
 * Class: CIS150-E-Computer Science I
 * Instructor: Jeffery Thompson
 * Description: Prompts the user to enter the weight of the package and displays the shipping cost.
 * Due: 10/27/2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Lennart Doiron
 */

import java.util.Scanner;
import java.lang.Math;

public class Pgm13LD {

	public static void main(String[] args) {

		//Scanner to recieve input from user
		Scanner input = new Scanner(System.in);
		
		//Asks user in input package weight
		System.out.print("Package weight: ");
		double weight = input.nextInt();
		
		/*Series of if else statements to determine between what values 
		*the weight lies and the price it would be within that range. 
		*/
		if (0 < weight && weight <= 1) {
			
			System.out.println("Shipping cost 3.5");
		}
		
		else if (1 < weight && weight <= 3) {
			
			System.out.println("Shipping cost $5.5");
		}
		
		else if (3 < weight && weight <= 10) {
			
			System.out.println("Shipping cost $8.5");
		}
		else if (10 < weight && weight <= 30) {
			
			System.out.println("Shipping cost $10.5");
		}
		
		//If the weight is greater than 30 prints "Package cannot be shipped"
		else if (weight > 30) {
			
			System.out.println("Package cannot be shipped");
		}
		
		//If input is negative or 0 prints "Invalid input"
		else 
			
			System.out.println("Invalid input");
	}

}
