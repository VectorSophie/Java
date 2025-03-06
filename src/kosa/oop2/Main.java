package kosa.oop2;

public class Main {
	public static void main(String[] args) {
		MYSQLDao dao = new MYSQLDao();
		
		MyService service = new MyService(dao);
		service.insertService();
	}
}
