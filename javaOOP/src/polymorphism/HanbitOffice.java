package polymorphism;

import java.util.Scanner;

public class HanbitOffice {
	public static void main(String[] args) {
		Admin service = new AdminService(1000);
		// 인터페이스 객체 = new 인터페이스를 구현한 클래스생성자
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("입금액입력");
		while (true) {
			System.out.println("사용자화면 :1.계좌계설 2.검색(계좌번호) 3.검색(이름) 4.총계좌수 5.해지 6.종료");
			int key = scanner.nextInt();
			switch (key) {
			case 1:
				System.out.println("계좌번호입력");
				int accountNo = scanner.nextInt();
				System.out.println("이름 입력");
				String name = scanner.next();
				System.out.println("입금액 입력");
				int restMoney = scanner.nextInt();
				service.openAccount(accountNo, name, restMoney);
				break;

			case 2:
				System.out.println("검색계좌번호 입력");
				int findNumber = scanner.nextInt();
				service.searchAccountByAccountNo(findNumber);
					System.out.println(findNumber+"로 검색한 계좌입니다.\n"+service.searchAccountByAccountNo(findNumber));
				break;

			case 3:
				System.out.println("검색계좌이름 입력");
				String findName = scanner.next();
				Account[] results = service.searchAccountsByName(findName);
				for (int i = 0; i < results.length; i++) {
					System.out.println(findName+"(으)로 검색한 계좌들 입니다.\n"+results[i]);
				} break;

			case 4:
				System.out.println("총 계좌수는 "+((AdminService) service).getCount()+"개입니다.");
				break;

			case 5:
				System.out.println("해지 할 계좌번호를 입력하세요");
				accountNo= scanner.nextInt();
				System.out.println(service.closeAccount(accountNo));
				break;

			case 6:
				return;
			default:
				break;
			}
		}
	}

}
