package kosa.video;

import java.util.ArrayList;
import java.util.List;

import kosa.Relation.Student;

public class Video {
	private int videoNum;
	private String videoName;
	private String videoProtagon;
	
	public Video () {}
	
	public Video(int videoNum, String videoName, String videoProtagon) {
		super();
		this.videoNum = videoNum;
		this.videoName = videoName;
		this.videoProtagon = videoProtagon;
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
	
	public void show() {
		System.out.println("회원이 빌린 비디오 번호: " + videoNum);
		System.out.println("회원이 빌린 비디오 제목: " + videoName);
		System.out.println("회원이 빌린 비디오 주인공: " + videoProtagon);
	}
	

}