import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter numeric Grade: ");
			int numericGrade = sc.nextInt();
			String letterGrade = "";
			
			if (numericGrade >= 88) {
				letterGrade = "A";
			}
			else if (numericGrade >= 80) {
				letterGrade = "B";
			}			
			else if (numericGrade >= 67) {
				letterGrade = "C";
			}			
			else if (numericGrade >= 60) {
				letterGrade = "D";
			}			
			else {
				letterGrade = "F";
			}			
			// display out put
			System.out.println("Letter Grade: " +letterGrade);
			System.out.println("Continue? ");
			choice = sc.next();
		}
		
		
		
		System.out.println("Bye");

	}

}
