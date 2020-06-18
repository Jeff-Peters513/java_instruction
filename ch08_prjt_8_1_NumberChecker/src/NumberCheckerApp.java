
public class NumberCheckerApp {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome to the Odd/Even Checker!");
		System.out.println("");
		
		// create instance of MyConsole
		Console console = new Console();

		// biz logic; while loop
		String choice = "y";
				
		while (choice.equalsIgnoreCase("y")) {
			// get integer from user and response if it is even or odd
			int number = console.getInt("Enter an integer: ");

			// is number even or odd, ternary here
			String evenOdd = (number % 2 == 0) ? "even" : "odd";

			// display results
			System.out.println("The number " + number + " is " + evenOdd);

			// prompt user to continue?
			System.out.println("");
			choice = console.getString("Continue? (y/n): ");
			System.out.println("");
		}
		// Bye
		System.out.println("");
		System.out.println("Bye");

	}

}
