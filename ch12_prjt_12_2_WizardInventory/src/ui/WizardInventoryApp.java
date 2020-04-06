package ui;

import java.util.ArrayList;
import java.util.Scanner;

import util.Console;

public class WizardInventoryApp {

	public static void main(String[] args) {
		// welcome
		System.out.println("The Wizard Inventory Game!\n");

		// prompt user for initial input
		String menu = "COMMAND MENU\n" + "show - Show all items\n" + "grab - Grab an item\n" + "edit - Edit an item\n"
				+ "drop - Drop an item\n" + "exit - Exit program\n";
		System.out.println(menu);

		// initialize an arrayList
		ArrayList<String> inventory = new ArrayList<>(4);
		inventory.add(0, "wooden staff");
		inventory.add(1, "wizard hat");
		inventory.add(2, "cloth shoes");
		// inventory.add(3, "");

		Scanner sc = new Scanner(System.in);
		System.out.print("\nCommand: ");
		String request = sc.next();
		while (request.equalsIgnoreCase("show") || request.equalsIgnoreCase("grab") || request.equalsIgnoreCase("edit")
				|| request.equalsIgnoreCase("drop")) {

			switch (request) {
			case "show":
				// System.out.println(inventory.toArray());
				// show current inventory
				for (String s : inventory) {
					System.out.println(s);
				}

				break;
			case "grab":
				// add to current inventory add(index, object)
				System.out.println("Name: ");
				String pickUp = sc.next();
				inventory.add(pickUp);
				break;
			case "edit":
				// edit name of current inventory item
				System.out.println("Number: ");
				int itemNum = sc.nextInt();
				inventory.get(itemNum);
				System.out.println("Item number "+ itemNum +" was updated.\n");	
				break;
			case "drop":
				// drop an item from inventory - replace it with a blank? remove(object)
				// remove()
				System.out.println("Number: ");
				int drop = sc.nextInt();
				inventory.remove(drop);
				break;
			case "exit":
				// exit and end game
				break;

			}

			// prompt to continue/
			sc.nextLine();
			System.out.println("\nCommand: ");
			request = sc.next();
			
		
			

		}
		// Bye
		System.out.println("\nBye!");
	}
}
