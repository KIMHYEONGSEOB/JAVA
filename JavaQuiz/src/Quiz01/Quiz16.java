package Quiz01;

import java.util.Scanner;
public class Quiz16 {
	
	public static void main(String[] args) {
		
		/*
		 * 숙제
		 * 
		 * 어떤 수를 입력 받아서, 입력 받은 수 까지의 모든 소수들의 합계를 구합니다.
		 * 
		 * 소수 - 약수가 1과 자기 자신인 수( 약수의 갯수가 2개)
		 * 
		 * 1은 소수가 아님
		 * 2는 소수
		 * 3은 소수
		 * 5도 소수
		 * 7, 13, 17, 19, 
		 * 
		 * 입력 출력
		 * 10 -> 2 + 3 + 5 + 7 = 17
		 * 13 -> 2 + 3 + 5 + 7 + 11 + 13 = 41
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("정수>");
		int num = scan.nextInt();

		int sum = 0;
		
		for(int i = 1 ; i <=num ; i++) {
			//1의 약수 개수, 2의 약수개수, ....... num까지 약수의 개수
			int count = 0;
			for(int j = 1; j <= i ; j++) {
				//요기서 약수 개수를 구해보면
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				//i는 소수라고 할 수 있음
				sum += i;
			}
		}
		System.out.println(sum);
		
		//약수 구하기
//		for(int i = 2 ; i <= num ; i++) {
//			if(a%i==0) {
//				count++;
//			}
//		}
//		if(count==2) {
//		}
		
	}

}
