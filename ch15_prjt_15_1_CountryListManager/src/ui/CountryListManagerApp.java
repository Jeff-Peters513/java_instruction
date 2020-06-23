package ui;

import business.CountryIO;
import util.Console;

public class CountryListManagerApp {

	public static void main(String[] args) {
		// display a welcome message
		System.out.println("Welcome to the Country List Manager App! \n");

		CountryIO countryIO = new CountryIO();
		int menuNbr = 0;

		while (menuNbr != 3) {
			// start loop
			// display menu
			displayMenu();

			// prompt user for input
			menuNbr = Console.getInt("Enter menu action number:  ", 0, 4);
			System.out.println();

			// business logic
			// display results
			switch (menuNbr) {
			case 1:
				for (String country : countryIO.getCountries()) {
					System.out.println(country);
				}
				System.out.println();
				break;
			case 2:
				String country = Console.getString("Enter Country:  ", true);
				countryIO.addCountry(country);
				System.out.println("This country has been saved.");
				System.out.println();
				break;
			case 3:
				// do nothing, exit app
				break;

			} // end loop

		}
		System.out.println("Bye");
	}

	public static void displayMenu() {
		System.out.println("COMMAND MENU");
		System.out.println("====================");
		System.out.println("1 - List countries");
		System.out.println("2 - Add a country");
		System.out.println("3 -  exit");
	}

}
