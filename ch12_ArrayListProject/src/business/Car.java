package business;

public class Car {
	private int id;
	private String make;
	private String model;

	// auto-generate constructor 
	public Car(int id, String make, String model) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
	}
 
	// generate getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	// auto generate toString

	@Override
	public String toString() {
		return "Car [id= " + id + ", make= " + make + ", model= " + model + " ]";
	} 

}
