package chap02;

/*
 * 직사각형의 가로, 세로 길이를 입력받아 넓이를 계산해서
 * 다음 같이 출력하세요.
 * 가로 x 세로 = 넓이
-------------------------------------------
  직사각형의 가로 길이를 입력하세요 : 20
  직사각형의 세로 길이를 입력하세요 : 30
  
  직사각형의 넓이는 600 입니다.
-------------------------------------------
 */
import java.util.Scanner;

public class Challenge1Main {

	public static void main(String[] args) {

		double w, h, area;
        Scanner in = new Scanner(System.in);		
        System.out.print("직사각형의 가로 길이를 입력하세요 : ");
        w = in.nextDouble();

        System.out.print("직사각형의 세로 길이를 입력하세요 : ");
        h = in.nextDouble();

		// 면적계산
        area = w * h;
        System.out.println("직사각형의 넓이는 " + area + "입니다.");

	}

}
