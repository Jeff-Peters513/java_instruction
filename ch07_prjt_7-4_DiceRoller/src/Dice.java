
public class Dice {

	private Die die1;
	private Die die2;

	public Dice() {
		super();
		die1 = new Die();
		die2= new Die();
	}

	public int getSum() {
		int sum = die1.getvalue() + die2.getvalue();
		return sum;
	}

	public void rool() {
		die1.roll();
		die1.roll();
	}

	public void printRoll() {
		// display 
		System.out.println("Total: "+getSum());
		// total and special message if nec
		if (getSum() == 2) {
			System.out.println("Snake Eyes!");
		}else if (getSum() == 6) {
				System.out.println("Box Cars!");
		}else if (getSum() == 7) {
					System.out.println("ojfjoiejf");
			}
		}
		
	
	}

