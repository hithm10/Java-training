import java.util.Scanner;

public class TestCalculation {
	public static void main(String args[]) {
		GetProductFactory pFactory = new GetProductFactory();
		System.out.print("Enter name of product for which the bill will be generated: ");
		Scanner s = new Scanner(System.in);
		String pName = s.nextLine();
		System.out.print("Enter the number of units for bill will be calculated:");
		int units = s.nextInt();
		Product p = pFactory.getProduct(pName);
		// call getRate() method and calculate method .
		System.out.print("Bill amount for " + pName + " of " + units + " units is:");
		p.calculateTotal(units);
	}
}
