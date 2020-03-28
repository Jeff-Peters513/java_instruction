import java.util.Scanner;

public class ChangeCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. Welcome message
		System.out.println("Welcome to the Change Calculator");
		System.out.println();

		// --Start loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// 2. prompt for user input
			System.out.print("Enter number of cents (0-99)): ");
			int cents = sc.nextInt();
			System.out.println();

			/*
			 * int dimes = (int) (cents / 10); int pAD = (int) (cents % 25); int nickels =
			 * (int) (cents / 5); int pAN = (int) (cents % 25); int pennies = (int) (cents);
			 */
			int quarters = 0;
			int dAQ = 0;
			int nAD = 0;
			int pAN = 0;
		

			// how many quarters
			if (cents >= 25) {
				quarters = (int) (cents / 25);
			}
			// how many dimes
			if (cents >= 10) {
				dAQ = (int) ((cents - (quarters * 25)) / 10);
			}
			// home many nickels
			if (cents >= 5) {
				nAD = (int) ((cents - (quarters * 25) - (dAQ * 10)) / 5);
			} 
			if (cents >= 1) {
				pAN = (int) ((cents - (quarters * 25) - (dAQ * 10)) % 5);
			}

			// how many pennies
			// 3. business logic: compute hours and minutes

			// 4. display output
			String message = "" + "Quarters: " + quarters + "\n" + "Dimes: " + dAQ + "\n" + "Nickles: " + nAD + "\n"
					+ "Pennies: " + pAN + "\n";

			System.out.println(message);

			System.out.print("Continue? (y/n)");
			choice = sc.next();
			System.out.println();
			

		}
		// --end loop
		// 5. Bye
		System.out.println("Bye");
		sc.close();
	}

}
