package day02;

public class OperatorEx03 {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		//if문 소괄호가 true라면, if구문을 실행, false라면 else구문 실행
		if( x != 10 & ++y == 21) {//절대 만족할 수 없는 조건일 때 뒤를 실행하지 않음
			System.out.println("참");
		}
		else {
			System.out.println("거짓");
		}
		
		System.out.println("x의값 :"+x);
		System.out.println("y의값 :"+y);
		
		if( x == 10 | ++y == 21) {
			System.out.println("참");
		}
		else {
			System.out.println("거짓");
		}
		System.out.println("x의값 :"+x);
		System.out.println("y의값 :"+y);
	}

}
