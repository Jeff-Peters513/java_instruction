
public class MyConsole extends Console {

	// constructor for MyConsole and calls in methods from Console as well
	public MyConsole() {
		super();
	}

	@Override
	public String getString(String prompt) {
		String s = "";
		boolean isValid = false;
		while (isValid == false) {
			s = super.getString(prompt);
			if (s.equals(" ")) {
				System.out.println("Error! This entry is required. Try again.");
			} else {
				isValid = true;
			}
		}
		return s;
	}

}
