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
		// spaces first then add "#" stairs

		for (int k = 1; k <= n; k++) {

			for (int i = 1; i <= n - k; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= k; i++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}

}// class
