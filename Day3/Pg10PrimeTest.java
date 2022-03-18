package chap03;

import java.util.Scanner;

/*문10 
 * 입력한 정수가 소수인여부를 판단하는 
 * isPrime(n) 메서드를 작성하시오 
    (소수는 1보다 크면서 자기자신 외에는 나눠지지 않는 수)
 */
public class Pg10PrimeTest {
	
	public static void main(String args[]) {
		System.out.print("양의 정수를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();

		if (isPrime(num))
			System.out.println(num + "는 소수입니다.");
		else
			System.out.println(num + "는 소수가 아닙니다.");
	}
	
	static boolean isPrime(int x) {
		int temp;
		for (int i = 2; i <= x / 2; i++) {
			temp = x % i;
			if (temp == 0) {
				return false;
			}
		}
		return true;
	}

	
}
