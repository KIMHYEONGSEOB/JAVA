package day07.override.basic;

public class Child extends Parent {

	//오버라이딩
	//오버라이딩 규칙 - 부모님의 메서드 모형과 동일하게 만들면 된다.
	//오버라이딩된 메서드는 무조건 먼저 실행 된다.
	void method02() {
		System.out.println("자식에서 오버라이딩 한 2번 메서드 실행");
	}
	
	//alt + shift + s => 오버라이드 메서드
}
