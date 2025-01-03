package quiz01;

public class Quiz02 {
	
	public static void main(String[] args) {
		
		//1. 랜덤한 정수 1~100이 주어질 때, 이 값이 5의 배수인지 확인하고, 출력하시오.
		
		System.out.println(((int)(Math.random() * 100) + 1) % 5 ==0 ? "5의 배수 입니다.":"5의 배수가 아닙니다.");
		
		int result = (int)(Math.random() * 100) + 1;
		String r = result % 5 == 0? "5의 배수 입니다.":"5의배수가 아닙니다.";
		System.out.println(result);
		System.out.println(r);
		
		//2. 랜덤한 정수 -5~5가 주어질 때, 언제나 이 값을 절대값으로 출력하시오.
		
		int result2 = (int)(Math.random() * 11) -5;
		System.out.println(result2 < 0 ? -result2 : result2);
		
		System.out.println("----------------------------------------------");
//		사과 x개를 상자에 담을 때 필요한 상자의 개수를 구하려고합니다.
//		한 상자에는 최대 10개의 사과가 들어 갈 수 있습니다.
//
//		* 사과의 개수가 1~150개 랜덤하게 주어질 때, 
//		필요한 바구니의 개수를 구하는 프로그램을 작성하세요.
		int a = (int)(Math.random()*150)+1;
		int b = a % 10 == 0 ? a / 10 : (a / 10) + 1;
		System.out.println(a);
		System.out.println(a % 10 == 0 ? a / 10 : (a / 10) + 1);
	}

}
