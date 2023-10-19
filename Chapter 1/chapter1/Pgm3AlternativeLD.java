package chapter1;
/*
 * Class: CIS150-E-Computer Science I
 * Instructor: Jeffery Thompson
 * Description:Powers Table
 * Due: 09/29/2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Lennart Doiron
 */
public class Pgm3AlternativeLD {

	public static void main(String[] args) {
		/*
		 * Gets each number from 0 - 10
		 */
		for (int i=0;i<11;i++) {
			int ans = i;
				System.out.print(ans + " ");
				//Calculates i^1 to i^4
			for (int j=2;j<5;j++) {
				ans = i*ans;
				System.out.print(ans + " ");
			}
			System.out.println("");
		}
	}
}
