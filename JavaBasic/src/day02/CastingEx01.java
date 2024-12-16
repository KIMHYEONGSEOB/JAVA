package day02;

public class CastingEx01 {

	public static void main(String[] args) {
		/*
		 * 크기가 작은 타입을 큰 타입에 넣을 때는
		 * 자바 가상 머신 JVM이 자동으로 형변환을 해준다.
		 */
		//자동 형변환
		byte a =10;
		short s = a; 
		int i = a;
		long l = a;
		
		char c = '가'; //2byte
		int j = c;
		
		System.out.println("가의 유니코드값: " +j);
		System.out.println(c);
		
		int k = 1000;
		double d = k; //int -> double형 자동 형변환
		System.out.println(d);
	}
}
