package baekjoon5;

import java.util.Scanner;

public class Baekjoon5_10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char c[] = scan.next().toCharArray();
		int sum = 0 ;
		String arr[] = {"","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		
		 for(int k = 0 ; k < c.length; k++ ) {
			 check :for(int i = 0 ; i < arr.length ; i++) {
				for(int j = 0 ; j < arr[i].length() ; j++) {
					if(c[k] == arr[i].charAt(j)) {
						sum += i+2;			
						break check;
					}
				}
			}
		}
		System.out.print(sum);
	}
}
