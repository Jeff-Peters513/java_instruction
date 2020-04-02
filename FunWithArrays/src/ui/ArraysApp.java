package ui;

import business.Product;
import uit.Console;

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

		System.out.println("  compute the average of the numbers array");
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("sum = " + sum);
		System.out.println("avg = " + sum / numbers.length);

		System.out.println("=======================");
		System.out.println("Find the product for a given code...");
		String code = Console.getString("Enter code: ");
		Product p = null;
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null) {
				if (products[i].getCode().equalsIgnoreCase(code)) {
					p = products[i];

				}
			}
		}
		System.out.println("Product is " + p);
		//

		System.out.println("=======================");
		System.out.println("find product at position / index...");
		int idx = Console.getInt("enter index position to retrieve:  ");
		Product pdt1 = products[idx];
		System.out.println("product found at position" + idx + ": " + pdt1);

		// enhanced for loop
		// print each product in the array if it is not null
		System.out.println("========enhanced for loop===============");
		for (Product pdt2 : products) {
			if (pdt2 == null) {
				System.out.println("Empty slot - ");
			} else {
				System.out.println(pdt2);
			}
		}
	}
}
