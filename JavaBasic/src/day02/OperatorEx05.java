package day02;

public class OperatorEx05 {

	public static void main(String[] args) {
		
		//프로그램에서 난수(랜덤값)가 간혹 필요할 때가 있다.
		//System.out.println(Math.random()); //0.0이상~ 1.0미만의 랜덤 실수
		
		
		//1~10까지의 랜덤값
//		double d = Math.random()*10;// 0.0 ~10.0미만
//		int r = (int)d +1;
//		System.out.println(r);
		
		int ran = (int)(Math.random()*10)+1;
		System.out.println(ran);
		
		//삼항 연산식,
		//1~100까지 랜덤수
		int x = (int)(Math.random() * 100)+ 1;
		
//		x % 2 == 0 -> 어떤수는 짝수라고 할 수 있음
		String result = x % 2 == 0 ? "짝수" :"홀수";
		System.out.println("랜덤수: "+ x +"는" + result + "입니다");
		
		
	}
}
