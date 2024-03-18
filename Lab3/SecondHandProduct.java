
public class SecondHandProduct extends Product {
	private double discount;

	public SecondHandProduct(double discount) {
		super();
		this.discount = discount;
	}
	
	public SecondHandProduct() {
		super();
		this.discount = 0.5;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public int getPrice() {
		return (int)(Math.round(price * discount));
	}

	@Override
	public String toString() {
		return "SecondHandProduct [" + super.toString() + ", discount=" + discount + "]";
	}
	
	
}
