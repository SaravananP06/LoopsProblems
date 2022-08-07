package Day2.BridgeLabz.ForLoopPrograms;
/*
 * This program taking input from user as n
 * Calculating sum from 1 to n number
 */
import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		/*
		 * Variables
		 */
       	int i = 1;
       	int sum = 0;
       	
		/*
		 * Taking input from users
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int n = sc.nextInt();
		
		/*
		 * Using For loop 
	     */
		for(i = 1; i <= n; i++) {
			sum = sum+i;
		}
		System.out.println("The sum from 1 to n number is " +sum);
	}
}
