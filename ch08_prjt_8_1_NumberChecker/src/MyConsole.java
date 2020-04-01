
public class MyConsole extends Console {
	
	@Override
    public boolean equals(Object object) {
    	if (object instanceof Product) {
    		Product product2 = (Product) object;
    		if (code.equals(product2.getCode()) &&
    			description.equals(product2.getDescription()) &&
    			price == product2.getPrice())
				{return true;
				}
    	}
		return false;
    }

}
