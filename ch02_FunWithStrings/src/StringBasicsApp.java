

public class StringBasicsApp {

	public static void main(String[] args) {
		// creating a simple string
		String firstNameFull = "Jeffrey";
		String firstNamePrf = "Jeff";
		String middleName = "David";
		String lastName = "Peters";
		
		String name = "";
		name += firstNameFull;
		name += " "; //space
		name += middleName;
		name += " "; //space
		name += lastName;
		System.out.println(name);
		System.out.println("Preferred first Name: "+firstNamePrf);
		
			
	}

}
