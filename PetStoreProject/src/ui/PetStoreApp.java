package ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import business.Movie;
import business.Pet;
import uit.Console;

public class PetStoreApp {
	// initialize an arrayList
	private static List<Pet> inventory = new ArrayList<>();

	public static void main(String[] args) {
		// use other code from previous projects and examples like
		// Bmdb console app and wizard inventory project/app

		// Welcome
		System.out.println("Welcome to the Pet Store App!\n");

		displayMenu();

		// start loop
		// initialize inventory ArrayList with 2+ pets
		// (int id, String type, String species, String name, int age)
//		inventory.add(1, "feline" , "cat", "Dutch", 7);
//		inventory.add(2, "canine" , "dog", "Finn", 8);
//		inventory.add(3, "fish" , "goldfish", "wanda", 1);

		String command = "";
		// Start loop
		while (!command.equalsIgnoreCase("exit")) {

			// prompt user
			command = uit.Console.getString("Command: ", true);

			// business logic
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
				// adopt - remove pet from inventory remove(object)
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
		// display results
	}

	private static void adoptPets() {
		// drop pet from inventory
		int itemNumber = uit.Console.getInt("Id of pet to adopt: ", 0, inventory.size()+1);
		Pet Pet = inventory.remove(itemNumber-1);
		System.out.println(itemNumber +" was dropped.");
	}

	private static void addPets() {
		// add pet to inventory
		// (int id, String type, String species, String name, int age)
		int id = Console.getInt("ID?: ", 0, (int) Double.POSITIVE_INFINITY);
		String type = Console.getString("Type?: ", true);
		String species = Console.getString("Species?: ", true);
		String name = Console.getString("Name?: ", true);
		int age = Console.getInt("Age?: ", 0, (int) Double.POSITIVE_INFINITY);
		
		// add a couple of pets
		Pet p1 = new Pet();
		p1.setId(1);
		p1.setType("canine");
		p1.setSpecies("dog");
		p1.setName("Finn");
		p1.setAge(8);
		
		Pet p2 = new Pet();
		p2.setId(2);
		p2.setType("fish");
		p2.setSpecies("goldfish");
		p2.setName("Wanda");
		p2.setAge(5);
		
		inventory.addAll((Collection<? extends String>) p1);
		
		
		

	}
	

	private static void listPets() {
		// list all pets in inventory
		// get list of all movies
//				List<Movie> movies = movieRepo.list();
//				// display to screen
//				for (Movie m : movies) {
//					System.out.println(m);
//				}
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