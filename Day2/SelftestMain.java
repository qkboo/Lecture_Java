package chap02;

public class SelftestMain {

	public static void main(String[] args) {
		// p74 ���� �׽�Ʈ
		
		//1 5 > 3 ? "true" : "false" ���� ���
		System.out.println( (5 > 3 ? "true" : "false") );
		
		//2.���� a�� 3���� �ʱ�ȭ, a *= a + 1 ���?
		int a = 3;
		System.out.println(a *= a + 1);
		
		//3. ���� a�� 3���� �ʱ�ȭ, a++ ���
		a = 3;
		System.out.println(a++);
		
		// 4. ������ �켱������ : a = b = c + 3 / 3 * 5;
		int b = 1, c = 0;
		a = b = c + (3 / (3 * 5));
		a = b = (c + 3) / (3 * 5);

	}

}
