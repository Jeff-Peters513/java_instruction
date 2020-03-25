
public class ForLoopApp {

	public static void main(String[] args) {
		
		System.out.println("Hello For Loops");
		System.out.println();
		System.out.println();
		
		System.out.println("Pay rent once a month");
		// once a month we'll pay rent
		System.out.println();
		for (int i= 1; i <= 12; i++) {
		// do this once per month
			System.out.println("Rent paid for month " + i);
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Score some hoops! 2 Pointers");
		for (int i=0;  i <= 20; i+=2) {
			System.out.println("Points = "+ i);
			System.out.println("Hoop scored!");
			
		}
		System.out.println();
		System.out.println();
		
		System.out.println("It's Monday.......booo....countdown to Friday!");
		for (int i=4; i>1; i--) {
				System.out.println(i + "days left ...boo!");
		}
		System.out.println("Yea! Friday!!!");
		
		System.out.println();
		System.out.println();
		
		int orders = 30;
		System.out.println("Let's process all " + orders +" orders");
		for (int i=1; i <= orders; i++) {
			System.out.println("Order Number "+ i +" placed");
		}
		System.out.println("All Oders processed.");
		
		System.out.println("Bye");
	
	}
}

