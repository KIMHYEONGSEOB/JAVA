package day02;

public class DataTypeEx01 {

	public static void main(String[] args) {
		
		//정수형 타입
		byte a = 127;
		byte a2 = -128;
		
		short b = 32767;
		short b2 = -32768;
		
		int c = 2147483647;
		int c2 = -2147483648;
		
		long d = 1111111111111111111L;// 롱타입은 L을 붙임
		System.out.println(d);
		/*
		 * 2진수 - 숫자 앞에 0b를 붙임
		 * 8진수 - 0을 붙임
		 * 16진수 - 0x를 붙임
		 * 형태로 저장가능.
		 * */
		int oct = 010;
		System.out.println("팔진수 7의 값은 : " + oct + "입니다.");
		
		
		System.out.println("----------------------------------------");
		//실수형 타입
		float f1 = 3.141592567f;//f를 붙임
		double d1 = 3.141592567;//그냥 저장해도됨
		
		System.out.println(f1);// 7자리
		System.out.println(d1);//15자리 - 기본형
		//e표기법 - 실수부를 표현할 자리가 없으면 표현되는 형식
		float f2 = 314.15e-2f;
		double d2 = 0.00031415e4;
		System.out.println(f2);
		
		//논리형 타입
		boolean bool = true;
		boolean boo12 = false;
		boolean bool3 = true;
		
		
	}
	
}
