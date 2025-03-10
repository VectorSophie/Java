package kosa.phone;

public class Company extends PhoneBook {
	private String dept;
	private String position;
	
	public Company () {}
	
	public Company(String Name, String Number, String Birth, String dept, String postion) {
		super(Name, Number, Birth);
		this.dept = dept;
		this.position = postion;
	}

	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPostion() {
		return position;
	}
	public void setPostion(String postion) {
		this.position = postion;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("부서: " + dept);
		System.out.println("직급: " + position);
	}
}
