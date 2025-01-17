package day07.overloading.basic;

public class Basic {

	/*
	 * 오버로딩 - 동일한 메서드, 생성자를 여러개 만드는 것
	 * 규칙
	 * 1. 이름은 같아야함
	 * 2. 매개변수의 종류, 순서, 개수 등을 다르게 해서 만들면 됨
	 */
	
	void abc(int a) {
		System.out.println("정수 1개 입력받음");
	}
	
//	반환 유형은 오버로딩과 상관없음
//	int abc(int a) {
//		return 0;
//	}
	
	void abc(double d) {
		System.out.println("실수 1개 입력받음");
	}
	
	void abc(String s, int a) {
		System.out.println("문자열 1개, 정수 1개 입력받음");
	}
	
	void abc(int a, String s) {
		System.out.println("정수 1개, 문자열 1개 입력받음");
	}
	
	void abc(int a, char c, String s) {
		System.out.println("정수 1개, 문자형 1개, 문자열 1개 입력받음");
	}
	
}
