
public class DiceRollerApp {

	public static void main(String[] args) {
		//welcome message
		System.out.println("Welcome to the Dice Roller!");
		
		// prompt user to roll dice: Y or y
		String choice = Console.getString("Roll the dice? (y/n)");
		
		while (choice.equalsIgnoreCase("y")) {
		// biz logic sum the dice
		Dice d = new Dice();
		d.roll();
				
		// display results = total and message for some results
		d.printRoll();
		choice = Console.getString("Roll again? (y/n)");
	}
		
		//bye
		System.out.println("Bye");
	}

}
