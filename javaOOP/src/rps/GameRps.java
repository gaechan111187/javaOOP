package rps;

public class GameRps {
	int rock; //바위
	int paper;//보자기
	int scissors;//가위
	int comVal; //컴퓨터
	String rpsVal;
	public int getRock() {
		return rock;
	}
	public int getPaper() {
		return paper;
	}
	public int getScissors() {
		return scissors;
	}
	public String getRpsVal() {
		return rpsVal;
	}
	public void setRock(int rock) {
		this.rock = rock;
	}
	public void setPaper(int paper) {
		this.paper = paper;
	}
	public void setScissors(int scissors) {
		this.scissors = scissors;
	}
	public void setRpsVal(int val) {
		switch (val) {
		case 1: rpsVal = "가위";
			break;
		case 2: rpsVal = "바위";
			break;
		case 3 :rpsVal = "보";
			break;
		default:
			break;
		}
		
	}
	public int getComVal() {
		return comVal;
	}
	public void setComVal(int comVal) {
		this.comVal = (int)(Math.random()*3+1);
	}
	

}
