package chap02;

import java.util.Scanner;

/*
 * ������ �Է¹޾� Ȧ��/¦���� �Ǵ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * (������ ������ ����)
 -------------------------------
 ������ �Է��ϼ��� : 23
 Ȧ��
 -------------------------------
 */
public class Challenge2Main {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("������ �Է��ϼ��� : ");
        int num = in.nextInt();
        System.out.println(num % 2 == 0 ? "¦��" : "Ȧ��");
	}

}
