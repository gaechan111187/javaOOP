package polymorphism;

import java.util.Scanner;

public class BankService implements Bank{
	Account account = new Account();
	Scanner scanner = new Scanner(System.in);
	
	
	@Override
	public String deposit(int money) {
		if (money<=0) {
			return "금액을 다시 입력하세요."+"\n"+account.toString();
		}
		else {
			 account.restmoney += money;
			 return account.toString();
			
	}
		 
	}
	@Override
	public String withdraw(int money1) {
		if (account.restmoney<money1) {
			return "\n잔고가 부족합니다."+"\n"+account.toString();
		}
		else {
			account.restmoney -= money1;
			 return "\n"+account.toString();
		}
	}
	
	public String search() {
		return account.toString();
	}
	@Override
	public String open(String ownerName, int limit) {
		account.setOwnerName(ownerName);
		return account.toString();
	}
	
}