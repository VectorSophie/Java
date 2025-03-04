package kosa.video;

import java.util.ArrayList;
import java.util.List;

import kosa.Relation.Student;

public class Video {
	private int videoNum;
	private String videoName;
	private String videoProtagon;
	private List<GeneralMember> Gmembers;
	
	public Video () {}
	
	public Video(int videoNum, String videoName, String videoProtagon) {
		super();
		this.videoNum = videoNum;
		this.videoName = videoName;
		this.videoProtagon = videoProtagon;
		Gmembers = new ArrayList<GeneralMember>();
	}

	public int getVideoNum() {
		return videoNum;
	}

	public void setVideoNum(int videoNum) {
		this.videoNum = videoNum;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getVideoProtagon() {
		return videoProtagon;
	}

	public void setVideoProtagon(String videoProtagon) {
		this.videoProtagon = videoProtagon;
	}
	
	public void borrowMember (GeneralMember Gmember) {
		Gmembers.add(Gmember);
	}
	
//	public void printVideo () {
//		System.out.println("비디오명: "+ videoName);
//		for (GeneralMember Gmember: Gmembers) {
//			System.out.println("대여한 사람: "+ Gmember.getMemberName());
//		}
	
}