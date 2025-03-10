package kosa.mission;

import java.util.Arrays;

public class Baseball {
	private int hidden[];
	
	public Baseball() {
		hidden = new int[3];
		hidden[0] = (int)(Math.random()*9) + 1;
		do {
			hidden[1] = (int)(Math.random()*9) + 1;
		} while(hidden[0] == hidden[1]);
		do {
			hidden[2] = (int)(Math.random()*9) + 1;
		} while(hidden[0] == hidden[1] || hidden[1] == hidden[2]);
	}
	
	public int countStrike(int input[]) {
		int strike = 0;
		for(int i=0;i<3;i++) {
			if(hidden[i] == input[i])strike++;
		}
		return strike;
	}
	
	public int countBall (int input[]) {
		int ball = 0;
		for(int i=0;i<3;i++) {
			if(hidden[i] == input[(i+1)%3])ball++;
			if(hidden[i] == input[(i+2)%3])ball++;
		}
		return ball;
	}
	
}
