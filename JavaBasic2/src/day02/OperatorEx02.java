package day02;

public class OperatorEx02 {

	public static void main(String[] args) {
		
		//2항 연산자
		int i = 7 * 3;
		int j = 7 % 3; //나머지
		int k = 7 / 3; //몫
		
		System.out.println(i+", "+j+", "+k);
		
		//비교 연산자
		System.out.println(i == j); //f
		System.out.println(i != j); //t
		System.out.println(i >= j); //t
		System.out.println(k != 21); //t
		System.out.println(k < 21); //t
		System.out.println(k % 2 == 0); // t <- k는 짝수이다.
		System.out.println(k % 2 != 1); // t
		
		System.out.println("---------------------------------------");
		
		//비트 연산자 &, |, ^
		
		int a = 5; //0000 0101
		int b = 3; //0000 0011
		System.out.println(a & b);// 둘다 1이면 1, 아니면 0 -> 0000 0001
		System.out.println(a | b);// 둘중 하나만 1이어도 1, 아니면 0 -> 0000 0111
		System.out.println(a ^ b);// 다르면 1, 같으면 0 -> 0000 0110
		
		int h = 192;
		System.out.println(h <<3 );
		
	}
}
