package ui;
import java.text.NumberFormat;

//import business.Account;
//import business.CheckingAccount;
//import business.SavingsAccount;
import business.*;
import uit.Console;

public class AccountBalanceApp {
	private static NumberFormat cf = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {
		// welcome msg + initialization
		// create savings and checking accounts with $1000 each
		System.out.println("Welcome to the Account Balance Calculator");
		SavingsAccount sa = new SavingsAccount(1000, 0.01);
		CheckingAccount ca = new CheckingAccount(1000, 1);

		// display initial balances
		System.out.println("Starting Balances");
		summarizeAccountBalances(ca, sa);
		System.out.println();
		System.out.println("");
		System.out.println();
		// start loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// get user input - loop through monthly transactions
			// transaction = w/d, c/s
			// transType: String
			// accountType: String
			// amount
			String transType = Console.getString("Withdraw or deposit? (w/d): ", "w", "d");
			String acctType = Console.getString("Checking or Savings? (w/d): ", "c", "s");
			double amount = Console.getDouble("Amount? ", 0, Double.POSITIVE_INFINITY);

			// biz logic
			// apply transaction to appr account
			Account a;
			if (acctType.equals("c")) {
				a = ca;

			} else {
				a = sa;
			}

			if (transType.equals("w")) {
				a.withdraw(amount);
			} else {
				a.deposit(amount);
			}

			// end loop - user enters n
			choice = Console.getString("Continue? (y/n):  ", true);
		}
		// calculate monthly payments and fees
		sa.applyPayment();
		ca.subtractMonthlyFee();

		// apply pmts and fees to balances
		System.out.println("Monthly Payments and Fees: ");
		System.out.println("Checking Fee: " + cf.format(ca.getMonthlyFee()));
		System.out.println("Savings Interest Payment: " + cf.format(sa.getMonthlyInterestPayment()));

		// Summarize pmt and fees
		// Summarize final balances
		System.out.println("Final Balances:");
		summarizeAccountBalances(ca, sa);

	}

	private static void summarizeAccountBalances(CheckingAccount ca, SavingsAccount sa) {
		System.out.println("Checking: " + cf.format(ca.getBalance()));
		System.out.println("Savings: " + cf.format(sa.getBalance()));

	}
}
