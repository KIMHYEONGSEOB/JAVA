package baekjoon5;

import java.util.Scanner;

public class Baekjoon5_9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s1 = reverse(scan.next());
		String s2 = reverse(scan.next());
		
		String max = Integer.parseInt(s1) > Integer.parseInt(s2) ? s1: s2 ;
		System.out.println(max);
	}
	public static String reverse(String string) {
		
		char[] arr = string.toCharArray();
		int j = 0;
		char[] tmp = new char[arr.length];

		for(int i = string.length()-1 ; i >= 0 ; i-- ) {
			tmp[j++] = arr[i];
		}
		return new String(tmp);
	}
}
