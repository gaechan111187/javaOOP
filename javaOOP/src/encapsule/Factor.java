package encapsule;

import java.util.Scanner;

/**
 * @file_name : Factor.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 22.
 * @story     : 약수 알고리즘
 */
public class Factor {
	public int[] getFac(int dest) {
		int factor [] = new int[dest+1];
		for (int i = 1; i < dest+1; i++) {
			 ;
			if (dest%i ==0) {
				factor[i]= i;
			}
		}
		return factor;
	}
}
