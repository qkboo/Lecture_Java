package chap02;

/*
 * ���簢���� ����, ���� ���̸� �Է¹޾� ���̸� ����ؼ�
 * ���� ���� ����ϼ���.
 * ���� x ���� = ����
-------------------------------------------
  ���簢���� ���� ���̸� �Է��ϼ��� : 20
  ���簢���� ���� ���̸� �Է��ϼ��� : 30
  
  ���簢���� ���̴� 600 �Դϴ�.
-------------------------------------------
 */
import java.util.Scanner;

public class Challenge1Main {

	public static void main(String[] args) {

		double w, h, area;
        Scanner in = new Scanner(System.in);		
        System.out.print("���簢���� ���� ���̸� �Է��ϼ��� : ");
        w = in.nextDouble();

        System.out.print("���簢���� ���� ���̸� �Է��ϼ��� : ");
        h = in.nextDouble();

		// �������
        area = w * h;
        System.out.println("���簢���� ���̴� " + area + "�Դϴ�.");

	}

}
