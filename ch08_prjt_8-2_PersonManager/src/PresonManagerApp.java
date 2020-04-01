
public class PresonManagerApp {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome to the Person Manager App!");
		
		// -- continue prompt start
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		//prompt user
			String type = Console.getString("Create customer or employee? (c/e):  ","c", "e");
		
			String fn = Console.getString("First Name: ", true);
			String ln = Console.getString("Last Name: ", true);
			
						
			//biz logic
			Person p;
			if (type.equalsIgnoreCase("c")) {
			// person is a customer
				String custNbr = Console.getString("Customer number:  ", true);
				Customer c = new Customer(fn,ln,custNbr);
				p = c;
			}else {
				//person is an employee
				String ssn = Console.getString("ssn:  ", true);
				Employee e = new Employee(fn,ln,ssn);
				p = e;
			 }
		//display
			System.out.println();
			System.out.println("You entered a new "+p.getClass().getName());
			System.out.println(p.toString());
			System.out.println();
			
			
		choice = Console.getString("Contiue? (y/n): ", "y", "n");
		//-- continue prompt end
		System.out.println();
		}
		// bye
		System.out.println("Bye!");
	}

}
