import java.text.NumberFormat;
import java.util.Scanner;

public class TempConvertApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//1. Welcome message
		System.out.println("Welcome to the Temperature Converter");
		System.out.println();
		
		//--Start loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		
			//2. prompt for user input
			System.out.print("Enter degrees in Fahrenheit: ");
			double tempF = sc.nextDouble();
			
			//3. business logic: compute hours and minutes
						
			double tempC = (tempF - 32) * 5/9;
			// debug statement-> System.out.println("tempC before rounding " + tempC);
			
			// round to two decimal places
			NumberFormat number = NumberFormat.getInstance();
			number.setMaximumFractionDigits(2);
			String roundedTempC = number.format(tempC);
			
			//4. display output	
			System.out.println("Degrees in Celsius " + roundedTempC );
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


