package kosa.video;

import java.util.ArrayList;
import java.util.List;

import kosa.Relation.Course;

public class GeneralMember {
	private String memberId;
	private String memberName;
	private String memberAdd;
	private int BorrowedVideo;
	private List<Video> dvds;
	
	public GeneralMember() {}

	public GeneralMember(String memberId, String memberName, String memberAdd) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberAdd = memberAdd;
		dvds = new ArrayList<Video>();
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
	public void borrow (Video dvd) {
		dvds.add(dvd);
		dvd.borrowMember(this);
	}
	
	public void printInfo () {
		System.out.println("회원의 아이디: " + memberId);
		for(Video dvd: dvds) {
			System.out.println("회원의 이름: " + memberName);
			System.out.println("회원의 주소: " + memberAdd);
			System.out.println("회원이 대여한 비디오 번호: " + dvd.getVideoNum());
			System.out.println("회원이 대여한 비디오 제목: " + dvd.getVideoName());
			System.out.println("회원이 대여한 비디오 주인공: " + dvd.getVideoProtagon());
		}
	}
}
