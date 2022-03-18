package chap03;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		System.out.print("팩토리얼 값을 구할 정수 : ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = 1;
		// n!
		for(; n > 0; n--) {
			result *= n;
		}
		System.out.println(result);
		
	}
	
	
	
	
	
	
	
	public static void main_(String[] args) {
		int result = 1;
		int n;
		Scanner in = new Scanner(System.in);

		System.out.print("팩토리얼 값을 구할 정수 : ");
		n = in.nextInt();

		//for(; n > 0; n--) {
		//	result *= n;
		//}
		while (true) {
			if (n > 0)
				result *= n--;
			else
				break;
		}
		System.out.println(result);
	}
	
	
	
	public static void main3(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));
	}
	
	
	static int factorial(int x) {
		int r = 1;
		while (x > 0) {
			r *= x--;
		}
		return r;
	}

	static int factorial(int x, int y) {
		int r = 1;
		while (x <= y) {
			r *= x++;
		}
		return r;
	}

}
