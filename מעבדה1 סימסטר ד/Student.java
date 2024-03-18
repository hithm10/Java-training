
public class Student {
	protected String name;
	protected String id;
	protected final int tuition = 10000;
	
	// Constructor
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}

	// Getters / Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTuition() {
		return tuition;
	}

	// toString
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", income=" + tuition + "]";
	}
}
