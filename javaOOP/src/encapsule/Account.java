package encapsule;
/**
 * @file_name : Account.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 23.
 * @story     : 통장 개설 프로그램
 */
public class Account {
	private String accountNo;//계좌번호
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
	public void deposit(int money){
		/**
		 * 입금 매소드 +=
		 * 유효성 체크
		 * 입금액이 혹시 0이나 0보다 작은 금액을
		 * 파라미터로 던질 경우 에러가 발생하는 것을
		 * 막기 위한 방어코딩
		 */
	}
	public void withdraw(int money){
		/**
		 * 출금메소드 -=
		 */
	}
	@Override
	public String toString() {
		return "입출금 계좌\n"
				+"["+BANK_NAME+"]\n"
				+"계좌번호 :"+"???"+"\n"
				+"계좌명 :"+"????"+"\n"
				+"비번: ******\n"
				+"잔액:"+"???"+"\n"
				+"으로 통장이 개설되었습니다.";
		
	}
}
