import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome to the Guess the Number Game!");
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println();
		System.out.println("I'm thinking of a nunber form 1 to 100.");
		System.out.println("Try to guess it.");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equals("y")) {
			// -loop 1 - game
			// generate the int rndNbr #, int count
			int count = 0;
			int rndNbr = (int) (Math.random() * 100) + 1;
			// test line -- System.out.println("the # = "+rndNbr);
			
			// start game message
			int guess = 0;
			while (guess != rndNbr) {
				// loop 2 - prompt and compare to random #
				// prompt for user input
				guess = getIntWithinRange(sc, "Enter Number:  ", 0, 101);
				count++;
				// int guess = ??
				// business logic + display results - in loop
				int diff = guess - rndNbr;
				String msg = "";
				// compare guess to rndNbr - determine high low
				System.out.println();
				if (diff < -10) {
					msg = "Way Too low!";
				} else if (diff < 0) {
					msg = "Too low!";
				} else if (diff > 10) {
					msg = "Way Too high";
				} else if (diff > 0) {
					msg = "Too high";
				} else {
					// user guessed it!
					break;
				}
				System.out.println(msg += " Guess again.");
				// display results - in loop
			}

			// loop 1 ends - user guesses the number
			// display results - final
			String msg = "You got it in " + count + " tries!\n";
			System.out.println();
			if (count <= 3) {
				msg += "Great work you are a mathematical wizard!";
			} else if (count <= 7) {
				msg += "Not too bad. You've got some potential.";
			} else {
				msg += "What took you so long? Maybe you should take some lessons.";
			}
			System.out.print(msg + "\n");
			
			choice = tryAgainPrompt(sc, "Try again? (y/n): ");
			
		}
		
		// Bye
		System.out.println("Bye");
		// sc.close();
	}

	// Data validation Rules:
	/// user entries must be intWithinRange
	// continue prompt only accepts "y" or "n"
	//
	private static String tryAgainPrompt(Scanner sc, String prompt) {
		String choice = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			choice = sc.next();
			if (choice.equals("y") || choice.equals("n")) {
			} else {
				System.out.println("Invaid choice. Try again.");
			}
		}

		return choice;
	}

	public static int getIntWithinRange(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i <= min) {
				System.out.println("Error! Number must be greater than " + min + ".");
			} else if (i >= max) {
				System.out.println("Error! Number must be less than " + max + ".");
			} else {
				isValid = true;
			}
		}
		return i;
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}
}