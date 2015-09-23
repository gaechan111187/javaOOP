package encapsule;

public class Casino {
	private Card player1;
	private Card player2;
	private String winner;
	private String loser;
	
	public Casino(Card player1, Card player2) {
		this.player1 = player1;
		this.player2 = player2;
		if (player1.getNumber()>player2.getNumber()) {
			this.winner = player1.getName();
			this.loser = player2.getName();
		}
		else if (player1.getNumber()<player2.getNumber()) {
			this.winner = player2.getName();
			this.loser = player1.getName();
		}
	}
	@Override
	public String toString() {
		return player1.getName()+"의 숫자는 "+player1.getNumber()+"\n"+player2.getName()+"의 숫자는"+player2.getNumber()+"\n승자는"+this.winner+"\n패자는"+this.loser;
	}
}

