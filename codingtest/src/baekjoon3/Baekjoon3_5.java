package baekjoon3;

import java.util.Scanner;

public class Baekjoon3_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0 ; i < n ; i+=4) {
			System.out.print("long ");
		}
		System.out.println("int");
		
	}
}
//https://www.acmicpc.net/problem/25314