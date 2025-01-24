package baekjoon5;

import java.util.Scanner;

public class Baekjoon5_7 {

	public static void main(String[] args) {
		//2675 - 문자열 반복
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		String []answer = new String[t];
		for(int i = 0 ; i < t ; i++) {
			answer[i]="";
			int r = scan.nextInt();
			String s = scan.next();

			for(int j = 0 ; j < s.length() ; j++) {
				for(int k = 0 ; k < r ; k++) {
					answer[i] += s.toCharArray()[j];
				}
			}
		}
		for(int i = 0 ; i < t ; i++) {
			System.out.println(answer[i]);
		}
	}
}
