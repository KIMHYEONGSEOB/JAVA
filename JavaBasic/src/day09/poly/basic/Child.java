package day09.poly.basic;

import java.lang.reflect.Method;

public class Child extends Parent {

	//오버라이드
	@Override
	public void method02() {
		System.out.println("자식에 재정의 된 2번 메서드 실행");
	}
	
	public void method03() {
		System.out.println("자식의 3번 메서드 실행");
	}
}
