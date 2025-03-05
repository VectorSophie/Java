package kosa.video;

public class SpecialMember extends GeneralMember {
	private int points;

	public SpecialMember(String memberId, String memberName, String memberAdd, int points) {
		super(memberId, memberName, memberAdd);
		this.points = points;
	}
	
	public void printSpecial() {
		System.out.println("회원 아이디: " + getMemberId());
		System.out.println("회원 이름: " + getMemberName());
		System.out.println("회원 주소: " + getMemberAdd());
		getDvd().show();
		System.out.println("회원의 포인트 적립: "+ points);
	}
}
