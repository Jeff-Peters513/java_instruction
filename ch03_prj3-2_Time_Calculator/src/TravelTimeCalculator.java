import java.util.Scanner;

public class TravelTimeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. Welcome message
		System.out.println("Welcome to the Travel Time Calculator");
		
		//--Start loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		
			//2. prompt for user input
			System.out.print("Enter mile: ");
			double mile = sc.nextDouble();
			
			System.out.print("Enter miles per hour: ");
			double mph = sc.nextDouble();
			//3. business logic: compute hours and minutes
						
			double minutesTraveled = (mile/mph)*60;
			int timeTraveledHours = (int)(minutesTraveled/60);
			int remainingMinutes = (int)(minutesTraveled%60);
		
			//4. display output	
			System.out.println("hours: "+ timeTraveledHours);
			System.out.println("minutes: "+ remainingMinutes);

			System.out.println("Estimated travel time");
			System.out.println("----------------------");
			System.out.println();
			System.out.println("Continue? (y/n)");
			choice = sc.next();
			
		}
			//--end loop
			//5. Bye
		System.out.println("Bye");
	}
	
	}


