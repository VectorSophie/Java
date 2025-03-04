package kosa.mission;

public class Member {
	private String name;
	private int age;
	private Member arr[];
	
	
	public Member (){}
	
	public Member (String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.arr = new Member [5];
	}
	public void print () {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);;
	}
}
