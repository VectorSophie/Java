package kosa.oop3;

public class Main {
	public static void main(String[] args) {
		Student role = new Student();
		
		
		Manager manager = new Manager(role);
		manager.justdoit();
	}
}