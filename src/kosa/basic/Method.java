package kosa.basic;

public class Method {
	
	public static int change (int num) {
		num +=10;
		return num;
	}
	
	public static void change2(int brr[]) {
		System.out.println(brr);
		brr[0] = 200;
	}
	
	public static void main(String[] args) {
		int arr[] = {100};
		change2(arr);
		System.out.println(arr);
		System.out.println(arr[0]);
	}
}
