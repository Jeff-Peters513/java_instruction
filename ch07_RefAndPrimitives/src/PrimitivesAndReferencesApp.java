
public class PrimitivesAndReferencesApp {

	public static void main(String[] args) {
		System.out.println("Welcome");
		System.out.println();
		
		System.out.println("primitive types");
		double p1 = 57.50;
		double p2 = p1;
		p1 = 45.50;
		System.out.println("p1="+p1);
		System.out.println("p2="+p2);
		//primitives change value in memory as the program runs
		
		//objects point to a location in memory 
		//p1 and p2 point to same location in memory
		//p3 has same "value" but different location in memory		
		
		System.out.println();
		Product product1 = new Product("java", "Murach's Java", 57.50);
		Product product2 = product1;
		Product product3 = new Product("java", "Murach's Java", 57.50);
		System.out.println("product1 == product2: "+ (product1 == product2));
		System.out.println("product1 == product3: "+ (product1 == product3));
		
		System.out.println();
		
		
		// not used, for demonstration purpose
		double p3 = 50.0;
		
//		System.out.println();
//		System.out.println(product1.toString());
//		System.out.println(product2.toString());
		System.out.println();
		double p4 = changeDouble(p3);
		System.out.println("changeDouble " + p4);
		System.out.println();
		System.out.println("Bye");
	
	}

	private static double changeDouble(double d) {
		// 
		d *= 1.1;
		return d;
				
	}	
	}
