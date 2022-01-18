package ui;

public class MakingFoodApp {

	/*
	 * We want make a package of goal kilos of chocolate. 
	 * We have small bars (1 kilo each) and big bars (5 kilos each). 
	 * Return the number of small bars to use, assuming we always use 
	 * big bars before small bars. Return -1 if it can't be done.
	 */	
	
	
	public static void main(String[] args) {
		//chocolate bar challenge
		//1 Welcome 
		System.out.println("Welcome to Make chocolate App\n");
		
		//2 input from use if applicable
			
		//test cases given small(1) , large(5), goal
		//makeChocolate(4, 1, 9); 
		//makeChocolate(4, 1, 10); 
		//makeChocolate(4, 1, 7);
		//makeChocolate(4, 2, 12);
		makeChocolate(52, 0, 52);
		
		//3 business logic
		// see makeChocolate method
		
		//4 display result(s)
		
		
		
		//5 bye
		System.out.println("\nThanks for using the Make chocolate App");
		

	}// close of static main
	
	public static int makeChocolate(int small, int big, int goal) {
		//this is a subtraction problem to make goal lbs of chocolate with
		//given amount of small and big - if can not be reached the return -1
		int sBars =0;
		// subtract  amount of big from total
		int remainingW = goal - (5*big);
		if (remainingW >=0){
			sBars = remainingW;
			
			if (sBars <= small) {
			System.out.println("This Batch can be made - Small bars needed = "+sBars);
			} else {
				System.out.println(-1 + "  This batch can not be made!");
			}
			
		}
		return 1;
	}
	

}// close of class
