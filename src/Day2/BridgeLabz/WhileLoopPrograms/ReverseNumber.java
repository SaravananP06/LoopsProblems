package Day2.BridgeLabz.WhileLoopPrograms;

import java.util.Scanner;
/*
 * This program reverse the given number
 * Logic:
 * 1. First we find remainder of the given number
 * 2. Multiply the variable reverse by 10 and add the remainder into it.
 * 3. Divide the number by 10.
 * 4. Repeat the above steps until hte number becomes zero
 */

public class ReverseNumber {

	public static void main(String[] args) {
		/*
		 * Taking input from user
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse it:- ");
		int n = sc.nextInt();
		
		/*
		 * Variables
		 */
		int reverse = 0;
		
		/*
		 * Using while loop to reverse the number
		 */
		while(n != 0)   {
			int remainder = n % 10;  
			reverse = reverse * 10 + remainder;  
			n = n/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		
	}

}
