package kosa.Oracle;

public class MyService {
	private Dao dao;
	
	public MyService(){}
	
	public MyService(Dao dao){
		super();
		this.dao = dao;
	}
	
	public void insertService() {
		dao.insert();
	}
}
