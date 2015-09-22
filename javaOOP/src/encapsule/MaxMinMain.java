package encapsule;

import java.util.Scanner;

/**
 * @file_name : MaxMin.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 22.
 * @story     : 최고점 최저점 구하기
 */
public class MaxMinMain {
	public static void main(String[] args) {
		int max=0, min=0;
		System.out.println("학생들 평균 점수를 입력하시면 최고점, 최저점이 출력됩니다.");
		System.out.println("단,정원은 5명입니다.");
		String results []  =  new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.println(i+1 +"번학생 평균을 입력하세요.");
			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();	
		}
		System.out.println("최고점은 "+max+ ", 최저점은"+min);
		
	}
}
