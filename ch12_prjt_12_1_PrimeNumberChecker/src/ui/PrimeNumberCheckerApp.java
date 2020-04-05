package ui;

import java.util.ArrayList;
import java.util.Collections;

import util.Console;

public class PrimeNumberCheckerApp {

	public static void main(String[] args) {
		// Welcome
		System.out.println("Prime Number Checker\n");

		// initialize variable
		int n;

		// start while loop to check once or more than once
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// prompt user
			String promptU = "Please enter an integer between 1 and 5000: ";
			n = Console.getInt(promptU, 0, 5001);

			// business logic use online code to find factors
			ArrayList<Integer> factors = new ArrayList<Integer>();
			// Skip two if the number is odd
			int incrementer = n % 2 == 0 ? 1 : 2;

			for (int i = 1; i <= Math.sqrt(n); i += incrementer) {

				// If there is no remainder, then the number is a factor.
				if (n % i == 0) {
					factors.add(i);

					// Skip duplicates
					if (i != n / i) {
						factors.add(n / i);
					}

				}
			}

			// number of factors
			// Sort the list of factors
			int big = factors.size();
			Collections.sort(factors);

			String msgP = n + " is a prime number.\n";
			String msgNotP = n + " is NOT a prime number.";
			// business logic use CheckPrime method found online
			if (CheckPrime(n)) {
				System.out.println(msgP);
			} else {
				System.out.println(msgNotP);
				System.out.println("It has " + big + " factors: " + factors + "\n");
			}

			// business logic part 2 - find and store factors for nonPrime #s

			// ask user to continue?
			choice = Console.getString("Try again (y/n): ");
			System.out.println();

		}
		// bye
		System.out.println("Bye");
	}
	// end loop

	public static boolean CheckPrime(int numberToCheck) {
		int remainder;
		for (int i = 2; i <= numberToCheck / 2; i++) {
			remainder = numberToCheck % i;
			// if remainder is 0 than numberToCheckber is not prime and break loop. Else
			// continue loop
			if (remainder == 0) {
				return false;
			}
		}
		return true;

	}

}
