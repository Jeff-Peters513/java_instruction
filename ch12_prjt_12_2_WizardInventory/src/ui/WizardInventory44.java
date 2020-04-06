package ui;

public class WizardInventory44 {

	public static void main(String[] args) {
		//welcome
		System.out.println("The Wizard Inventory Game!\n");
		// create ArrayList of items - Items: ArrayList<String>
		
		//
		//
		//
		
		displayMenu();

	}



	private static void displayMenu() {
		StringBuilder menu = new StringBuilder("COMMAND MENU");
		menu.append("show - Show all Items\n");
		menu.append("grab - Grab (Add) an Item\n");
		menu.append("edit - Edit an Item\n");
		menu.append("drop - Drop (Delete) an Item\n");
		menu.append("Exit - Exit program\n");
		System.out.println(menu);
	}
	}