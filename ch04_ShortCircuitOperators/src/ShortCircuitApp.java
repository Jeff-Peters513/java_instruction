import java.util.Scanner;

public class ShortCircuitApp {

	public static void main(String[] args) {
		
		System.out.println("Stop Light Approaching!!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("What color is the light (r,y,g)?  ");
		String light = sc.next();
		System.out.println("How far away is light (feet)? ");
		int feet = sc.nextInt();
		
		
		if (light.equalsIgnoreCase("r")) {
			// Light is red - stop
			System.out.println("Stop! ");
		}
		else if (light.equalsIgnoreCase("y") && feet < 30) {
			System.out.println("Slow down to stop. ");
		}
		else {
			System.out.println("proceed safely. ");
		}
		
	}

}
