package polymorphism;

public interface Bank {
	//1.개설
	public String open(String ownerName, int limit);
	//2.입금
	public String deposit(int money); //추상메소드
	//3.출금
	public String withdraw(int money1);
	//4.조회
	public String search(); 
	}
