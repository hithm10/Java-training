
public class Book implements Printable {
	protected int catalogNum;
	protected String name;
	protected String author;
	protected int price;
			
	//constructor
	public Book(int catalogNum, String name, String author, int price) {
		this.catalogNum = catalogNum;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	// Getters / Setters
	public int getCatalogNum() {
		return catalogNum;
	}

	public void setCatalogNum(int catalogNum) {
		this.catalogNum = catalogNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//toString
	@Override
	public String toString() {
		return "Catalog number: " + catalogNum + " | Name: " + name + " | Author:  " + author + " | Price: " + price;
	}

	// implementing the function "printDetails" from the interface "Printable".
	// Print the details of the book.
	@Override
	public void printDetails() {
		System.out.println(this.toString());
	}

}
