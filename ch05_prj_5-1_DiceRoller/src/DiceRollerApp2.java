import java.util.Scanner;

public class DiceRollerApp2 {

	
		// Welcome statement
	private static void displayWelcome(int limit) {
		        System.out.println("Dice Roller");
		        System.out.println();
		        System.out.println("Roll the dice? (y/n) ");
		    }
		public static void main(String[] args) {	
		
		// promt user
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		count = 1;
		while (choice.equalsIgnoreCase("y")) {
			// get the input from the user
			
			if (count = 1) {choice = askToRoll(sc);}
			else {choice = askToContinue(sc);}	
			count++;} 
		
		// business logic
		
		
		
		// display results etc..
		// Bye	
		System.out.println("Bye");
	}	
	public static String askToRoll(Scanner sc) {
		System.out.print("Roll Again? (y/n): ");
		String choice = sc.next();
		return choice;
	     }
	public static String askToContinue(Scanner sc) {
			System.out.print("Roll Again? (y/n): ");
			String choice = sc.next();
			return choice;
			}
	

}
