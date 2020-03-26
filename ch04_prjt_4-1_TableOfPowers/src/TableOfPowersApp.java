import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {

		// 1. Welcome message
		System.out.println("Welcome to the Squares and Cubes Table");
		System.out.println();

		// --Start loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// 2. prompt for user input
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter an integer: ");
			int n = sc.nextInt();
			System.out.println();

			// 3. business logic: compute squares and cubes
			// perform sq and c from 1 to integer
			// use counter and loop from 1 to interger
			// 4. display output is combined with the while loop
			System.out.println("Number   " + " Squared   " + "Cubed");
			System.out.println("=====     =======   =====");

			int i = 1;
			int outPutL = n;
			while (i <= outPutL) {
				System.out.println((i) + "         " + (i * i) + "        " + (i * i * i));

				i++;

			}
			System.out.println();
			System.out.print("Continue? (y/n)");
			System.out.println();
			choice = sc.next();
		}

		// 5. Bye
		System.out.println("Bye");

	}
}
