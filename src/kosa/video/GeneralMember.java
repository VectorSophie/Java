package kosa.video;

import java.util.ArrayList;
import java.util.List;

import kosa.Relation.Course;

public class GeneralMember {
	private String memberId;
	private String memberName;
	private String memberAdd;
	private Video dvd;
	
	public GeneralMember() {}

	public GeneralMember(String memberId, String memberName, String memberAdd) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberAdd = memberAdd;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberAdd() {
		return memberAdd;
	}

	public void setMemberAdd(String memberAdd) {
		this.memberAdd = memberAdd;
	}
	
	public void rental(Video dvds) {
		this.dvd = dvds;
	}
	
	public void print() {
		System.out.println("회원 아이디: " + memberId);
		System.out.println("회원 이름: " + memberName);
		System.out.println("회원 주소: " + memberAdd);
		dvd.show();
	}
}
