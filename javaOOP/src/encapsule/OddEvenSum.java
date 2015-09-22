package encapsule;

import java.util.Scanner;

/**
 * @file_name : ForLoopNoddsum.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 21.
 * @story     : 등차수열 1- N의 요소의 합 구하기
 */
public class OddEvenSum {
	/**
	 * 입력받은 두개의 수 범위 값 중에서 
	 * 짝수의 합과 홀수의 합을 따로 구하세요
	 * @return 
	 */
	public String OesGet(int num1,int num2) {
		int initial = 0, limit = 0, oddsum = 0, evensum=0 ;
		if (num1>num2) {
			initial = num2;
			limit = num1;
		}
		else  {
			initial = num1;
			limit = num2;
		}
		for (int i = initial; i <= limit; i++) {//2씩증가하는법은 i+=2
			if (i % 2 == 0) {
				evensum += i;
			} else {
				oddsum += i;
			}
		}
		String result = initial + "부터 " + limit + "까지의 홀수의 합은 " + oddsum + "이고, 짝수의 합은 " + evensum + "입니다.";
		return result;
	}
}