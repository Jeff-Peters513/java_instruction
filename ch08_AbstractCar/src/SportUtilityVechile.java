
public class SportUtilityVechile extends Car{

	private boolean thirdRow;
	private boolean offRoadCapable;
	
	//generate constructors
	public SportUtilityVechile() {
		super();
	}

	public SportUtilityVechile(String make, String model, int year, double mpg, boolean thirdRow,
			boolean offRoadCapable) {
		super(make, model, year, mpg);
		this.thirdRow = thirdRow;
		this.offRoadCapable = offRoadCapable;
	}

	public boolean isThirdRow() {
		return thirdRow;
	}

	public void setThirdRow(boolean thirdRow) {
		this.thirdRow = thirdRow;
	}

	public boolean isOffRoadCapable() {
		return offRoadCapable;
	}

	public void setOffRoadCapable(boolean offRoadCapable) {
		this.offRoadCapable = offRoadCapable;
	}

	@Override
	public String toString() {
		return super.toString() + "SportUtilityVechile [thirdRow=" + thirdRow + ", offRoadCapable=" + offRoadCapable + "]";
	}

	@Override
	public String getDisplayText() {
		// TODO Auto-generated method stub
		return make + " ";
	}
	
	
	
	
}
