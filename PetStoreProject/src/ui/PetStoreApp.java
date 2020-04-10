package ui;

import java.util.ArrayList;
import java.util.List;
import business.Pet;
import uit.Console;

public class PetStoreApp {
	// initialize an arrayList
	private static List<Pet> inventory = new ArrayList<>();

	public static void main(String[] args) {
		// use other code from previous projects and examples
		// Welcome
		System.out.println("Welcome to the Pet Store App!\n");
		// display command menu
		displayMenu();

		// initialize inventory ArrayList with 2+ pets
		Pet p1 = new Pet(1, "canine", "dog", "Spot", 2);
		inventory.add(p1);
		Pet p2 = new Pet(2, "feline", "cat", "Flyod", 8);
		inventory.add(p2);
		Pet p3 = new Pet(3, "fish", "goldfish", "Wanda", 1);
		inventory.add(p3);

		String command = "";
		// Start loop
		while (!command.equalsIgnoreCase("exit")) {
			// prompt user
			command = uit.Console.getString("Command: ", true);

			// business logic and display results
			switch (command) {
			case "list":
				// list current inventory
				listPets();
				break;
			case "add":
				// add to current inventory add
				addPets();
				break;
			case "adopt":
				// adopt - remove pet from inventory
				adoptPets();
				break;
			case "exit":
				// exit and end game
				break;
			default:
				System.out.println("Invalid entry. Try Again.");
				break;
			}
			System.out.println();

		} // end loop

		// Bye
		System.out.println("\nBye!");

	}

// Methods used starts here
	private static void adoptPets() {
		// drop pet from inventory
		System.out.println("\nPet Adoption");
		System.out.println("------------");
		int itemNumber = uit.Console.getInt("Id of pet to adopt: ", 0, inventory.size() + 1);
		inventory.remove(itemNumber - 1);
		System.out.println(itemNumber + " was adopted.");
		System.out.println("Hurray another pet found thier forever home!!!");
	}

	private static void addPets() {
		// add pet to inventory
		// ref for sanity (int id, String type, String species, String name, int age)
		System.out.println("\nAdd a pet");
		System.out.println("-----------");
		int id = Console.getInt("ID?: ", 0, (int) Double.POSITIVE_INFINITY);
		String type = Console.getString("Type?: ", true);
		String species = Console.getString("Species?: ", true);
		String name = Console.getString("Name?: ", true);
		int age = Console.getInt("Age?: ", 0, (int) Double.POSITIVE_INFINITY);
		Pet p = new Pet(id, type, species, name, age);
		if (inventory.add(p)) {
			System.out.println("Pet successfully added");
		} else {
			System.out.println("Issue adding Pet.");
		}

	}

	private static void listPets() {
		// list all pets in inventory
		List<Pet> pets = inventory;

		System.out.println("\nPet Inventory");
		System.out.println("---------------");
		for (Pet p : pets) {
			System.out.println(p);
		}

	}

	private static void displayMenu() {
		StringBuilder menu = new StringBuilder("COMMAND MENU\n");
		menu.append("==========================\n");
		menu.append("list - list all pets\n");
		menu.append("add - add pet to inventory\n");
		menu.append("adopt - remove adopted pet from inventory\n");
		menu.append("exit - Exit the application\n");
		System.out.println(menu);
	}

}