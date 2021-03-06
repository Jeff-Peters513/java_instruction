import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodsToMyMadness {

	public static void main(String[] args) {
		// welcome statement
		System.out.println("Welcome");
		Scanner sc = new Scanner(System.in);
		String name = "Sam";

		printWelcomeMessage();
		printWelcomeMessage(name);
		printWelcomeMessage("Steven");
		
		// get int a
		int a = getValidInt("Enter Number 1: ", sc);
		// get in b
		int b = getValidInt("Enter Number 2: ", sc);

		System.out.println("Sum is " + sum(a, b));
		System.out.println("Differance is " + diff(a, b));
		System.out.println("Quotient is " + divide(a, b));
		System.out.println("Product is " + product(a, b));

		System.out.println("Bye");
	}

	private static int getValidInt(String prompt, Scanner sc) {
		int i = 0;
		while (true) {
			// print message to the user
			System.out.print(prompt);
			try {
				// get user input
				i = sc.nextInt();
				break;
			} catch (InputMismatchException ime) {
				// check if there's an exception
				System.out.println("Entry must be a whole number.");
				sc.nextLine(); // discard any input
			}

			// re-prompt if exception
			// return valid input
		}
		return i;

	}

	private static int product(int a, int b) {
		return a * b;
	}

	private static int divide(int a, int b) {
		return a / b;
	}

	private static int diff(int a, int b) {
		return a - b;
	}

	private static void printWelcomeMessage() {
		System.out.println("Welcome to my madness!");
	}

	private static void printWelcomeMessage(String name) {
		System.out.println("Welcome, " + name + ", to my madness!");
	}

	private static int sum(int n1, int n2) {
		return n1 + n2;

	}
}