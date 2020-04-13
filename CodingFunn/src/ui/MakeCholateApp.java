package ui;

import uit.Console;

public class MakeCholateApp {

	public static void main(String[] args) {
		// Coding Challenge 1 - Make Chocolate [Logic, mathematical]
//		We want make a package of goal kilos of chocolate. We have small bars (1
//				kilo each) and big bars (5 kilos each). Return the number of small bars to
//				use, assuming we always use big bars before small bars. Return -1 if it can&#39;t
//				be done.
//				
//				makeChocolate(4, 1, 9) returns 4
//				makeChocolate(4, 1, 10) returns -1
//				makeChocolate(4, 1, 7) returns 2
		// Welcome
		System.out.println("Welcome to Make Chocolate App");

		// prompt user for number of big and small and goal
		int goal = 0;
		int small = 1;
		int big = 5;
		goal = Console.getInt("Enter the goal of chocolate to be made?");

		// business logic pass big small and goal to method
		int smallBars = makeChocolate(small, big, goal);

		// display results from method
		System.out.println("The number of small bars needed is " + smallBars + "!");

		// Bye
		System.out.println("BYE");

	}

	public static int makeChocolate(int small, int big, int goal) {
		
		
		
		return goal;
	}

}
