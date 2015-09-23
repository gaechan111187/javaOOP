package encapsule;

import java.util.Scanner;

/**
 * @file_name : ForLoopNoddsum.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 21.
 * @story     : 등차수열 1- N의 요소의 합 구하기
 */
public class OddEvenSumMain {
	/**
	 * 입력받은 두개의 수 범위 값 중에서 
	 * 짝수의 합과 홀수의 합을 따로 구하세요
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int initial = 0, limit = 0, oddsum = 0, evensum=0, num1=0, num2=0;
		System.out.println("첫번째 숫자를 입력하시오");
		num1 = scanner.nextInt();
		System.out.println("두번째 숫자를 입력하시오");
		num2 = scanner.nextInt();
		OddEvenSum OddEven = new OddEvenSum();
		String res = OddEven.OesGet(num1, num2);
		System.out.println(res);
		
	}
}