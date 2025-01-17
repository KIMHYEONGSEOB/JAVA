package day08.modi.protec.pac2;

import day08.modi.protec.pac1.A;

public class C extends A{

	public C() {
//		A a = new A();
//		a.bool = true; //가튼 패키지 접근 가능
//		a.method();
		super.bool = true;
		super.method();
	}
}
