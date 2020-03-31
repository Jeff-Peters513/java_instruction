
public class ContactListApp {

	public static void main(String[] args) {
		// welcome
		System.out.println("Welcome to the Contact List Application");
		
		//note: we are skipping the continue loop to save name!
		// prompt user, email, phone and first and last name
		String fn = Console.getString("Enter first name: ");
		String ln = Console.getString("Enter last name: ");
		String e = Console.getString("Enter email: ");
		String pn = Console.getString("Enter phone: ");
				
		// do Biz logic: create instance of Contact 
		Contact c = new Contact(fn,ln,e,pn);
		
		//display results per instructions
		System.out.println(c.displayContact());	
		
		// bye
		System.out.println("Bye");
		
	}

}
