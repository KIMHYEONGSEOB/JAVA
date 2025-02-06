package baekjoon6;

import java.util.Scanner;

public class Baekjoon6_7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int answer = 0;

		re : for(int i = 0 ; i < n ; i++) {
			String str = scan.next();
			char arr[] = str.toCharArray();
			char arr2[] = new char[arr.length];
			int index = 0;

			for(int j = 0 ; j < arr.length-1 ; j++ ) {
				if(arr[j]!=arr[j+1]) {
					arr2[index] = arr[j];
					index++;
					for(char a : arr2) {
						if(a == arr[j+1]) {
							continue re;
						}
					}
				}
			}
			answer++;
		}
		System.out.println(answer);
	}
}
