package chap02;

import java.util.Scanner;

/*
 * 정수를 입력받아 홀수/짝수를 판단하는 프로그램을 작성하시오.
 * (나머지 연산자 응용)
 -------------------------------
 정수를 입력하세요 : 23
 홀수
 -------------------------------
 */
public class Challenge2Main {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = in.nextInt();
        System.out.println(num % 2 == 0 ? "짝수" : "홀수");
	}

}
