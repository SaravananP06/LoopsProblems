package Day2.BridgeLabz.IfElseStatementProblems;

import java.util.Scanner;
/*
 * This program taking number input from user
 * Printing the rank of the number 
 */

public class NameOfDigits {

	public static void main(String[] args) {
		/*
		 * Taking input from user
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number from 1,10,100 1000 :- ");
		int n = sc.nextInt();
		
		/*
		 * for loop
		 */
		if (n == 1) {
			System.out.println("The number is Ones");
		}else if (n == 10) {
			System.out.println("The number is Tens");
		}else if (n == 100) {
			System.out.println("The number is Hundreds");
		}else if (n == 1000) {
			System.out.println("The number is Thousands");
		}else {
			System.out.println("Please enter 1 or 10 or 100 or 1000");
		}

	}

}
