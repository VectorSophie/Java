package kosa.oop3;

public class Main {
	public static void main(String[] args) {
		
		Person person = new Person("홍길동", new Role() {
			@Override
			public void doing() {
				System.out.println("은 운전중");
				}
		});
		person.doIt();
		
		
		Runnable r = () -> {
			for(int i=1;i<=10;i++) {
				try {
					Thread.sleep(1000);
				} catch(Exception e) {}
				System.out.println(i);
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
}