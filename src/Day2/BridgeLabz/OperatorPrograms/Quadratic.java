package Day2.BridgeLabz.OperatorPrograms;

import java.util.Scanner;

/*
 * This program is to find the roots of the equation a*x*x + b*x + c.
 * Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula delta = b*b - 4*a*c
 * 1. Root 1 of x = (-b + sqrt(delta))/(2*a)
 * 2. Root 2 of x = (-b - sqrt(delta))/(2*a)
 * Take a, b, and c as input values to find the roots of x.
 */

public class Quadratic {

	public static void main(String[] args) {
		/*
		 * Taking input from users a, b, c.
		 */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for a: ");
        double a = sc.nextDouble();

        System.out.println("Enter the value for b: ");
        double b = sc.nextDouble();

        System.out.println("Enter the value for c: ");
        double c = sc.nextDouble();
        
        /*
         *  compute delta
         *  delta = b*b - 4*a*c
         */

        double delta = (Math.pow(b,2) - (4 * a * c));
        System.out.println("Delta: "+delta);
        
        /*
         * 	roots
         * Root 1 of x = (-b + sqrt(delta))/(2*a)
         * Root 2 of x = (-b - sqrt(delta))/(2*a)
         */
        
        double firstRoot = (-b + (Math.sqrt(delta))/(2*a));
        double secondRoot = (-b - (Math.sqrt(delta))/(2*a));
        System.out.println("Roots are :: "+ firstRoot +" and "+secondRoot);


	}

}
