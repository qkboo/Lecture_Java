package chap03;

import java.util.Scanner;

public class ExScoreInputMain {

	public static void main(String[] args) {

		//		  0 에서 100점 이외의 점수가 입력되면 종료하는 프로그램 입,출력
		//		    ( while, do-while 이용, scanner 이용 )
		//		 
		//		  예)  점수를 입력하세요. : 50
		//               죄송합니다. 불합격입니다.
		//               점수를 입력하세요. : 95
		//               축하합니다. 합격입니다.
		//               ...
		//               점수를 입력하세요. : 101
		//               끝냅니다.

		Scanner in = new Scanner(System.in);

		while (true) {

			System.out.print("점수를 입력하세요. : ");
			int score = in.nextInt();
			if (score < 0 || score > 100) {
				System.out.println("끝냅니다...");
				break;
			} else if (score >= 80) {
				System.out.println("축하합니다. 합격입니다.");
			} else {
				System.out.println("죄송합니다. 불합격입니다.");
			}
		}

	}

}
