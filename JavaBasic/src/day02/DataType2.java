package day02;

public class DataType2 {
	public static void main(String[] args) {
		//단일문자를 저장하는 데이터 타입 char
		char c1 = 'A';
		char c2 = 65; //아스키코드 값 <--7비트 문자체계
		System.out.println(c1);
		System.out.println(c2);
		

		//char형을 부호없는 2바이트 크기로 확장시키고, 전세계 문자열에 숫자값 지정
		//유니코드
		char c3 = '가'; //AC00
		char c4 = 44032;
		char c5 = '\uAC00';// <-- 유니코드를 사용하겠다는 의미
		System.out.println(c3+"\n"+c4+"\n"+c5);
		
		//문자열을 String
		String s1 = "hello";
		String s2 = " world";
		String s3 = " 월요일!";
		
		//문자열을 + 로 붙이면, 문자열을 붙인 결과를 보여준다.
		System.out.println(s1+s2+s3);
		
		System.out.println("문자열의 길이: " + s1.length());
		
		//문자열과 다른 데이터 타입의 + 연산
		System.out.println(100+200);
		System.out.println("100"+200); //문자열에 다른타입이 붙으면 -> 문자열이 됨
		System.out.println(100 + 200 + "world");
		System.out.println("world" + 100 + 200);
		
		System.out.println("A"+10);
		System.out.println('A'+10); //규칙이 있음
	
	}
}
