package kosa.phone;

import java.io.Serializable;

public class Colleague extends PhoneBook implements Serializable {
	private String major;
	private String year;
	
	public Colleague(){}
	
	public Colleague(String Name, String Number, String Birth, String major, String year) {
		super(Name, Number, Birth);
		this.major = major;
		this.year = year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("전공: " + major);
		System.out.println("학번: " + year);
	}
}
