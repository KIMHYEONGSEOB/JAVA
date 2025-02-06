package baekjoon8;

import java.util.Scanner;

public class Baekjoon8_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int b = scan.nextInt();
		
		StringBuilder sb = new StringBuilder();

		int r = n % b;
		
		if(r >= 10) {
			sb.append((char)(55+(r)));
		}else {
			sb.append(r);
		}
		
		r = n / b;

		while(r!=0) {
			if(r % b >= 10) {
				 sb.append((char)(55 + (r % b)));
			}else {
			sb.append(r % b);
			}
			r /= b;
		}
		System.out.println(sb.reverse().toString());
	}

}
