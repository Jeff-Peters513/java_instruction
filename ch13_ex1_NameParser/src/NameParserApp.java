
import java.util.Scanner;

public class NameParserApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a name: ");
		String name = sc.nextLine();
		System.out.println();
		// System.out.println(name);

		// split the name
		int length = name.length();
		int lastIdx = name.lastIndexOf(" ");
		int firstIdx = name.indexOf(" ");

		System.out.println("total length: "+length);
		System.out.println("last space: " + lastIdx);
		System.out.println("first space: "+ firstIdx);
		String[] nameParts = name.split(" ");
		String firstName = nameParts[0];
		int fLength = firstName.length();
		System.out.println(fLength);
		
		System.out.println("First name: "+firstName);

		if (lastIdx != 0) {
			String middleInitial = nameParts[1];
			System.out.println("Middle name: "+middleInitial);
		}
		if (lastIdx != firstIdx) {
			String lastName = nameParts[2];
			System.out.println("Last name: "+lastName);
		}

	}

}
