package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		백준 27866 - 문자와 문자열
//		String s = scan.nextLine();
//		int i = scan.nextInt();
//		char c = s.charAt(i-1);
//		System.out.println(c);
		
		//백준 9086 -문자열
		
//		int t = scan.nextInt();
//		scan.nextLine();
//		for(int i = 0 ; i < t ; i++) {
//			String s = scan.nextLine();
//			System.out.println(s.charAt(0)+""+s.charAt(s.length()-1));
//		}
		
		//백준 11720 - 숫자의합
		//힌트 - 아스키코드의 차
//		System.out.println((int)'1');
		
//		int n = scan.nextInt();
//		int sum = 0;
//		String m = scan.next();
//		for(int i = 0 ; i < n ; i++) {
//				sum += m.charAt(i)-'0';
//			}
//		System.out.println(sum);
		
		//백준 1152 - 단어의 갯수
		
		String arr[] = scan.nextLine().trim().split(" ");
		System.out.println(arr.length == 1 ? "0" : arr.length);

	}
}

