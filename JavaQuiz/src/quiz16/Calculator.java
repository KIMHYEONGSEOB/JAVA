package quiz16;

import java.util.Scanner;

public class Calculator {

	public static int input() throws Exception {
		/*
		 * 1. 정수 2개를 입력 받습니다.
		 * 2. 입력된 값이 정수라면 단순히 합계를 반환해주면 된다.
		 * 3. 예외가 발생하면, catch안에서 예외를 다시 한번 생성하고, throws 처리 합니다.
		 * 4. scan.close는 finally구문에서 처리한다.
		 */
		Scanner scan = new Scanner(System.in);
		
		try {
			int a = scan.nextInt();
			int b = scan.nextInt();
			return a + b;
		}
		catch (Exception e) {
			throw new Exception("정수를 입력 하세요!");
		}
		finally {
			scan.close();
		}
	}
	
	
	public static void main(String[] args) {
		
		try {
			System.out.println(Calculator.input());	
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}	
}