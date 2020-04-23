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
	//Welcome
		System.out.println("Welcome to the ArrowHead App!");
		
		Scanner sc = new Scanner(System.in);
		
		//prompt user
		System.out.print("What size arrowhead would you like to see?: " );
		int nbrArrows = sc.nextInt();
		
		// business logic
		//if odd number then print out number of lines = odd number
		//if even then add one line for the center per instructions
			
		if (nbrArrows%2==0) {
			System.out.println("even "+(nbrArrows%2));
		}else if (!(nbrArrows%2==0)) {
			System.out.println("odd " +((nbrArrows%2==0)));
		}
		
		//display
		
		
		//bye
		System.out.println("Bye!");
		
		
		
		
		
		
	
	
	}

}
