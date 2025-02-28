package kosa.basic;

public class Except {
	
	public static void noEquals(int a, int b)throws Exception {
		if(a == b) {
			throw new Exception("f***"); 
			//a과 b가 exception 던짐
		}
	}

	public static void main(String[] args) {
		
		try {
			System.out.println("1");
			noEquals(10, 20);
			//exception 없음
			System.out.println("2");
		} catch (Exception e) {
			// exception 던지면 아래 코드 실행
			System.out.println("3");
			e.printStackTrace();
		} finally {
			//언제나 실행
			System.out.println("4");
		}
		System.out.println("5");
	}

}
