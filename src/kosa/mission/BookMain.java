package kosa.mission;

public class BookMain {
	public static void main(String[] args) {
		int total = 0;
		
		Book arr[] = {
				new Book(30000, "JAVA"),
				new Book(20000, "JSP"),
				new Book(15000, "Oracle")
		};
		
		for(Book b : arr) {
			b.print(b.DiscCal());
			total += b.DiscCal();
		}
		System.out.println("รั ฑÝพื: " + total);
	}
}