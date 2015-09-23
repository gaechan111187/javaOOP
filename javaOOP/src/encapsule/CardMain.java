package encapsule;

import java.util.Scanner;

/**
 * @file_name : CardMain.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 23.
 * @story     : 트럼프 게임
 */
public class CardMain {
	/**
	 * 무늬는 하트로 동일한 상태에서
	 * 두 카드의 숫자를 비교해서 더 높은 
	 * 수의 카드가 이기는 게임
	 *1~10까지의 정수 난수 구하기
	 * int n = (int) (Math.random()*10)+1;
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("플레이어 두명의 이름을 입력");
		String name1 = scanner.next();
		String name2 = scanner.next();
		
		Card player1 = new Card();
		Card player2 = new Card();
		player1.setName(name1);
		player2.setName(name2);
		Casino casino = new Casino(player1,player2);
		// 클래스 객체= new 생성자(인자);
		// 카지노 생성자 인자로 카드 객체 두개를 집어 넣어라.
		// 카지노 생성자에서 카드 객체 두개의 숫자를 비교해서
		// 위너,루저 인스턴스 변수에 할당하고
		// toString으로 출력해라.
		System.out.println(casino.toString());
		
	}

}
