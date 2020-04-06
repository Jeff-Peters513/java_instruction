
import java.util.Scanner;

public class NameParserApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a name: ");
		String name = sc.nextLine();
		System.out.println();
		name = name.trim();
		// System.out.println(name);

		// split the name
		int idx1 = name.indexOf(" ");
		System.out.println(idx1);
		if (idx1 == -1) {
			System.out.println("Name not in valid format.");
		} else {
			int idx2 = name.indexOf(" ", idx1 + 1);
			System.out.println(idx2);
			if (idx2 == -1) {
				String firstName = name.substring(0, idx1);
				String lastName = name.substring(idx1 + 1);
				System.out.println("First Name: " + firstName);
				System.out.println("Last Name: " + lastName);
			} else {
				int idx3 = name.indexOf(" ", idx2 + 1);
				System.out.println(idx3);
				if (idx3 == -1) {
					String firstName = name.substring(0, idx1);
					String middleName = name.substring(idx1 + 1, idx2);
					String lastName = name.substring(idx2 + 1);

					System.out.println("First Name: " + firstName);
					System.out.println("Middle Name: " + middleName);
					System.out.println("Last Name: " + lastName);
				} else {
					System.out.println("Name not in valid format.");

				}
			}
		}

	}

}
