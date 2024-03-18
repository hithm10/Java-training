import java.util.Scanner;

public class GetProductFactory {
	
	public Product getProduct(String productType) {
		Scanner input = new Scanner(System.in);
		switch(productType) {
			case "SecondHand":
				return new SecondHandProduct();
			case "FullPrice":
				return new FullPriceProduct();
			case "UpdatedPrice":
				return new UpdatedPriceProduct();
			default:
				System.out.println("Error!!!\nWrong input!");
				return null;
		}
	}
}
