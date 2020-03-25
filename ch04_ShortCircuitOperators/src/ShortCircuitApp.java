import java.util.Scanner;

public class ShortCircuitApp {

	public static void main(String[] args) {
		
		System.out.println("Stop Light Approaching!!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("What color is the light (r,y,g)?  ");
		String light = sc.next();
		System.out.println("How far away is light (feet)? ");
		int feet = sc.nextInt();
		System.out.println("How fast are you going (mph)?  ");
		
		if (light.equalsIgnoreCase("r")) {
			// Light is red - stop
		}
		else if (light.equalsIgnoreCase("y") && feet < 30)
			
	
	}

}
