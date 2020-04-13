package ui;

public class FizzBuzzApp {

	public static void main(String[] args) {
		// FizzBuzz print out 1-100 to the console
		// but for factors of 3 and 5 print out fizz and buzz
		// Respectively and for number that are both 3 & 5 print out FizzBuzz

		for (int i = 1; i < 101; i++) {

			int nbr = i;
			if ((nbr % 3 == 0) && (nbr % 5 == 0)) {
				// if number is a factor of 3 & 5 print out FizzBuzz
				System.out.println("FizzBuzz");
			} else if ((nbr % 5 == 0)) {
				// else if number is a factor of 5 print out Buzz
				System.out.println("Buzz");
			} else if ((nbr % 3 == 0)) {
				// else if number is a factor of 3 print out Fizz
				System.out.println("Fizz");
			} else {
				System.out.println(nbr);
			}
		}
		// else if number is a factor of 3 print out Fizz
		// else print out number

	}

}
