package day06;

public class PenMain {

	public static void main(String[] args) {
		
		//Pen을 쓰고 싶으면 객체로 생성을 해야한다.
		//펜의 속성에 접근할 때 .  연산자를 사용한다.
		Pen blackPen = new Pen();
		blackPen.ink = "검정";
		blackPen.price = 1000;
		blackPen.company = "모나미";
		
		blackPen.write();
		blackPen.info();
		String r = blackPen.info();
		System.out.println(r);
		
		System.out.println("===============");
		
		Pen red = new Pen();
		red.ink = "빨강";
		red.price = 2000;
		red.company = "하이테크";
		
		red.write();
		String r2 = red.info();
		System.out.println(r2);
		
		Calculator cal = new Calculator();
	}
}
