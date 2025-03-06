package kosa.oop3;

public class Student extends Role {
	String name = "홍길동";
	@Override
	public void doing() {
		System.out.println(name +" 은 공부 중");
	}

}
