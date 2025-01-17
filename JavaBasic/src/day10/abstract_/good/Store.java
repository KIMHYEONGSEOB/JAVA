package day10.abstract_.good;

public abstract class Store {

	/*
	 * 1. 메서드에 abstract키워드를 붙이면 추상메서드
	 * 	  추상 메서든 - {}가 없는 메서드 선언 ;
	 * 
	 * 2. 추상메서드를 쓰고 싶다면, 클래스가 추상 클래스여야 한다.
	 * 
	 * 3. 추상 클래스도 일반메서드, 생성자, 일반변수 모두 사용할 수 있다.
	 */
	public String storeName() {
		return "신비한 과일가게";
	}
	
	public Store() {
		System.out.println("Store생성자 호출");
	}
	
	public abstract void melon(); //세미콜론 필수!
	public abstract void orange();
	public abstract void grape();
	public abstract void apple();
	
	public final void mango() {
		System.out.println("망고는 시세가 1000원으로 통일입니다.");
	}
}
