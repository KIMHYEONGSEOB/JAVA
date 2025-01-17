package day10.final_;

public class MainClass {

	public static void main(String[] args) {
		
		Person kim = new Person("김길동", "981003-1212312");
		Person hong = new Person("홍길동", "9123123-1231232");
		
		System.out.println(kim.ssn);
		System.out.println(hong.ssn);
		
		//값의 변경 금지
//		kim.ssn = "바꿔야지~";
		
		System.out.println("============================");
		
		//상수의 사용
		System.out.println(Constant.PI);
		System.out.println(Constant.O2);
		System.out.println(Constant.EARTH_RADIUS);
		System.out.println(Math.PI);
		System.out.println(Integer.MAX_VALUE); //int의 최고값을 알 수 있다.
		
	}
}
