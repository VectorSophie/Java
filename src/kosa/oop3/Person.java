package kosa.oop3;

public class Person {
	private String name;
	private	Role role;
	
	public Person() {}

	public Person(String name, Role role) {
		this.name = name;
		this.role = role;
	}
	
	public void doIt() {
		role.doing();
	}
}
