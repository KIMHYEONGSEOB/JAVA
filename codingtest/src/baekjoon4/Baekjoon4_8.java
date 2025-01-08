package baekjoon4;

import java.util.Scanner;

public class Baekjoon4_8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		int a;
		for(int i = 0 ; 10>i ; i++) {
			a = scan.nextInt()%5;
			if(arr[i] == 0) {
				arr[i] = a;
			}
		}

	}
}
