package kosa.api;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 20);
		Person p2 = new Person("ȫ�浿", 20);
		
		if(p1.equals(p2)) {
			System.out.println("tt");
		} else {
			System.out.println("ff");
		}
	}

}
