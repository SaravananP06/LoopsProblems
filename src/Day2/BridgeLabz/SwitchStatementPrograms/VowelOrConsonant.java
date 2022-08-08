package Day2.BridgeLabz.SwitchStatementPrograms;

import java.util.Scanner;

/*
 * This program find the given input character is vowel or consonant
 */

public class VowelOrConsonant {

	public static void main(String[] args) {
		/*
		 * Input user character
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any character:- ");
	    String ch = sc.nextLine();
	       
	       /*
	        * Switch case 
	        */
	       switch (ch) {
	       case "a":
           case "e":
           case "i":
           case "o":
           case "u":
               System.out.println(ch + " is vowel");
               break;
           default:
               System.out.println(ch + " is consonant");
	        }
		sc.close();
		

	}

}
