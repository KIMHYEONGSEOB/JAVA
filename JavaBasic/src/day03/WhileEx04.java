package day03;

import java.util.Scanner;

public class WhileEx04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		 * 첫째줄에 n개의 갯수가 주어진다.
		 * 그 다음줄 부터는 n번에 걸쳐서 입력을 받는다.
		 */
		int n = scan.nextInt();
		int i = 1;
		while(i <= n) {
			int a = scan.nextInt();
			System.out.println(a);
			i++;
		}
	}
}
