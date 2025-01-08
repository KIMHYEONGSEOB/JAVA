package day05;

public class MethodEX03 {
	
	public static void main(String[] args) {
		
		/*
		 * 반환유형(return type)
		 * 1. 반환유형은 메서드가 실행결과를 돌려주는 값에 대한 type입니다.
		 * 2. 반환유형이 있으면 return뒤에 값을 담아주고, 
		 * 	  반환유형이 없으면 반환유형 자리에 void라고 적으면 된다.
		 * 3. 리턴이 있는 함수들은 호출구문이 값이 되기 때문에, 
		 * 	  출력구문이나 다른 함수의 매개변수로 쓸 수 있다.
		 */
		
		int result = add(1, 2); //호출 구문 자체가 값이 된다.
		System.out.println("결과: " + result);
		
//		System.out.println(sub(1,2));
		sub(1, 2);//void형 함수는 호출만 가능함. (함수가 실행되고 끝남)
		
		//void형 메서드에서 return 키워드를 쓸 수 없는가? <- 쓸 수 있다!
		noReturn("bye");
	}

	static int add(int a, int b) {
		
		return a + b;
	}

	//반환이 없는 함수(메서드)
	static void sub(int a, int b) {
		System.out.println(a + " - " + b + " = " + (a-b));
	}
	
	//bye 매개변수가 들어오면, 더이상 실행시킬 필요가 없는 메서드
	static void noReturn(String s) {
		
		if(s.equals("bye")) {// s == "bye"
			System.out.println("bye!");
			return;//종료의 의미
			//int a = 1; //불가능
		}
		System.out.println("매개변수는: " + s + "입니다");
	}
	
}
