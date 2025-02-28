package kosa.mission;

public class BookMain {
	public static void main(String[] args) {
		Book JAVA = new Book(30000, "JAVA");
		Book JSP = new Book(20000, "JSP");
		Book Oracle = new Book(15000, "Oracle");
		
		JAVA.print(JAVA.DiscCal());
		JSP.print(JSP.DiscCal());
		Oracle.print(Oracle.DiscCal());
		System.out.println("รั ฑÝพื: " + (JAVA.DiscCal()+ JSP.DiscCal()+ Oracle.DiscCal()));
	}
}
