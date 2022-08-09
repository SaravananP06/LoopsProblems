package Day2.BridgeLabz.OperatorPrograms;


/*
 * This program takes two int values m and d from the command line
 * prints true if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise
 */

public class SpringSeason {

	public static void main(String[] args) {
		/*
		 * Integer value in command line argument
		 */
		int d = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        /*
         * Taking boolean value with condition given in question
         */
        boolean isSpring =  (m == 3 && d >= 20 && d <= 31) || (m == 4 && d >=  1 && d <= 30) || (m == 5 && d >=  1 && d <= 31)|| (m == 6 && d >=  1 && d <= 20);

        System.out.println(isSpring);

	}

}
