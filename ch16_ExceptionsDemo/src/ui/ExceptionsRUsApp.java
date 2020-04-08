package ui;

import java.util.InputMismatchException;

import util.ConsoleUtil;

public class ExceptionsRUsApp {

	public static void main(String[] args) {
		System.out.println("hi");

		try {
			double d = ConsoleUtil.getDouble("Enter a double: ");
		} catch (InputMismatchException ime) {
			System.out.println("Error gettomg yearly interest rate.");

		}

		System.out.println("bye");

	}

}
