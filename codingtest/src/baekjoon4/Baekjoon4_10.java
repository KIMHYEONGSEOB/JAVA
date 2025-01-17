package baekjoon4;

import java.util.Scanner;

public class Baekjoon4_10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double arr[] = new double[n];
		double m = arr[0];
		double result = 0;
		
		//숫자를 입력받고 max를 구하는 for문
		for(int i = 0 ; i < n ; i++) {
			arr[i] = scan.nextInt();
			if(m < arr[i]){
				m = arr[i];
			}
		}
		//입력 받은 숫자를 조작하여 모든 수를 더하는 for문
		for(int i = 0 ; i < n ; i++) {
			result += arr[i]/m*100;
		}
		
		//입력받은 수를 나눈값 출력
		System.out.println(result/n);
		
	}
}
