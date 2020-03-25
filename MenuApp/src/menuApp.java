import java.util.Scanner;

public class menuApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		// demonstrate the use of a switch statement in a menu
		String choice = "";
		while (!choice.equalsIgnoreCase("x")) {
			// display the menu
			String menu = "MENU\n" +
						"==================\n" +
						"L - list all users\n" +
						"C - create a user\n" +
						"U - update user\n" +
						"D - delete a user\n"+
						"G - get a user\n" +
						"X - exit/n";
			System.out.println(menu);
			
			// get the user choice
			System.out.println("Enter letter from menu: ");
			choice = sc.next();
			
			// do something based on that choice
			switch (choice) {
			case "L":
			case "l":	
				System.out.println("Listing all users..all");
				break;
			case "C":
			case "c":	
				System.out.println("Creating a user...");
				break;
			case "U":
			case "u":	
				System.out.println("Updating a user...");
				break;
			case "D":
			case "d":
				System.out.println("Deleting a user...");
				break;
			case "G":
			case "g":
				System.out.println("Getting a user...");
				break;
			case "X":
			case "x":	
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid choice, try again.");
			}
		}
		sc.close();
	}
		
}
