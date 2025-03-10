package kosa.phone;

public class PhoneBook {
	private String Name;
	private String Number;
	private String Birth;

	public PhoneBook () {}
	
	public PhoneBook(String Name, String Number, String Birth) {
		super();
		this.Name = Name;
		this.Number = Number;
		this.Birth = Birth;
	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	public String getBirth() {
		return Birth;
	}

	public void setBirth(String birth) {
		Birth = birth;
	}

	public void show () {
		System.out.println("이름: " + Name);
		System.out.println("전화번호: " + Number);
		System.out.println("생년월일: " + Birth);
	}
}
