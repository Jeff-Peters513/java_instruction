import java.text.NumberFormat;

public class BattingStatisticsApp {

	public static void main(String[] args) {
		// initialize variables
		int atBats =0;
		double slugPercent = 0;
		double batAverage = 0;
		int row = 0;
		// declare array
		String[][] table = new String[30][2];
		
		// welcome
		System.out.println("Welcome to the Batting Average Calculator");
				
		
		// prompt user - for # atBats
		
		// perform 1 or more calculations
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get the input from the user
			atBats = Console.getInt("Enter number of times at bat: ", 1, 30);
			// post a header for base achieved during that atBat
			System.out.println();
			String header = "0=out" + "1=single" +"2=double" +"3=triple" +"4=home run";
			System.out.print(header);
			   for (int i =0; i < atBats; i++ ) {
				int basesEarned = Console.getInt("Results for at-bat: ", 0, 4);	
				// format the values and store them in the array
				table[row][0] = row;
				table[row][1] = basesEarned;
				

				// increment the row counter
				row++;
			   }
				// see if the user wants to continue
				choice = Console.getString("Continue? (y/n): ");
				System.out.println();
		}
		// biz logic - flexible array for atBats
		// calculate batting average and slugging percentage
		
		// display results 
		// header for 
		//formate both average and slug percentage to three decimals
		// get the currency and percent formatters
		NumberFormat pf = NumberFormat.getPercentInstance();
		 pf.setMinimumFractionDigits(3);
		
		
		// bye
		System.out.println("Bye");
		

	//====================================================

			
			// calculate the future value
			double monthlyInterestRate = interestRate / 12 / 100;
			int months = years * 12;
			double futureValue = calculateFutureValue(monthlyInvestment, monthlyInterestRate, months);

			

			// format the result as a single string
			String results = "Monthly investment:\t" + currency.format(monthlyInvestment) + "\n"
					+ "Yearly interest rate:\t" + percent.format(interestRate / 100) + "\n" + "Number of years:\t"
					+ years + "\n" + "Future value:\t\t" + currency.format(futureValue) + "\n";

			// print the results
			System.out.println();
			System.out.println("FORMATTED RESULTS");
			System.out.println(results);

			
		}
		System.out.println("Future Value Calculations");
		System.out.println();
		String header = "Inv/Mo. Rate  Years  Future Value";
		System.out.println(header);
		for (int i = 0; i < row; i++) {
			String msg = "";
			for (int j = 0; j < 4; j++) {
				msg += table[i][j] + "\t";
			}
			System.out.println(msg);
		}

		System.out.println();
		System.out.println("Bye");
	}	

	}

}
