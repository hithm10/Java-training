
public class ScholarshipStudent extends Student {
	private int scholarship;

	// Constructor
	public ScholarshipStudent(String name, String id, int scholarship) {
		super(name, id);
		this.scholarship = scholarship;
	}

	// Getters / Setters
	public int getScholarship() {
		return scholarship;
	}

	public void setScholarship(int scholarship) {
		this.scholarship = scholarship;
	}
	
	// Method override the super class's method.
	// Calculate students's tuition based on his scholarship.
	public int getTuition() {
		return tuition - this.scholarship;
	}

	// toString
	@Override
	public String toString() {
		return "Scholarship" + super.toString() + ", scholarship=" + scholarship + "]";
	}
	
}
