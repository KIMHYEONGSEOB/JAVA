package day02;

public class CastingEx2 {
	
	public static void main(String[] args) {
		/*
		 * 크기가 큰 타입을 작은 타입으로 변환 할때는 type casting
		 * 을 사용해서 명시적으로 형변환을 해야한다.
		 * 명시적 형변환= [(타입)변수] 를 적어줌
		 */
		
		int i = 70; //4byte
		char c = (char)i;
		short s = (short)i;
		System.out.println(c);
		
		float f1 = 3.14f;
		int j = (int)f1;
		System.out.println(j);
		
		/*
		 * 명시적 변환시에 주의할 점
		 * 해당 값을 저장할 수 없는 범위가 ㄷ르어오면, 잘려나간 값(쓰레기값)이
		 * 저장된다.
		 */
		int a = 1000;
		byte b = (byte)a;
		System.out.println(b);
	}
}
