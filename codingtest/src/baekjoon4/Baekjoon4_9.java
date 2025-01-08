package baekjoon4;

import java.util.Scanner;

public class Baekjoon4_9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int arr [] = new int[n];
		for(int i = 0 ; i < arr.length ; i++ ) {
			arr[i] = i+1;
		}
		for(int i = 0 ; i < m ; i++) {
			int s = scan.nextInt()-1;
			int e = scan.nextInt()-1;
			for(int j = s ; j <= e ; j++) {
				if(s > e) {
					break;
				}
				int temp = arr[s];
				arr[s]=arr[e];
				arr[e]=temp;
				
				s++;
				e--;
			}
		}
		for(int i = 0 ; i<n ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
