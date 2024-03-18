
public class UpdatedPriceProduct extends Product {
	private int update;

	public UpdatedPriceProduct() {
		super();
		this.update = (int)(Math.round(price * 0.1));
	}

	public int getUpdate() {
		return update;
	}

	public void setUpdate(int update) {
		this.update = update;
	}
	
	public int getPrice() {
		return (int)(Math.round(price * update));
	}

	@Override
	public String toString() {
		return "UpdatedPriceProduct [" + super.toString() + ", update=" + update + "]";
	}
	
	
}
