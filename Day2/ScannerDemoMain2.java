package chap02;

/*
 * Scanner �� �̿��ؼ� �̸��� ���̸� �Է� �޴´�.
 * 1. Scanner �̿�
 * 2. String Ŭ���� �̿�
 * 3. printf �޼��� �̿�
 */

import java.util.Scanner;

public class ScannerDemoMain2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // Ű���� �Է�
		// �̸��� �Է� �޴´�
		System.out.print("�̸��� �Է��ϼ���: ");
		String name;
		name = in.nextLine();
		
		// ���̸� �Է� �޴´�
		int age;
		System.out.print("���̸� �Է��ϼ���: ");
		age = in.nextInt();
		
		// �̸��� ������ ����Ѵ�
		// ��) �̸� ȫ�浿�� ���̴� 00 �Դϴ�.
		System.out.printf("�̸� %s�� ���̴� %d �Դϴ�.", name, age);

	}

}
