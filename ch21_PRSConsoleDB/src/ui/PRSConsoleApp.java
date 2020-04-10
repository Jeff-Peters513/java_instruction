package ui;

import java.util.List;

import business.User;
import db.DAO;
import db.UserDB;
import uit.Console;

public class PRSConsoleApp {
	private static DAO<User> userRepo = new UserDB();

	public static void main(String[] args) {
		System.out.println("Welcome to the PRS Console");
		System.out.println();

		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			command = Console.getString("Command: ", true);
			switch (command) {
			case "list":
				listUsers();
				break;
			case "get":
				getUser();
				break;
			case "login":
				login();
				break;
			case "add":
				addUser();
				break;
			case "del":
				deleteUser();
				break;
			case "exit":
				break;
			default:
				System.out.println("Invalid entry");
				break;

			}
		}
		// Bye
		System.out.println("\nBye");
	}

	//TODO 
	private static void login() {
			if (userRepo instanceof UserDB) {
				UserDB ur = (UserDB)userRepo;
				String un = Console.getString("Username?: ", true);
				String pw = Console.getString("Password?: ", true);
				User u = ur.login(un, pw);
				if (u==null) {
					System.out.println("Invalid Login.");
				}
				else {
					System.out.println("User found: "+u);
				}
			System.out.println(); // line for space
			}
	}

	private static void getUser() {
		User u = promptIdAndReturnUser();
		System.out.println("User found: "+u);
	}

	private static User promptIdAndReturnUser() {
		User u = null;
		while (u == null) {
			int id = Console.getInt("User id?: ", 0, (int) Double.POSITIVE_INFINITY);
			u = userRepo.get(id);
			if (u == null) {
				System.out.println("no user found for id: " + id + ".");
				System.out.println();
			}
		}
		return u;
	}

	private static void deleteUser() {
		User u = promptIdAndReturnUser();
		if (userRepo.delete(u)) {
			System.out.println("User deleted.");
		}		
		else {
			System.out.println("Error deleting user.");
		}
		System.out.println();
		}

	private static void listUsers() {
		List<User> users = userRepo.list();

		System.out.println("List of users..");
		for (User u : users) {
			System.out.println(u);
		}

	}

	private static void addUser() {
		// prompt for all user fields
		String un = Console.getString("User Name: ", true);
		String pw = Console.getString("Password: ", true);
		String fn = Console.getString("First Name: ", true);
		String ln = Console.getString("Last Name: ", true);
		String pn = Console.getString("PhoneNumber: ", true);
		String e = Console.getString("Email?: ", true);
		// skip boolean fields for now
		User u = new User(un, pw, fn, ln, pn, e, false, false);
		if (userRepo.add(u)) {
			System.out.println("User successfully added");
		} else {
			System.out.println("Issue adding user.");
		}

	}

	private static void displayMenu() {
		System.out.println("\nCOMMAND MENU:");
		System.out.println("==============");
		System.out.println("list  - list all users");
		System.out.println("get   - get a user");
		System.out.println("login - login to app");
		System.out.println("add   - add user");
		System.out.println("del   - delete user");
		System.out.println("exit  - exit the app");
	}

}
