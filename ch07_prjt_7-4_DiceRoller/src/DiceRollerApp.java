import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Dice Roller!");
		System.out.println("");

		// call Scanner
		Scanner sc = new Scanner(System.in);
		
		// prompt user to roll dice: Y or y
		String choice = Console.getString("Roll the dice? (y/n)");

		Dice dice = new Dice();

		while (choice.equalsIgnoreCase("y")) {
			// business logic sum the dice
			dice.roll();
			// display results = total and message for some results
			dice.printRoll();
			choice = Console.getString("Roll again? (y/n)");
		}

		// bye
		System.out.println("");
		System.out.println("Bye");
		System.out.println("");
		// close scanner resource
		sc.close();
	}

}
