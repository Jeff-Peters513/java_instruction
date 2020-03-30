
public class PraticeForLoops {

	public static void main(String[] args) {
		// Just practice for loops
		
		String numbers ="";
		for (int i = 0; i <= 20; i++)
			{numbers += i +  " ";}
		System.out.println(numbers);
		
		System.out.println();
		System.out.println();
		int sum = 0;
		for (int i = 8; i > 0; i -= 2) {
			sum += i;}
		System.out.println(sum);
		System.out.println();
		
		int count = 7;
		count += 7;
		System.out.println(count);
		System.out.println();
		
		int sum5 = 0;
		int sum4 = 7;
		int nextNumber = 14;
		sum5 = sum4 + nextNumber;
		sum4 += nextNumber;
		System.out.println(sum4);
		System.out.println(sum5);
		
		
		
	}

}
