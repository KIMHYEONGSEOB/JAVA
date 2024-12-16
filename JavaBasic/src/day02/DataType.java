package day02;

public class DataType {
	
	public static void main(String[] args) {
		
		byte a = 127, a1 = -128;
		
		short b = 32767, b1 = -32768;
		
		int c = 2147483647, c1 = -2147483648; //대략 21억
		
		long d = 1111111111111111111l;//L을 붙임 - int보다 큰값 저장가능
		
		/*
		 * 2진수, 8진수, 16진수 형태로 저장이 가능
		 * 2진수 - 앞에 0b를 붙임
		 * 8진수 - 앞에 0을 붙임
		 * 16진수 - 앞에 0x를 붙임
		 * */
		int bin = 0b1010;
		System.out.println("이진수 bin은 " + bin + "입니다.");
		
		System.out.println("------------------------------------");
		//실수형
		
		float f1 =3.14f; //뒤에 f를 붙임
		double d1 = 3.14; //기본형

		float f2 = 3.14159265358f; // 7자리만 표현하고 넘으면 반올림
		double d2 = 3.14159265358; // 15자리까지만 표현하고 넘으면 반올림
		
		System.out.println(f2);
		System.out.println(d2);
		
		//boolean bool = 1;
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
	}

}
