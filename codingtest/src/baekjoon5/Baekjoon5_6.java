package baekjoon5;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon5_6 {

	//	이게 맞나???...
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		char[] arr = s.toCharArray();
		char[] arr2 = new char[26] ;
		int [] arr3 = new int[26];

		for(int i = 'a' ; i <= 'z' ; i++) {
			arr2[i-'a'] = (char)i;
		}

		for(int i = 0 ; i < 26; i++ ) {
			arr3[i] = -1;
		}

		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr3.length ; j++) {
				if(arr2[j]==arr[i]) {
					if(arr3[j]==-1) {
						arr3[j] = i;
					}
				}
			}
		}
		for(int i = 0; i <arr3.length ; i++) {
			System.out.print(arr3[i]+" ");
		}
	}
}