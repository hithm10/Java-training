
public class BelletristikBook extends Book implements Saleable {
	private boolean forSale;
	
	//constructor
	public BelletristikBook(int catalogNum, String name, String author, int price, boolean forSale) {
		super(catalogNum, name, author, price);
		this.forSale = forSale;
	}

	// Getters / Setters
	public void setForSale(boolean forSale) {
		this.forSale = forSale;
	}
	
	//toString
	@Override
	public String toString() {
		return "BelletristikBook: " + super.toString() + " | " + (forSale?"":"not ") + "on sale" ;
	}

	// implementing the function "isForSale" from the interface "saleable".
	// return true if the book is for sale else return false.
	@Override
	public boolean isForSale() {
		return this.forSale;
	}

}
