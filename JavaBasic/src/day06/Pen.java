package day06;

//설계도 클래스는 메인 메서드를 만들지 않는다.
public class Pen {
	//정의할 때 무엇이 정의가 되는가?
	//멤버변수(전역변수)(필드) - 클래스의 속성을 나타낼 때 사용함
	
	String ink;
	int price;
	String company;
	
	//메서드 - 클래스 안에서 기능을 나타내는 것
	void write() {
		System.out.println(ink + " 색상 글씨입니다.");
	}
	String info() {
		System.out.println("---펜의 사용 정보---");
		System.out.println("색상:" + ink);
		System.out.println("가격:" + price);
		System.out.println("제조사:" + company);
		return "색상: " + ink + ", 제조사:" + company;
	}
}
