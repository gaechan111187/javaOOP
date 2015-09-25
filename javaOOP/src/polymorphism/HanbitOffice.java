package polymorphism;

import java.util.Scanner;

public class HanbitOffice {
	public static void main(String[] args) {
			AdminService service = new AdminService(1000);
			Scanner scanner = new Scanner(System.in);
			System.out.println("입금액입력");
			while(true){
				System.out.println("사용자화면 :1.계좌계설 2.검색(계좌번호) 3.검색(이름) 4.총계좌수 5.해지 6.종료");
				int key =scanner.nextInt();
				switch (key) {
				case 1:
					System.out.println("계좌번호입력");
					int accountNo = scanner.nextInt();
					System.out.println("이름 입력");
					String name= scanner.next();
					System.out.println("입금액 입력");
					int restMoney = scanner.nextInt();
					service.openAccount(accountNo, name,restMoney);
					
				case 2:
					
				case 3:
					
				case 4:
				
				case 5:return;
				default:break;
				}
		}
	}

}
