package baekjoon4;

import java.util.Scanner;
public class Baekjoon4_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[30];
		int result;
		
		for(int i = 0 ; i<28 ; i++) {
			a[sc.nextInt()-1] = 1;
		}

		for(int i = 0 ; i<30 ; i++) {
			if(a[i]==0) {
				System.out.println(i+1);
			}
		}
	}
}

