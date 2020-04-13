package business;

public class Petz {
	// declare variables
	private int id;
	private String type;
	private String species;
	private String name;
	private int age;

	// generate constructors both fully loaded and empty
	public Petz(int id, String type, String species, String name, int age) {
		super();
		this.id = id;
		this.type = type;
		this.species = species;
		this.name = name;
		this.age = age;
	}

	public Petz() {
		// Explicitly initialize variables
		id = 0;
		type = " ";
		species = " ";
		name = " ";
		age = 0;
	}

	// generate setters and getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Petz [id=" + id + ", type=" + type + ", " + "species=" + species + ", name=" + name + ", age=" + age
				+ "]";
	}

}
