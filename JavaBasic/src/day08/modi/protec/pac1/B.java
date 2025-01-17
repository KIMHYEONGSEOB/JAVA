package day08.modi.protec.pac1;

public class B {

	public B() {
		A a = new A();
		a.bool = true; //가튼 패키지 접근 가능
		a.method();
	}
	
}
