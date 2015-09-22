package encapsule;

import java.util.Scanner;

/**
 * @file_name : Factor.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 22.
 * @story     : 약수 알고리즘
 */
public class FactorMain {
	public static void main(String[] args) {
		System.out.println("약수를 구하려는 대상값 입력");
		Scanner scanner = new Scanner(System.in);
		int dest = scanner.nextInt();
		Factor fac = new Factor() ;
		int [] factor = fac.getFac(dest);
		for (int i = 0; i < factor.length; i++) {
			if (factor[i]>0) {
				System.out.println(factor[i]);
			}
			else {
				System.out.print("");
			}
		}
	}
}
