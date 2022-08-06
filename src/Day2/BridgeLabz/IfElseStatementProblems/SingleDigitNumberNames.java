package Day2.BridgeLabz.IfElseStatementProblems;

import java.util.Scanner;
/*
 * This program we are taking input for single digit number
 * Printing the number name
 */

public class SingleDigitNumberNames {

	public static void main(String[] args) {
		/*
		 * Taking input from user
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any single digit number:- ");
		int n = sc.nextInt();
		
		/*
		 * For loop
		 */
		
		if (n == 1) {
			System.out.println("1 - ONE");
		}else if (n == 2) {
			System.out.println("2 - TWO");
		}else if (n == 3) {
			System.out.println("3 - THREE");
		}else if (n == 4) {
			System.out.println("4 - FOUR");
		}else if (n == 5) {
			System.out.println("5 - FIVE");
		}else if (n == 6) {
			System.out.println("6 - SIX");
		}else if (n == 7) {
			System.out.println("7 - SEVEN");
		}else if (n == 8) {
			System.out.println("8 - EIGHT");
		}else if (n == 9) {
			System.out.println("9 - NINE");
		}else {
			System.out.println("Invalid Input!!!");
		}
		
		

	}

}
