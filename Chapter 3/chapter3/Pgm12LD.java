package chapter3;
/*
 * Class: CIS150-E-Computer Science I
 * Instructor: Jeffery Thompson
 * Description: Prompts the user to enter three integers and display the integers in non-decreasing order.
 * Due: 10/27/2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Lennart Doiron
 */
import java.util.Scanner;
import java.lang.Math;

public class Pgm12LD {

	public static void main(String[] args) {
		
		//Scanner to get input from user
		Scanner input = new Scanner(System.in);
		
		//Using scanner to get first number
		System.out.print("Number 1: ");
		int number1 = input.nextInt();
		
		//Using scanner to get second number
		System.out.print("Number 2: ");		
		int number2 = input.nextInt();

		//Using scanner to get third number
		System.out.print("Number 3: ");		
		int number3 = input.nextInt();
		
		
		/*Series of if else statements to determine which numbers 
		* are bigger than or equal to each other and prints them 
		* in a non decreasing order accordingly.
		*/
		if (number1 >= number2 && number2 >= number3) {
			
			System.out.print(number1 + ", " + number2 + ", " + number3);
			
		}
		
		else if (number1 >= number3 && number3 >= number2) {
			
			System.out.print(number1 + ", " + number3 + ", " + number2);
			
		}
		
		else if (number2 >= number1 && number1 >= number3) {
			
			System.out.print(number2 + ", " + number1 + ", " + number3);
			
		}
		
		else if (number2 >= number3 && number3 >= number1) {
			
			System.out.print(number2 + ", " + number3 + ", " + number1);
			
		}
		
		else if (number3 >= number1 && number1 >= number2) {
			
			System.out.print(number3 + ", " + number1 + ", " + number2);
			
		}
		
		else if (number3 >= number2 && number2 >= number1) {
			
			System.out.print(number3 + ", " + number2 + ", " + number1);
			
		}else {
			
			System.out.print(number2 + ", " + number3 + ", " + number1);
			
		}
	}
	
}
