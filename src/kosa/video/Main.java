package kosa.video;

public class Main {
	public static void main(String[] args) {
		Video v1 = new Video(1, "데드풀&울버린", "라이언 레이놀드");
		Video v2 = new Video(2, "어번져스 엔드게임", "로다주");
		Video v3 = new Video(3, "소닉3", "키아누 리브스");
		
		GeneralMember g1 = new GeneralMember("qqq", "김", "경기도 광명");
		GeneralMember g2 = new GeneralMember("www", "박", "경북 경산");
		GeneralMember g3 = new GeneralMember("eee", "이", "부산");
		
		g3.rental(v1);
		g2.rental(v3);
		g1.rental(v2);
		
		g1.print();
	}
}
