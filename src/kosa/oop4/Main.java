package kosa.oop4;

public class Main {
	public static void main(String[] args) {
//		MyType fn = new MyType() {
//			@Override
//			public void hello() {
//				System.out.println("Hello?");	
//			}
//		};
//		fn.hello();
//
		MyType my2 =()->System.out.println("¶÷´Ù");
		my2.hello();
		
		YourType tu = message->System.out.println(message);
		tu.talk("fff");
		
		MyNumber mn = (num1,num2)->num1>num2 ? num1:num2;
		System.out.println(mn.getMax(10,5));
	}
}
