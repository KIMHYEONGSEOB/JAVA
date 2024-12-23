package baekjoon3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon3_2 {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int a = Integer.parseInt(scanner.nextLine());
		
		for(int i=0 ; i<a; i++) {
			StringTokenizer token = new StringTokenizer(scanner.nextLine());
			int b = Integer.parseInt(token.nextToken());
			int c = Integer.parseInt(token.nextToken());
			System.out.println(b+c);
		}
		
	}
}
//https://www.acmicpc.net/problem/10950