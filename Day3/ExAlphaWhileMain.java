package chap03;

public class ExAlphaWhileMain {

	public static void main(String[] args) {
		// 1. while( do while) �� ���ĺ� �빮�� A���� Z ���� ���.
		// (��, ascii code : A 97 �̿� )

		char a = 'A';
		while (a <= 'Z') {
			System.out.print(a++);
		}
		System.out.println();
		
		a = 'A';
		do {
			System.out.print(a++);
		} while( a <= 'Z');
		
	}

}
