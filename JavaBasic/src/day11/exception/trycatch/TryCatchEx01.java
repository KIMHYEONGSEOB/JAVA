package day11.exception.trycatch;

public class TryCatchEx01 {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
		System.out.println( i + j );
		System.out.println( i - j );
		
		try {
			System.out.println( i / j );
		}
		catch(Exception e) { 
			//catch() 안에는 예외의 종류가 들어간다.
			//Exception은 모든 예외를 처리 할 수 있다.
			System.out.println("0으로 나눌 수 없습니다.");
		}

		System.out.println( i * j );
		
	}
}
