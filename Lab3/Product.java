
public abstract class Product {
	protected int price;

	public Product() {
		this.price = 100;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void calculateTotal (int units) {
		System.out.println("Total price: " + units * this.getPrice());
	}

	@Override
	public String toString() {
		return "price=" + price;
	}
	
}
