package baekjoon;

import java.util.Scanner;

public class Baekjoon_10988 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(palindrom(scan.next()));
		
	}
	
	public static int palindrom(String string) {
		
		char[] arr = string.toCharArray();
		int j = 0;
		char[] tmp = new char[arr.length];

		for(int i = string.length()-1 ; i >= 0 ; i-- ) {
			tmp[j++] = arr[i];
		}
		;
		
		if(string.equals(new String(tmp))) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
