package baekjoon4;

import java.util.Scanner;
public class Baekjoon4_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int result = 0;
		
		for(int i = 0; i<n ;i++) {
			arr[i] = sc.nextInt();
		}
		int b = sc.nextInt();
		for(int i = 0; i<n; i++) {
			if(arr[i]== b) {
				++result;
			}
		}
		System.out.println(result);
	}
}
