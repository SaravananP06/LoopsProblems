package Day2.BridgeLabz.SwitchStatementPrograms;

import java.util.Scanner;

/*
 * This program user will input number and that number's month will get printed
 */

public class Month {

	public static void main(String[] args) {
		/*
		 * User input a number
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for month: ");
		int month = sc.nextInt();		
		
		/*
		 * Switch case loop
		 */
		switch (month)
        {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Enter valid month.");
        }
	sc.close();

	}

}
