package baekjoon4;

import java.util.Scanner;

public class Baekjoon4_8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int A[] = new int[10];
		int b = 0;
		int result = 0;
		for(int a = 0 ; a<10 ; a++) {
			b= scan.nextInt() % 42;
			if(b!=0) {
				
			}
		}
		for(int a = 0 ; a<10 ; a++) {
			for(int i = 0 ; i<10 ; i++) {
				if(A[a] != A[i]) {
					result++;
				}
				i++;
			}
			a++;
		}
		System.out.println(result);
	}
}
