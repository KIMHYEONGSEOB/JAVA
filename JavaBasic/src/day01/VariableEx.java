package day01;

public class VariableEx {
	
	public static void main(String[] args) {

		/*
		 * 변수의 선언방법
		 * 타입 이름;
		 * 
		 * int는 정수를 저장하는 대표적인 값
		 * 
		 */
		int num;
		num=10; //초기화
		
		System.out.println(num);
		
		//변수 선언과 초기화를 동시에
		int num2 = 20;
		
//		같은 이름으로 변수를 선언할 수 없음
//		int num = 30; 
		
		//변수는 다른 값, 또는 연산한 결과가 저장될 수도 있다.
		num = 30;
		num = 100;
		num = 100 + 200 + num2;
		
		System.out.println(num); //320
		
//		String은 문자열을 저장하는 대표적인 타입
//		문자열은 쌍따옴표("")로 감싸줘야 함
		String str = "안녕";
		
		System.out.println("-----------------------------------------------------");
		
		int result = num + num2;
		result = 100;
		result = num;
		result = result + 1;
		
		System.out.println(result);
	}

}
