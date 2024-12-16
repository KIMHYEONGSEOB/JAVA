package day01;

public class VariableScope {
	
	public static void main(String[] args) {
		
//		변수의 범위 = 중괄호 안에서 선언된 변수는 중괄호 안에서만 유효함
//		int num1 = 10;
//		int num2 = 20;
		int num1 = 10, num2 = 20;//같은 타입 변수라면 ,로 연결할 수 있음
		int result; //선언
		
		if(true) {
			int num3 = 100;//중괄호 안에서만 사용이 가능함.
			num1 = 10 + num2;
			result = num1 + num2;
		}
//		System.out.println(num3); 변수 선언이 if블록 안에 돼서 에러!
		System.out.println(num1);
		System.out.println(result);
	}
}
