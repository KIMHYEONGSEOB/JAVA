package quiz15;

import java.util.Scanner;

public class MainClass01 {

	public static void main(String[] args) {
	
		/*
		 * 1. 스캐너를 통해서 정수 2개를 입력받습니다.
		 * 2. 입력받은 값이 정수라면 , 단순히 정수의 합을 출력하고 반복문을 종료하세요
		 * 3. 입력받은 값이 에러를 발생시키는 값이라면 "정수로만 입력하세요" 를 출력한 후에 다시 입력받습니다.
		 * 4. 반복문을 탈출하면 프로그램 정상 종료 문장을 띄워주세요.
		 * 
		 * * 예외처리를 정상적으로 하면, 무한루프에 빠지게 됩니다.
		     이유는 "구글"에 검색해서 적절히 처리해 보세요.
		 *
		 *
		 */
		
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0;
		while(true) {
			try {
				a = scan.nextInt();
				b = scan.nextInt();
				System.out.println(a+b);
				return;
			}
			catch (Exception e) {
				scan.next();
				System.out.println("정수로만 입력하세요");

			}

		}
		
//		System.out.println("프로그램 정상 종료");


	}
}
