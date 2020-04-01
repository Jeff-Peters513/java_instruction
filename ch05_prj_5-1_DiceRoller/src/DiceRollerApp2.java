import java.util.Scanner;

public class DiceRollerApp2 {

	public static void main(String[] args) {
		// Welcome statement
		displayWelcome();
		final int SIDES1 = 6;
		final int SIDES2 = 6;
		
		// prompt user
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		int i = 1;
		while (choice.equalsIgnoreCase("y")) {
			// get the input from the user
			if (i <= 1) {
				choice = askToRoll(sc);
				i++;
				} else if (i > 1) {
				choice = askToContinue(sc);
				i++;
				}

				// business logic - call getRandomInt to get two dice #'s
			int die1 = getRandomInt(SIDES1);
			int die2 = getRandomInt2(SIDES2);
				
				// display results etc..
				System.out.println("Dice 1: " + die1 + "\n" +
						"Dice 2: " + die2 + "\n" +
						"Total: " +(die1+die2));
				
				if (die1 == 1 && die2 == 1) {
					System.out.println("Snake Eyes!");}
				if (die1 == 6 && die2 == 6) {
					System.out.println("Boxcars!");}
				System.out.println();
				}
		
		// Bye
		System.out.println("Bye");
	

}

		private static void displayWelcome() {
		System.out.println("Dice Roller");
		System.out.println();
	}

	public static String askToRoll(Scanner sc) {
		System.out.print("Roll the Dice? (y/n): ");
		String choice = sc.next();
		return choice;
	}

	public static String askToContinue(Scanner sc) {
		System.out.print("Roll Again? (y/n): ");
		String choice = sc.next();
		return choice;
	}

	public static int getRandomInt(int SIDES1) {
		double d = Math.random() * SIDES1; // d is >= 0.0 and < limit
		int randomInt = (int) d; // convert double to int
		randomInt++; // int is >= 1 and <= limit
		return randomInt;
	}

	public static int getRandomInt2(int SIDES2) {
		double d = Math.random() * SIDES2; // d is >= 0.0 and < limit
		int randomInt2 = (int) d; // convert double to int
		randomInt2++; // int is >= 1 and <= limit
		return randomInt2;
	}

	
	} // closes class


