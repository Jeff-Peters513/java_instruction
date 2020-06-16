package ui;

import java.text.NumberFormat;

import util.Console;

public class BattingStatisticsApp {

	public static void main(String[] args) {
		// initialize variables
		int atBat = 0;
		//double slugPercent = 0;
		//double batAverage = 0;
		//int row = 0;
		// declare array
		// String[][] table = new String[30][2];

		// welcome
		System.out.println("Welcome to the Batting Average Calculator\n");

		// to perform 1 or more calculations - while loop needed
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get the input from the user - for # atBats
			atBat = Console.getInt("Enter number of times at bat: ", 0, 31);
			// post a header for base achieved during that atBat
			System.out.println();
			String header = "0=out " + "1=single " + "2=double " + "3=triple " + "4=home run";
			System.out.println(header);
			int[] results = new int[atBat];
			for (int i = 0; i < atBat; i++) {
				int result = Console.getInt("Results for at-bat: ", -1, 5);
				// format the values and store them in the array
				results[i] = result;
			}

			int atBatGreaterThanOne = 0;
			int basesEarned = 0;
			for (int result : results) {
				basesEarned += result;
				if (result > 0)
					atBatGreaterThanOne++;
			}
			// business logic
			double battingAvg = atBatGreaterThanOne / (double) atBat;
			double sluggingPct = basesEarned / (double) atBat;

			// display results
			NumberFormat nf = NumberFormat.getNumberInstance();
			//nf.setMaximumIntegerDigits(3);
			nf.setMaximumIntegerDigits(3);
			System.out.println();
			System.out.println("Batting Average: " + nf.format(battingAvg));
			System.out.println("Slugging percent: " + nf.format(sluggingPct)+ "%");
			System.out.println();

			// see if the user wants to continue
			choice = Console.getString("Another player? (y/n): ");
			System.out.println();

		}

		// bye
		System.out.println("Bye");

	}

}
