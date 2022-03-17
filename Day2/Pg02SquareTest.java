package chap02;

import java.util.Scanner;

/*
 * 문2: 정수를 입력받아 제곱 값을 출력하시오.

		정수를 입력하세요 : 
		9 의 제곱은 81;


 */

public class SquareTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int i = in.nextInt();
		System.out.printf("%d의 제곱은 %d\n", i, i * i);
	}
}