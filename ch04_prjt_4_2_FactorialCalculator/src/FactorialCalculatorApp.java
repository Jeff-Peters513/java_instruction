import java.util.Scanner;

public class FactorialCalculatorApp {

	public static void main(String[] args) {
		// 1. Welcome
		System.out.println("Welcome to the Factorial Calculator\n");

		// 2. prompt user
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get input from user
			System.out.print("Enter an integer that's greater than 0 and less than 26:");
			long userNumber = sc.nextLong();

			// 3. business logic
			long factorialResuts = 1;
			for (int i = 1; i <= userNumber; i++) {
				factorialResuts *= i;
			}
			// 4. display
			System.out.println("The factorial of " + userNumber + " is " + factorialResuts + ".\n");

			// ask if user want to continue/
			System.out.println("Continue? (y/n)");
			choice = sc.next();
		}
		// 5. Bye
		System.out.println();
		System.out.println("Bye!");
		sc.close();
	}
}
