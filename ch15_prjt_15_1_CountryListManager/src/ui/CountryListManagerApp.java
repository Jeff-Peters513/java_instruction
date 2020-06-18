package ui;

import java.util.List;

import business.CountryIO;
import business.DAO;
import util.Console;

public class CountryListManagerApp {

	 // declare class variables
    private static DAO<CountryIO> countryDAO = null;

    public static void main(String[] args) {
        // display a welcome message
        System.out.println("Country List Manager\n");

        // set the class variables
        countryDAO = new CustomerTextFile();

        // display the command menu
        displayMenu();

        // perform 1 or more actions
        String action = "";
        while (!action.equalsIgnoreCase("exit")) {
            // get the input from the user
            action = Console.getString("Enter menu number: ");
            System.out.println();

            if (action.equalsIgnoreCase("list")) {
                displayAllCustomers();
            } else if (action.equalsIgnoreCase("add")) {
                addCustomer();
            } else if (action.equalsIgnoreCase("del") || action.equalsIgnoreCase("delete")) {
                deleteCustomer();
            } else if (action.equalsIgnoreCase("help") || action.equalsIgnoreCase("menu")) {
                displayMenu();
            } else if (action.equalsIgnoreCase("exit")) {
                System.out.println("Bye.\n");
            } else {
                System.out.println("Error! Not a valid command.\n");
            }
        }
    }

    public static void displayMenu() {
        System.out.println("COMMAND MENU");
        System.out.println("list    - List countries");
        System.out.println("add     - Add a country");
        //System.out.println("del     - Delete a customer");
        //System.out.println("help    - Show this menu");
        System.out.println("exit"); //    - Exit this application\n");
    }

    public static void displayAllCustomers() {
        System.out.println("CUSTOMER LIST");

        List<Counrty> customers = counrtyDAO.getAll();
        Country c;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < counrty.size(); i++) {
            c = country.get(i);
            sb.append(StringUtils.padWithSpaces(
                    c.getName(), 27));
            sb.append(c.getEmail());
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void addCustomer() {
        String firstName = Console.getString("Enter first name: ");
        String lastName = Console.getString("Enter last name: ");
        String email = Console.getString("Enter customer email: ");

        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customerDAO.add(customer);

        System.out.println();
        System.out.println(firstName + " " + lastName
                + " has been added.\n");
    }

//    public static void deleteCustomer() {
//        String email = Console.getString("Enter email to delete: ");
//
//        Customer c = customerDAO.get(email);
//
//        System.out.println();
//        if (c != null) {
//            customerDAO.delete(c);
//            System.out.println(c.getName()
//                    + " has been deleted.\n");
//        } else {
//            System.out.println("No customer matches that email.\n");
//        }
//    }
}
