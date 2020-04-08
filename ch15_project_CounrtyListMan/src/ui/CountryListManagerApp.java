package ui;

import db.CountryIO;
import uit.Console;

public class CountryListManagerApp {

	public static void main(String[] args) {
		// welcome + initialization
		System.out.println("Country List Manager");
		System.out.println();
		CountryIO countryIO = new CountryIO();
		int menuNbr = 0;

		while (menuNbr != 3) {

			// -start loop
			// display menu
			displayMenu();
			// get user input
			menuNbr = Console.getInt("Enter menu number: ", 0, 4);
			System.out.println();

			// business logic
			switch (menuNbr) {
			case 1:
				for (String country : countryIO.getCountries()) {
					System.out.println(country);
				}
				System.out.println();
				break;

			case 2:
				String country = Console.getString("Enter Country: ", true);
				countryIO.addCountry(country);
				System.out.println("This country has been saved.");
				System.out.println();
				break;
			case 3:
				// do nothing and exit app
				break;

			// display results
			// -end loop
			}
		}
		// bye
		System.out.println("Goodbye");
	}

	private static void displayMenu() {
		System.out.println("COMMAND MENU: ");
		System.out.println("1 - List countries ");
		System.out.println("2 - Add country");
		System.out.println("3 - Exit");
	}

}
