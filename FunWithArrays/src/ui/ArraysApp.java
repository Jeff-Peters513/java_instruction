package ui;

import business.Product;

public class ArraysApp {

	public static void main(String[] args) {
		System.out.println("define some arrays..");

		// an array of doubles
		double[] prices;
		prices = new double[10];

		// arrays start at an index of 0
		prices[0] = 14.99;
		prices[1] = 2.57;
		System.out.println("prices[0]= " + prices[0]);
		System.out.println("prices[1]= " + prices[1]);
		System.out.println("prices[9]= " + prices[9]);

		String[] names = new String[5];
		names[0] = "Sally";
		names[1] = "george";

		System.out.println();
		System.out.println("names[0]= " + names[0]);
		System.out.println("names[1]= " + names[1]);
		System.out.println("names[4]= " + names[4]);
		// System.out.println("names[5]= "+names[5]);
		System.out.println();

		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("numbers[0]= " + numbers[0]);
		System.out.println("numbers[8]= " + numbers[8]);
		System.out.println("numbers.length= " + numbers.length);
		System.out.println("all numbers");

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("numbers: " + i + "=" + numbers[i]);
		}
		System.out.println();
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.println("numbers: " + i + "=" + numbers[i]);
		}

		System.out.println("start at 0, count by 2..");
		for (int i = 0; i < numbers.length; i += 2) {
		}

		Product[] products = new Product[5];
		Product p1 = new Product("java", "Murach's Java programming", 57.50);
		Product p2 = new Product(".net", "Murach's c# and .Net Programming", 54.50);

		products[0] = p1;
		products[2] = p2;

		for (int i = 0; i < products.length; i++) {
			System.out.println("product[" + i + "]=" + products[i]);
		}

	}

}
