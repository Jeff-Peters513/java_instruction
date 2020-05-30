package business;

public class BasicCalculations {
	
	public static int square(int nbr) {
		return (nbr*nbr);		
	}
	
	public static int countA(String str) {
		// if a string contains an "a" or "A" count that letter and sum
		int count = 0;
		for (int i =0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i)=='a') {
				count++;
			}
		}
		return count;
	}
}
