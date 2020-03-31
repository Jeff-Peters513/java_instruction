
public class PrimitivesAndReferencesApp {

	public static void main(String[] args) {
		System.out.println("Welcome");
		
		System.out.println("primitive types");
		double p1 = 57.50;
		double p2 = p1;
		p1 = 45.50;
		System.out.println("p1="+p1);
		System.out.println("p2="+p2);

		System.out.println();
		Product product1 = new Product("java", "Murach's Java", 57.50);
		Product product2 = product1;
		Product product3 = new Product("java", "Murach's Java", 57.50);
		System.out.println("product1 == product2: "+ (product1 == product2));
		System.out.println("product1 == product2: "+ (product1 == product3));
		
		System.out.println("Bye");
		
		double p3 = 50.0;
		System.out.println();
		
	
	}

	
	
	
}

	private static void changeDouble(double d) {
		// 
		d *= 1.1;
				
	}	
	}
