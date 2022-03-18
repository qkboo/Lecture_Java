package chap03;

import java.util.Scanner;

/*
 * 문04:다음 같이 출력되게 하세요
--------------------------------
	*
	**
	***
	****
	*****
 */
public class Pg04PiramidTest {
	public static void main_(String[] args) {

		//입력한 개수 만큼 별을 찍도록 수정!!!

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	/*
	별 숫자 number 를 입력 받도록 한다.
	*/
	public static void main_2(String[] args) {
		Scanner in = new Scanner(System.in); 
		int n = in.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	
	
	
	
	
	/*
	메서드 printStar(int number) 에 별 찍는 코드를 작성해, number 만 큼 별을 찍도록 수정.
	*/
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in); 
			int n = in.nextInt();
			printStart(n);
		}
		
		static void printStart(int number) {
			for (int i = 1; i <= number; i++) {
				for (int j = 1; j <= i; j++)
					System.out.print("*");
				System.out.println();
			}
		}
	
	
	
	
}
