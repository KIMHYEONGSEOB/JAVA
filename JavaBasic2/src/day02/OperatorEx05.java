package day02;

public class OperatorEx05 {

	public static void main(String[] args) {
		//삼항연산자
		//랜덤값
		System.out.println(Math.random());//0이상 1.0 미만의 실수 랜덤값
		//1~10까지 랜덤한 수
		
//		double d = Math.random() * 6;
//		int r = (int)d+1; //0 ~ 9까지
//		System.out.println(d);
//		System.out.println(r);
		
		int s = (int)(Math.random() * 10) + 1;
		System.out.println(s);
		
		//짝수일까? 홀수일까?
		
		String result = s%2==0? "짝수":"홀수";
		System.out.println("랜덤수" + s + "은" + result + "입니다.");
		
	}
}
