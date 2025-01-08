package day05;

public class MethodEx02 {

	public static void main(String[] args) {
		
		/*
		 * 매개변수
		 * 1. 메서드를 호출할 때 전달할 매개변수
		 * 2. 없을 수도 있고, 여러개 일 수도 있다.
		 * 
		 */
		int result2 = calSum(10);
		System.out.println(result2);
		
		int result3 = calSum2(5, 10);
		System.out.println(result3);
		
	}
	
	static int calSum(int a) {
		//a를 여기서 쓸 수 있음
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			sum+=i;
		}
		
		return sum;
	}
	
	static int calSum2(int start, int end) {
		int sum = 0;
		for(int i = start ; i <= end ; i++) {
			sum += i;
		}
		return sum;
	}


}
