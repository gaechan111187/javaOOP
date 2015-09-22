package encapsule;

import java.util.Scanner;

/**
 * @file_name : MaxMin.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 22.
 * @story     : 최고점 최저점 구하기
 */
public class MaxMinMain2 {
	public static void main(String[] args) {
		int [] avgs = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생들 평균 점수를 입력하시면 최고점, 최저점이 출력됩니다.");
		System.out.println("단,정원은 5명입니다.");
		System.out.println("학생 평균을 입력하세요.");
		for (int i = 0; i < 5; i++) {
			avgs[i] = scanner.nextInt();
		}
		MaxMin2 maxMin2 = new MaxMin2();
		System.out.println(maxMin2.getMaxMin(avgs));
		
	}
}
