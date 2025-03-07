package kosa.oop4;

interface A{
	void abc();
}
class B{
	void bcd() {
		System.out.println("method b");
	}
}
public class Main2 {
	//public은 main만 쓸수 있음
	public static void main(String[] args) {
//		A a = new A(){
//			
//			@Override
//			public void abc() {
//				B b = new B();
//				b.bcd();	
//			}
//		};
//		a.abc();
//	}
	
		A a1 = () -> {
			B b = new B();
			b.bcd();
		};
		a1.abc();
	}
}
