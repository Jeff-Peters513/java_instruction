package arrowhead;

import java.util.Scanner;

public class ArrowHeadApp {

	public static void main(String[] args) {
		// Coding Challenge 2 – Arrowhead [control statements]
//		This challenge involves the use of control statements. Prompt the user to provide the size of an
//		arrowhead. The app will print an arrowhead in the console, line by line, for the # of lines given by the
//		user… looking something like this:
//		&gt;
//		&gt;&gt;
//		&gt;&gt;&gt;
//		&gt;&gt;
//		&gt;
//		Note: if the user enters an even # you’ll need to add a row to accommodate the middle row, the tip of
//		the arrowhead.

		// Welcome
		System.out.println("Welcome to the ArrowHead App!");

		Scanner sc = new Scanner(System.in);

		// prompt user
		System.out.print("What size arrowhead would you like to see?: ");
		double nbrArrows = sc.nextDouble();

		// business logic
		// if odd number then print out number of lines = odd number
		// if even then add one line for the center per instructions

		double nbrLines = (nbrArrows % 2 == 0) ? nbrArrows + 1 : nbrArrows;
		double center = (nbrLines / 2) + 0.5;

		// display
		
		// following println's are for debugging
		// System.out.println(nbrLines);
		// System.out.println(center);

		// increase number of > per line until center line then decrease the number of >
		// until nbrArrows entered

		System.out.println();
		for (int i = 1; i <= center; i++) {
			displayLine(i);
		}

		for (double idx = (nbrLines - center - 1); idx >= 0; idx--) {
			displayLineDe(idx);
		}

		// bye
		sc.close();
		System.out.println("\n Bye!");

	}

	// methods to display results
	private static void displayLineDe(double idx) {
		String display = "";
		for (double i = idx; i >= 0; i--) {
			display += ">";
		}
		System.out.println(display);
	}

	private static void displayLine(int i) {
		String display = "";
		for (int idx = 1; idx <= i; idx++) {
			display += ">";
		}
		System.out.println(display);
	}
}
