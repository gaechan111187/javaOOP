package encapsule;

import java.util.Scanner;

/**
 * @file_name : MaxMin.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 22.
 * @story     : 최고점 최저점 구하기
 */
public class MaxMin {
	public String[] input(int avg) {
		Scanner scanner = new Scanner(System.in);
		int avgs[] = new int[5];
		String[] results = new String[avgs.length];
		int max=0 , min= 0 ;
		for (int i = 0; i < 5; i++) {
			System.out.println(i+1 + "번 학생 평균입력");
			avgs[i]=scanner.nextInt();
			min = avgs[0]; }
		for (int j = 0; j < 5 ; j++) {
			if (max < avgs[j]) {
				max = avgs[j];
			}
			else if (min>avgs[j]) {
				min = avgs[j];
			}results[j] = "최고"+max+ ",최저"+min;
		}return results;
			

		}	
}
