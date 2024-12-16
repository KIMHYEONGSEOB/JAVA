package day02;

public class OperatorEx01 {
	
	public static void main(String[] args) {
		
		//단항연산자
		
		//부호연산자 -, +
		int i = -3;
		int j = +3;
		int k = -i; // 3
		
		//증/감연산자 --, ++
        //후위연산자 - 먼저값을 대입하고, 맨 마지막에 자신을 증가
		int x = 1;
		int y = x++;
		System.out.println("x값 :"+ x);
		System.out.println("y의 값 :" + y);
		
		//전위연산자 - 먼저 자신을 증가, 대입		
		int n = 1;
		int m = ++n; 
		System.out.println("n의 값:"+n);
		System.out.println("m의 값:"+m);
		
		//일반적인 사용
		x= 1;
		x++;
		++x;
		System.out.println(x); //3
		
		System.out.println("---------------------------------");
		
		//비트 연산자 ~(알아두기만) 비트값을 반대로 바꿈
		byte b = 10; // 0000 1010 
		System.out.println(~b); //1111 0101 -11
		System.out.println(~b + 1); // - 10
		
		System.out.println("---------------------------------");
		
		//논리 반전 연산자 !
		
		boolean bool = !true;
		System.out.println(bool);
		System.out.println(!bool);
		
		
	}

}
