package Quiz01;

public class Quiz13 {

	public static void main(String[] args) {
		
		//1. 7~100 사이의 정수들 중에서 7의 배수를 가로로 출력
		for(int i = 7 ; i <= 100 ; i+=7 ) {
				System.out.print(i+" ");
		}
		System.out.println();
		//줄바꿈
		//2. 200까지 정수 중에서 8의 배수의 갯수를 출력
		int result = 0;
		for(int i = 1 ; i <= 200 ; i+=8) {
			++result;
		}
		System.out.println(result);
		//3. 50~100사이의 짝수의 합
		int result2 = 0;
		for(int i = 50 ; i <=100 ; i+=2) {
				result2 +=i;
		}
		System.out.println(result2);
		//4. A~Z까지 문자열의 합
		//A=65. Z=90
		String str = "";
		for(char al = 'A' ; al <= 'Z' ; al++) {
			str += al;
			System.out.print(al);
		}
		System.out.println();
	}
}
