import java.text.NumberFormat;

public class MonthSelectorApp {

	public static void main(String[] args) {
		System.out.println("Monthly Sales\n");

		// declare monthNames and monthSales arrays
		String[] monthName = { "January", "Febuary", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		double[] monthSales = { 5000.43, 2345.99, 10000.01, 6000.6, 1899.0, 6987.33, 3489.22, 899.41, 9865.10, 7654.97,
				7652.88, 4321.66 };

		// get currency formatting
		NumberFormat currency = NumberFormat.getCurrencyInstance();

		// get one or more months
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get the input from the user
			int monthNumber = Console.getInt("Enter month number: ");

			// validate input
			if (monthNumber < 1 || monthNumber > monthName.length) {
				Console.displayLine("Invalid month number. Try again.");
				continue;
			}

			// get the index number for the month
			monthNumber--;
			// and display the month name and sales
             System.out.println("Sales for "+monthName[monthNumber]+": " + currency.format(monthSales[monthNumber]));			

			// check if the user wants to continue
			choice = Console.getString("\nContinue? (y/n): ");
			Console.displayLine();
		}

		// display the total sales for the year
		double sum = 0;
		for (int i = 0; i < monthSales.length; i++) {
			sum += monthSales[i];
		}
		System.out.println("Total Sales: " + currency.format(sum));

		Console.displayLine();
	}
}
