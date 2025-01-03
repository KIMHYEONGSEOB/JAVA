package day02;

public class OperatorEx03 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		//if뒤에 소괄호가 참 이면 if중괄호를 실행하고, 거짓이면 else를 실행함
		if(a != 10 && ++b == 21) { //뒤에를 검사할 필요가 없는 조건인 경우, 뒤에 코드를 실행하지 않음
			System.out.println("참 입니다.");
		}
		
		else {
			System.out.println("거짓 입니다.");
		}
		
		System.out.println("a값:" + a);
		System.out.println("b값:" + b);
		
		if(a == 10 || ++b == 21) {
			System.out.println("참 입니다.");
		}
		else {
			System.out.println("거짓 입니다.");
		}
		
		
		System.out.println("a값:" + a);
		System.out.println("b값:" + b);
	}
}
