package chap03;

import java.util.Scanner;

public class ExScoreInputMain {

	public static void main(String[] args) {

		//		  0 ���� 100�� �̿��� ������ �ԷµǸ� �����ϴ� ���α׷� ��,���
		//		    ( while, do-while �̿�, scanner �̿� )
		//		 
		//		  ��)  ������ �Է��ϼ���. : 50
		//               �˼��մϴ�. ���հ��Դϴ�.
		//               ������ �Է��ϼ���. : 95
		//               �����մϴ�. �հ��Դϴ�.
		//               ...
		//               ������ �Է��ϼ���. : 101
		//               �����ϴ�.

		Scanner in = new Scanner(System.in);

		while (true) {

			System.out.print("������ �Է��ϼ���. : ");
			int score = in.nextInt();
			if (score < 0 || score > 100) {
				System.out.println("�����ϴ�...");
				break;
			} else if (score >= 80) {
				System.out.println("�����մϴ�. �հ��Դϴ�.");
			} else {
				System.out.println("�˼��մϴ�. ���հ��Դϴ�.");
			}
		}

	}

}
