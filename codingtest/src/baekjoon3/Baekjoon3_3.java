package baekjoon3;

import java.util.Scanner;
public class Baekjoon3_3 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	int n = Integer.parseInt(scanner.nextLine());
	int b = 0;
	for(int i =0 ; i<=n ; ++i) {
		b += i; 
	}
	System.out.println(b);
	}
}
//https://www.acmicpc.net/problem/8393