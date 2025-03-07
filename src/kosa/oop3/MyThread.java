package kosa.oop3;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args){
		MyThread my = new MyThread();
		Thread t = new Thread(my);
		t.start();
		System.out.println("¸ÞÀÎ");
	}
	
}
