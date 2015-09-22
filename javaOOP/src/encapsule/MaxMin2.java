package encapsule;

import java.util.Scanner;

/**
 * @file_name : MaxMin.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 22.
 * @story     : 최고점 최저점 구하기
 */
public class MaxMin2 {
	public String getMaxMin(int[] avgs) {
		String result = "";
		int max=0 , min= 100 ;
		for (int j = 0; j < 5 ; j++) {
			if (max < avgs[j]) {
				max = avgs[j];
			}
			if (min>avgs[j]) {
				min = avgs[j];
			}
		}
		return result = "최고점: " + max + ", 최저점 : " + min;
	}
}