package encapsule;

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
		Account account = new Account();
		account.name();
	    account.deposit();
	    account.withdraw();
	}
}
