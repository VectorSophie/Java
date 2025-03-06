package kosa.Oracle;

public class Main {
	public static void main(String[] args) {
		OracleDao dao = new OracleDao();
		
		MyService service = new MyService(dao);
		service.insertService();
	}
}
