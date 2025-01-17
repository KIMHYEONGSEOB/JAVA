package baekjoon6;

import java.util.Scanner;

public class Baekjoon6_3 {

//	2444번 별 찍기 - 7
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = 1;
		for(int i = 1 ; i < n ; i++) {
			for(int j = 1 ; j <= n-i ; j++) {
				System.out.print(" ");
			}
//			j가 i보다 작은 만큼 별을 찍음
			for(int j = 1 ; j <= k ; j++) {
				System.out.print("*");

			}
			k+=2;
			System.out.println();
		}
		//가운데 줄
		for(int i = 1 ; i< n*2 ; i++) {
			System.out.print("*");
		}

		//아랫 줄
		System.out.println();
		for(int i = 1 ; i < n ; i++) {

			for(int j = 1 ; j <= i ; j++ ) {
				System.out.print(" ");
			}

			for(int j = 2 ; j < k ; j++) {
				System.out.print("*");
			}
			k -= 2;
			System.out.println();

		}
	}
}
