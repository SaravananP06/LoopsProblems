package Day2.BridgeLabz.ForLoopPrograms;

import java.util.Scanner;

/*
 * This Program going palindrome number
 * Logic:
 * 1. Get the number to check for palindrome
 * 2. Hold the number in temporary variable
 * 3. Reverse the number
 * 4. Compare the temporary number with reversed number
 * 5. If both numbers are same, print "palindrome number"
 * 6. Else print "not palindrome number"
 */

public class PalindromeNumber {

	public static void main(String[] args) {
		/*
		 *  Objects of String class 
		 */
		String original, reverse = "";  
		
		/*
		 * Taking input from user
		 */
		Scanner in = new Scanner(System.in);   
	    System.out.println("Enter a string/number to check if it is a palindrome");  
	    original = in.nextLine();   
	    
	    int length = original.length(); 
	    
	    /*
	     * For loop find Palindrome number
	     */
	    for ( int i = length - 1; i >= 0; i-- )  {
	         reverse = reverse + original.charAt(i);
	    }
	    if (original.equals(reverse))  {
	    	System.out.println("Entered string/number is a palindrome.");  
	    } else { 
	    	System.out.println("Entered string/number isn't a palindrome."); 
	    }
	    
		
	}

}
