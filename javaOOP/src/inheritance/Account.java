package inheritance;

import java.util.Scanner;

/**
 * @file_name : Account.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 23.
 * @story     : 통장 개설 프로그램
 */
public class Account {
	private int accountNo;//계좌번호
	private String ownerName;//계좌주인
	private String password; //비밀번호
	private int restmoney;//잔액
	public static final String BANK_NAME = "한빛뱅크";
	
	/**
	 * 생성자를 만드시오.
	 * 단, 통장을 만듬과 동시에
	 * 은행 이름이 통장 바깥에 새겨지며(상수)
	 * 계좌번호는 랜덤숫자로 만들어 지며(총 6자리로 합시다)
	 * 계좌주인의 이름은 새겨지며
	 * 비번도 설정합니다.
	 * 다만, 잔액은 통장이 만들어진 이후에 입금이 되겠지요.
	 */
	public void password(){
		
	}
		
	public void deposit(int money){
		System.out.println("입금 할 금액을 입력하세요.");
		if (money<=0) {
			System.out.println("금액을 다시 입력하세요.");
	 		System.out.println("\n"+toString());
		}
		else {
			this.restmoney += money;
	 		System.out.println("\n"+toString());
		}
 		
		
		/**
		 * 입금 매소드 +=
		 * 유효성 체크
		 * 입금액이 혹시 0이나 0보다 작은 금액을
		 * 파라미터로 던질 경우 에러가 발생하는 것을
		 * 막기 위한 방어코딩
		 */
	}
	public void withdraw(int money1){
		if (this.restmoney<money1) {
			System.out.println("\n잔고가 부족합니다.");
			System.out.println("\n"+toString());
		}
		else {
			this.restmoney -= money1;
			 System.out.println("\n"+toString());
		}
		
		/**
		 * 출금메소드 -=
		 */
	}
	@Override
	public String toString() {
		return "["+BANK_NAME+"]\n"
				+"계좌번호 :"+getAccountNo()+"\n"
				+"계좌명 :"+getOwnerName()+"\n"
				+"비번: ******\n"
				+"잔액:"+getRestmoney()+"\n";
		
	}
	public Account() {
		this.accountNo = (int) ((Math.random()*999999)+100000);
		
	}
	public int getAccountNo() {
		return accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public String getPassword() {
		return password;
	}
	public int getRestmoney() {
		return restmoney;
	}
	public void setAccountNo() {
		this.accountNo = accountNo;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setRestmoney(int restmoney) {
		this.restmoney = restmoney;
	}
}
