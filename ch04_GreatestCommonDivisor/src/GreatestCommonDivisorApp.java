import java.util.Scanner;

public class GreatestCommonDivisorApp {

	public static void main(String[] args) {
		//welcome
		System.out.println("Welcome to the Greatest Common Divisor App");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
						
		// while loop begins
		while (choice.equalsIgnoreCase("y")) {
			// prompt user for input - x, y
			System.out.print("Enter first number (x):");
			int x = sc.nextInt();
			System.out.print("Enter first number (y):");
			int y = sc.nextInt();
			
		//do business logic - euclidean algorism
		// do this until x == 0
			while (x > 0) {
				while (y >= x) {
					// subtract x from y
					y -= x;
					//y = y-x;
					}
				//swap values of X and y
				int hold = y;
				y = x;
				x = hold;
			}
			// y should be the gcd
			
				
		// display results - greatest common divisor
		System.out.println("Greatest common divisor: "+y);
		System.out.println();
		// loop ends
		System.out.print("Continue: ? (y/n)");
		choice = sc.next();
		System.out.println();
		}
		//  bye
		System.out.println("Bye");
		sc.close();
}
}
