package baekjoon3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon3_4 {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		int x = Integer.parseInt(scanner.nextLine());
//		int n = Integer.parseInt(scanner.nextLine());
//		int result = 0;
//		
//		for(int i= 1; i<=n; i++) {
//			StringTokenizer token = new StringTokenizer(scanner.nextLine());
//			result += Integer.parseInt(token.nextToken())*Integer.parseInt(token.nextToken());
//		}
//		System.out.println(x==result? "yes" : "no");
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = scan.nextInt();
		int i = 0;
		int result = 0;
		while(i < n) {
			result += scan.nextInt()*scan.nextInt();
			i++;
		}
		if(result==x) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		scan.close();
	}
}
//https://www.acmicpc.net/problem/25304