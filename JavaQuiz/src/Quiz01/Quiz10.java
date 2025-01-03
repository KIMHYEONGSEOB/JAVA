package Quiz01;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1. 1~입력받은 수 까지의 6의 배수의 합
		//제어변수 -> 조건 -> 제어변수
		int a1 =1;
		int a2 = scan.nextInt();
		int sum = 0;
		while(a1<=a2) {
			
			if(a1 % 6==0) {
				sum += a1; //6의 배수일때만 합계
			}
			a1++;
		}
		System.out.println(sum);
		
		System.out.println("-----------------------------------------");
		//2. 1~100까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수의 갯수
		int b1 = 1;
		int b2 = 0;
		while(b1<=100) {
			
			if(b1 % 4 == 0 && b1 % 8 != 0) {
				++b2;
			}
			
			b1++;
		}
		System.out.println(b2);
		
		System.out.println("-----------------------------------------");
		//3. 50~100까지 정수들의 합
		int c1=50;
		int result = 0;
		while(c1<=100) {
			result += c1;//50~100까지 정수들의 합
			c1++;
		}
		System.out.println(result);
		
		System.out.println("-----------------------------------------");
//		4. 1000의 약수들의 갯수
		int i = 1;
		int result2 = 0;
		
		while( i <=1000 ) {
			if(1000 % i == 0) {
				result2++;
			}
			i++;
		}
		System.out.println(result2);
	}
}
