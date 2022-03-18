package chap03;

public class ExAlphaWhileMain {

	public static void main(String[] args) {
		// 1. while( do while) 로 알파벳 대문자 A에서 Z 까지 출력.
		// (단, ascii code : A 97 이용 )

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
