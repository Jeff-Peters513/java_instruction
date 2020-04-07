package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import util.Console;

public class WizardInventoryApp {
	// initialize an arrayList
	private static List<String> inventory = new ArrayList<>();

	public static void main(String[] args) {
		// welcome
		System.out.println("The Wizard Inventory Game!\n");
		
		//add the first 3 items into inventory
		inventory.add("wooden shoes");
		inventory.add("wizard hat");
		inventory.add("cloth shoes");
		
		String command = "";
		// Start loop
		while (!command.equalsIgnoreCase("exit")) {
			// display menu
			displayMenu();

			// prompt and collect user input
			command = Console.getString("Command: ", true);

			// business logic - going have to display in loop
			switch (command) {
			case "show":
				// show current inventory
				showItems();
				break;
			case "grab":
				// add to current inventory add
				addItem();
				break;
			case "edit":
				// edit name of current inventory item
				editItem();
				break;
			case "drop":
				// drop an item from inventory remove(object)
				dropItem();
				break;
			case "exit":
				// exit and end game
				break;
			default:
				System.out.println("Invalid entry. Try Again.");
				break;
			}
			System.out.println();
			// end loop
		}
		// Bye
		System.out.println("\nBye!");

	} // end static main

	private static void dropItem() {
		//delete item from inventory
		int itemNumber = uit.Console.getInt("Number: ", 0, inventory.size()+1);
		String droppedItem = inventory.remove(itemNumber-1);
		System.out.println( droppedItem +" was dropped.");
	}

	private static void editItem() {
		// edit / update/ change name of item
		int itemNumber = uit.Console.getInt("Number: ", 0, inventory.size()+1);
		String updatedName = Console.getString("Updated Name: ", true);
		inventory.remove(itemNumber-1);
		inventory.add(itemNumber-1, updatedName);
		System.out.println("Item number "+itemNumber+" was updated.");
	}

	private static void addItem() {
		// add items per user to inventory
		// max inventory is 4 items
		if (inventory.size() >= 4) {
			System.out.println("Cannot gran an item. Max limit (4) reached.");
		}
		else {
			String itemName = Console.getString("Name: ", true);
			inventory.add(itemName);
			System.out.println(itemName+" was added.");			
		}
	}

	private static void showItems() {
		// display inventory of items
		for (int i = 0; i < inventory.size(); i++) {
			// inventory position will be 1 more than array index number
			int itemNbr = i + 1;
			System.out.println(itemNbr + ". " + inventory.get(i));
		}
	}

	private static void displayMenu() {
		StringBuilder menu = new StringBuilder("COMMAND MENU\n");
		menu.append("show - Show all Items\n");
		menu.append("grab - Grab (Add) an Item\n");
		menu.append("edit - Edit an Item\n");
		menu.append("drop - Drop (Delete) an Item\n");
		menu.append("Exit - Exit program\n");
		System.out.println(menu);
	}

}
