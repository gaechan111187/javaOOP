package inheritance;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class AccountMain {
	/**
	 * private String accountNo;//계좌번호
	private String ownerName;//계좌주인
	private String password; //비밀번호
	private int restmoney;//잔액
	public static final String BANK_NAME = "한빛뱅크";
	 */
	public static void main(String[] args) {
		
		//Account account = new Account();
		MinusAccount maccount = new MinusAccount();
		Scanner scanner = new Scanner(System.in);
		System.out.println("계좌를 생성합니다.\n이름을 입력하세요");
		String ownerName = scanner.next();
		System.out.println("비밀번호를 입력하세요");
		String password = scanner.next();
		System.out.println("대출 한도를 정하세요(300만까지 가능)");
		int limit = scanner.nextInt();
		maccount.setLimit(limit);
		maccount.setOwnerName(ownerName);
	    maccount.setPassword(password);
		System.out.println("\n"+maccount.toString());
		
	    
		while (true) {
			System.out.println("업무를 선택하세요");
			System.out.println("1.입금\t2.출금\t3.잔액조회\t4.종료");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("입급할금액 입력");
			    int money = scanner.nextInt();
				maccount.deposit(money);
				break;
			case 2:
				System.out.println("출금할금액 입력");
				int money1 = scanner.nextInt();
			    maccount.withdraw(money1);
				break;
			case 3:
				System.out.println(maccount.toString());
				break;
			default:
				return;
			}
		}
	}
}
