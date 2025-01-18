package day11.exception.trycatch;

public class MultiCatchEx01 {

	public static void main(String[] args) {
		//main에 값을 주는 방법
		// run탭 -> run configuration -> arguments탭 -> ${string_prompt}
		
		try {
			String a = args[0];
			String b = args[1];
			
			int x = Integer.parseInt(a); //문자열 -> 숫자로 변환
			int y = Integer.parseInt(b);
			
			System.out.println(x + y);
			
			String str = null; //기타 예외....
			str.charAt(0);
			
			//예외의 종류별로, 다른 프로그램 처리를 할 수 있습니다.
			
		}catch(ArrayIndexOutOfBoundsException e) { //예외를 처리할 클래스
			System.out.println("실행 매개값을 반드시 2개 전달해 주세요.");
		}catch(NumberFormatException e) {
			System.out.println("실행 매개값을 반드시 숫자로 전달해 주세요.");
		}catch(Exception e) { //예외의 부모 클래스이기 때문에, 모든 예외 처리가 가능하다.
			System.out.println("기타 예외 입니다.");
		}
	}
}
