
public class Dice {

	private Die die1;
	private Die die2;

	public Dice() {
		super();
		die1 = new Die();
		die2 = new Die();
	}

	public int getDie1Value() {
		return die1.getvalue();
	}

	public int getDie2Value() {
		return die2.getvalue();
	}

	public int getSum() {
		int sum = die1.getvalue() + die2.getvalue();
		return sum;
	}

	public void roll() {
		die1.roll();
		die2.roll();
	}

	public void printRoll() {
		int total = getSum();
		// display
		System.out.println();
		System.out.println("Die 1: " + die1.getvalue());
		System.out.println("Die 2: " + die2.getvalue());
		System.out.println("Total: " + total);
		// total and special message if necessary
		switch (total) {
		case 2:
			System.out.println("Snake Eyes!");
			break;
		case 7:
			System.out.println("Craps!");
			break;
		case 12:
			System.out.println("Box cars!");
			break;
		}
		System.out.println();

	}

}
