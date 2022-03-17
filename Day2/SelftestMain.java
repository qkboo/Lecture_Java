package chap02;

public class SelftestMain {

	public static void main(String[] args) {
		// p74 셀프 테스트
		
		//1 5 > 3 ? "true" : "false" 실행 결과
		System.out.println( (5 > 3 ? "true" : "false") );
		
		//2.정수 a가 3으로 초기화, a *= a + 1 결과?
		int a = 3;
		System.out.println(a *= a + 1);
		
		//3. 정수 a가 3으로 초기화, a++ 결과
		a = 3;
		System.out.println(a++);
		
		// 4. 연산자 우선순위로 : a = b = c + 3 / 3 * 5;
		int b = 1, c = 0;
		a = b = c + (3 / (3 * 5));
		a = b = (c + 3) / (3 * 5);

	}

}
