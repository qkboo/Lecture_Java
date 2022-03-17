package chap02;

/*
 * Scanner 를 이용해서 이름과 나이를 입력 받는다.
 * 1. Scanner 이용
 * 2. String 클래스 이용
 * 3. printf 메서드 이용
 */

import java.util.Scanner;

public class ScannerDemoMain2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // 키보드 입력
		// 이름을 입력 받는다
		System.out.print("이름을 입력하세요: ");
		String name;
		name = in.nextLine();
		
		// 나이를 입력 받는다
		int age;
		System.out.print("나이를 입력하세요: ");
		age = in.nextInt();
		
		// 이름과 나이을 출력한다
		// 예) 이름 홍길동의 나이는 00 입니다.
		System.out.printf("이름 %s의 나이는 %d 입니다.", name, age);

	}

}
