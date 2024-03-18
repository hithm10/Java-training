
public class CookBook extends Book {
	private String subject;

	//constructor
	public CookBook(int catalogNum, String name, String author, int price, String subject) {
		super(catalogNum, name, author, price);
		this.subject = subject;
	}
	
	// Getters / Setters
	public String getSubject() {
		return subject;
	}

	//toString
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "CookBook: " + super.toString() + " | Subject: " + subject;
	}
	
	
}
