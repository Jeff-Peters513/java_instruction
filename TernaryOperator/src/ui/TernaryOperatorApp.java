package ui;

public class TernaryOperatorApp {

	public static void main(String[] args) {
		System.out.println("Red Light Green Light Game");
		// red light green light ...what to do?
		
		String lightColor = "red";
		System.out.println("light color is "+lightColor);
		String action = "";
		
		// set
		// -if else example
//		if (lightColor.equalsIgnoreCase("red")) {
//			action = "stop";
//			}
//		else {
//			action = "go";
//		}
		// ternary operator example
		action = lightColor.equalsIgnoreCase("red") ? "STOP" : "GO";
				
		System.out.println("Action is: "+action);
	}

}
