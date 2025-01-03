package baekjoon3;

import java.util.Scanner;
public class Baekjoon3_3 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
//	int n = Integer.parseInt(scanner.nextLine());
//	int sum = 0;
//	for(int i =0 ; i<=n ; ++i) {
//		sum += i; 
	int n = scan.nextInt();
	int i = 0;
	int sum = 0;
	while(i <= n) {
		sum += i;
		i++;
	}
	
	System.out.println(sum);
	}
	
}
//https://www.acmicpc.net/problem/8393