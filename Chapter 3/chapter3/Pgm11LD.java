package chapter3;
/*
 * Class: CIS150-E-Computer Science I
 * Instructor: Jeffery Thompson
 * Description: A Mathematical Game
 * Chooses 2 random numbers between 0-10 and then chooses at random to Add, Subtract, or Multiply them
 * and tells if you if the answer you input is true or false.
 * Due: 10/27/2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Lennart Doiron
 */

import java.lang.Math;
import java.util.Scanner;

public class Pgm11LD {
	
	public static void main(String[] args) {
		
		//Max number
		int max = 10;
		
		//Minimum number
		int min = 0;
		
		//Range of numbers
		int range = max - min + 1;
		
		//Generates 2 random numbers using the range
		int number1 = (int)(Math.random() * range);
		
		int number2 = (int)(Math.random() * range);

		//Scanner for answer input
		Scanner input = new Scanner(System.in);
		
		//Generates random number to determine +, -, or *
		int number3 = (int) (Math.random() * 3) + 1; 		
		
		//if statement to determine if +
		if (number3 == 1) {
			
			System.out.print("What is " + number1 + " + " + number2 + "? ");
			
			//The answer = the number entered by user
			int answer = input.nextInt();
			
		    System.out.println(number1 + " + " + number2 + " = " + answer + " is " +(number1 + number2 == answer));
			}
			
		//else if statement to determine if -
		else if (number3 == 2) {
			
			//Asks user for answer
			System.out.print("What is " + number1 + " - " + number2 + "? ");
			
			//The answer = the number entered by user
			int answer = input.nextInt();
			
			System.out.println(number1 + " - " + number2 + " = " + answer + " is " +(number1 - number2 == answer));
			}
		
		//else to determine if *
		else {
			
			//Asks user for answer
			System.out.print("What is " + number1 + " * " + number2 + "? ");
			
			//The answer = the number entered by user
			int answer = input.nextInt();
			
			System.out.println(number1 + " * " + number2 + " = " + answer + " is " +(number1 * number2 == answer));
			}
		
		}
	
	}
