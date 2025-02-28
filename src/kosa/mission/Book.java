package kosa.mission;

public class Book {
	int FullPr; 
	String Name;

	public Book () {}
	
	public Book (int FullPr, String Name) {
		super();
		this.FullPr = FullPr;
		this.Name = Name;
	}
	
	public void print (int DiscPr) {
		System.out.println(Name + " 교재는 정가는 " + FullPr + "원 할인된 가격은 " + DiscPr + "원입니다.");
	}
	public int DiscCal () {
		int Disc = 0;
		if (FullPr >= 30000 ) {
			Disc = 25;
		} else if (FullPr>=20000 & FullPr < 30000) {
			Disc = 20;
		} else if (FullPr>=15000 & FullPr < 20000) {
			Disc = 15;
		}
		int DiscPr = FullPr - ((FullPr / 100) * Disc);
		return DiscPr;
	}	
}
