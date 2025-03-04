package kosa.basic;

public class test {
	public static void main(String[] args) {
		String full = "Hello world";
		String greeting = full.substring(0,5);
		System.out.print("User: ");
		String user = Static.sc.nextLine();
		System.out.println(greeting + ", " + user+ "!");
		Static.sc.close();
	}
}
