package polymorphism;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Hanbitbank {
	public static void main(String[] args) {
		MBankService service = new MBankService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("입금액입력");
		while(true){
			System.out.println("동작선택:1.계좌개설2.입금3.출금4.조회5.종료");
			int key =scanner.nextInt();
			switch (key) {
			case 1:
				System.out.println("계좌를 생성합니다.\n이름을 입력하세요");
				String ownerName = scanner.next();
				System.out.println("비밀번호를 입력하세요");
				String password = scanner.next();
				System.out.println("대출 한도를 정하세요(300만까지 가능)");
				int limit = scanner.nextInt();
				System.out.println(service.open(ownerName, limit));break;
				
			case 2:
				System.out.println("입금금액입력");
				int money= scanner.nextInt();
				System.out.println(service.deposit(money));break;
			case 3:
				System.out.println("출금금액입력");
				int money1=scanner.nextInt();
				System.out.println(service.withdraw(money1));break;
			case 4:System.out.println(service.search());break;
			
			case 5:return;
			default:break;
			}
		}
	}
}