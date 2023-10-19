package chapter1;
/*
 * Class: CIS150-E-Computer Science I
 * Instructor: Jeffery Thompson
 * Description:Calculate pi
 * Due: 09/29/2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Lennart Doiron
 */
public class Pgm1LD {

	public static void main(String[] args) {
		/**
		 *  Calculates an approximation Pi out to a denominator of 13 and 15
		 */
		System.out.print("4 * (1 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1 / 13.0) = ");
		System.out.println(4 * (1 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1 / 13.0));
		System.out.print("4 * (1 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1 / 13.0 - 1.0 / 15.0) = ");
		System.out.println(4 * (1 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1 / 13.0 - 1.0 / 15.0));
	}

}
