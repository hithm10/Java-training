

public class FamilyStudent extends Student {
	private int level;

	// Constructor
	public FamilyStudent(String name, String id, int level) {
		super(name, id);
		this.level = level;
	}

	// Getters / Setters
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	// Method override the super class's method.
	// Calculate students's tuition based on his family level.
	public int getTuition() {
		switch(this.level) {
		case 1:
			return (int) Math.round(tuition * 0.5);
		case 2:
			return (int) Math.round(tuition * 0.25);
		default:
			return 0;
		}
	}
	
	// toString
	@Override
	public String toString() {
		return "FamilyStudent" + super.toString() + ", level=" + level + "]";
	}
	
}
