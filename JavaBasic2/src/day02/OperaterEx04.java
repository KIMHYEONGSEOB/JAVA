package day02;

public class OperaterEx04 {
	
	public static void main(String[] args) {
		
		int a = 6;
		int b = 5;
		
		a = a + 3; // a = a + 3
		b =+ 3; //반대로 쓰면 부호연산자가 돼버림!
		
		System.out.println(a);
		System.out.println(b);
		
		a -= 4; // 5
		a *= 10; // 50
		a /= 3; // 16
		a %= 2; // 0
	}

}
