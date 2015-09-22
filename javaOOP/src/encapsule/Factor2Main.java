package encapsule;

import java.util.Scanner;

/**
 * @file_name : Factor.java 
 * @author    : chanhok61@daum.net
 * @date      : 2015. 9. 22.
 * @story     : 약수 알고리즘
 */
public class Factor2Main {
	public static void main(String[] args) {
		System.out.println("약수를 구하려는 대상값 입력");
		Scanner scanner = new Scanner(System.in);
		Factor2 factor = new Factor2();
		int dest = scanner.nextInt();
		int[] temp = factor.getFactor(dest);
		for (int i = 0; i <temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}
