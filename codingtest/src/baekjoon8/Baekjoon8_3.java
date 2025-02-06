package baekjoon8;

import java.util.Scanner;

public class Baekjoon8_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int q = 25;
		int d = 10;
		int n = 5;
		int p = 1;
		
		int arr[] = new int[4];
		
		int t = scan.nextInt();
		
		for(int i = 0  ; i < t ; i++) {
			int m = scan.nextInt();
			arr[0] = (m/q);
			m %= q;
			arr[1] = (m/d);
			m %= d;
			arr[2] = (m/n);
			m %= n;
			arr[3] = (m/p);
			System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
		}
	}
}
