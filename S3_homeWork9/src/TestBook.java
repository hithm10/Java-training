
public class TestBook {

	public static void main(String[] args) {
		Book[] books = new Book[5];
		books[0] = new BelletristikBook(1, "Harry potter", "j.k rolling", 80, true);
		books[1] = new RefrenceBook(2, "Lord of the ring", "g.r.r tolkin ", 160, "how to destroy the one ring");
		books[2] = new BelletristikBook(3, "Naruto", "masashi kishimoto", 120, false);
		books[3] = new BelletristikBook(4, "Sherlock holmes", "Arthur Conan Doyle", 95, true);
		books[4] = new CookBook(5, "Attack on titan", "Hajime Isayama", 80, "titan food");
		
		System.out.println("Books:\n------");
		for (int i = 0; i < books.length; i++) {
			System.out.print("   ");
			books[i].printDetails();
		}
		System.out.println("\nNumber of books on sale: " + countBookInSale(books));
	}
	
	// Count and return the amount of books that are on sale from array of books.
	public static int countBookInSale(Book[] bookArr) {
		int count = 0;
		for (int i = 0; i < bookArr.length; i++) {
			if(bookArr[i] instanceof BelletristikBook) {
				count += ((BelletristikBook)bookArr[i]).isForSale()?1:0;
			}
		}
		return count;
	}
}
