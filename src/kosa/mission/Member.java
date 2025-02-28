package kosa.mission;

public class Member {
	private String name;
	private int age;
	private Member arr[];
	
	
	public Member (){
		this.arr = new Member [5];
	}
	
	public Member (String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.arr = new Member [5];
	}
	
	public Member adduser (String addname, int addage, int i) {
		arr[i] = new Member(addname, addage);
		System.out.println(arr[i]+" 정보 받았습니다");
		return arr[i];
	}

	public Member[] getArr() {
		return arr;
	}

	public void setArr(Member[] arr) {
		this.arr = arr;
	}
}
