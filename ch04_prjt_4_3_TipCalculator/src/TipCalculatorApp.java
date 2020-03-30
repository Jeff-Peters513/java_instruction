import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		// welcome
		System.out.println("Tip Calculator\n");

		// prompt user for input
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// get the input from the user
			System.out.print("Cost of meal:   ");
			String subtotalString = sc.next();
			// declare BigDecimal numbers
			BigDecimal subtotal = new BigDecimal(subtotalString);
			BigDecimal percent15 = new BigDecimal("0.15");
			BigDecimal percent20 = new BigDecimal("0.20");
			BigDecimal percent25 = new BigDecimal("0.25");

			// business logic
			BigDecimal tip15 = subtotal.multiply(percent15);
			BigDecimal tip20 = subtotal.multiply(percent20);
			BigDecimal tip25 = subtotal.multiply(percent25);

			BigDecimal total15 = subtotal.add(tip15);
			BigDecimal total20 = subtotal.add(tip20);
			BigDecimal total25 = subtotal.add(tip25);

			// format results and display results
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			// percent.setMaximumFractionDigits(3);

			System.out.println();
			System.out.println(percent.format(percent15));
			System.out.println("Tip amount: " + currency.format(tip15));
			System.out.println("Total amount: " + currency.format(total15));
			System.out.println();
			System.out.println(percent.format(percent20));
			System.out.println("Tip amount: " + currency.format(tip20));
			System.out.println("Total amount: " + currency.format(total20));
			System.out.println();
			System.out.println(percent.format(percent25));
			System.out.println("Tip amount: " + currency.format(tip25));
			System.out.println("Total amount: " + currency.format(total25) + "\n");

			// prompt to continue/
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();

		}
		// bye
		sc.close();
		System.out.println("BYE!");
	}
}
