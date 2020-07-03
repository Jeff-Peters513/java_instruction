package staircase;

public class StairCaseApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Staircase APP!");
		System.out.println();

		int n = 6;

		staircase(n);

	}// main

	static void staircase(int n) {
		// right justified staircase using spacing and #
//		String stair = "";
//		String sp = "";
//		String op = "";
		for (int k = 0; k <= n; k++) {
			String stair = "";
			String sp = "";
			String op = "";
			
			for (int i = 2; i <= k; i++) {
				sp += "_";
			}
			for (int j = k; j <= k; j++) {
				stair += "#";
			}
			op = sp + stair;
			System.out.println(op);
		}
		// build a single string spaces first then add #stairs

	}

}// class
