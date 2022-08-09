package Day2.BridgeLabz.OperatorPrograms;

import java.util.Scanner;


public class ArithmeticOperation {

	public static void main(String[] args) {
		
		/*
		 * Taking input for variables a, b, c
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a: ");
		int a = sc.nextInt();
		System.out.println("Enter value for b: ");
		int b = sc.nextInt();
		System.out.println("Enter value for c: ");
		int c = sc.nextInt();
		
		/*
		 * Solving Arithmetic problems
		 * i) a+b*c 
		 * ii) c+a/b
		 * iii) a%b+c 
		 * iV) a*b+c
		 */
		int sol1 = a + b * c;
		System.out.println("a + b * c = " +sol1);
		int sol2 = c + a / b;
		System.out.println("c + a / b = " +sol2);
		int sol3 = a % b + c;
		System.out.println("a % b + c = " +sol3);
		int sol4 = a * b + c;
		System.out.println("a * b + c = " +sol4);
		
		
		int numbers[] = {sol1, sol2, sol3, sol4};
		
		/*
		 * Loop for finding maximum value
		 */
		int maxValue = numbers[0];
		for (int i = 1; i < numbers.length ; i++) {
			if (numbers[i] > maxValue) {
				maxValue = numbers[i];
			}
		}
		
		/*
		 * Loop for finding minimum value
		 */
		int minValue = numbers[0];
		for (int i = 1; i < numbers.length ; i++) {
			if (numbers[i] < minValue) {
				minValue = numbers[i];
			}
		}
		System.out.println("Minimum: " +minValue);
		System.out.println("Maximum: " +maxValue);
		

	}

}
