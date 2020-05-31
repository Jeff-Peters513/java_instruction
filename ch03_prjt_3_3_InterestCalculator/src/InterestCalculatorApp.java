import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		// welcome
		Scanner sc = new Scanner(System.in);
		//1. Welcome message
		System.out.println("Welcome to the Interest Calculator!");
		System.out.println();
		
		//--Start loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
			//2. prompt for user input
			System.out.print("Enter loan amount: ");
			double loanAmountString = sc.nextDouble();
			System.out.print("Enter interest rate: ");
			double inputRateString = sc.nextDouble();
						
			BigDecimal loanAmount = new BigDecimal(loanAmountString)
				.setScale(2, RoundingMode.HALF_UP);
			BigDecimal inputRate = new BigDecimal(inputRateString/100);
			
									
			//3. business logic: compute interestAmount
			BigDecimal interestAmount = loanAmount.multiply(inputRate);
			// display and format results
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMaximumFractionDigits(3);
			
			System.out.println();
			System.out.println("Loan amount: "+ currency.format(loanAmount));
			System.out.println("Interest rate: "+ percent.format(inputRate));
			System.out.println("interestAmount: "+ currency.format(interestAmount));
			System.out.println();
			
			
			
			// round to two decimal places
			NumberFormat number = NumberFormat.getInstance();
			number.setMaximumFractionDigits(2);
		
			
			//4. display output	
			System.out.println();			
			System.out.print("Continue? (y/n)");
			System.out.println();
			choice = sc.next();
			
		}
			//--end loop
			//5. Bye
		System.out.println("Bye");
		sc.close();
	}


	
	}


