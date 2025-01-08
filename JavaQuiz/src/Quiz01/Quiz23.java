package Quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		
		//백준 2차원배열 - 2566번
		
		Scanner scan = new Scanner(System.in);
		
		int arr[][] = new int [9][9];
		int max = 0;
		int r = 0;
		int c = 0;
//		boolean t = true;
//		for(int i = 0 ; i<9 ; i++) {
//			for(int j = 0 ; j<9 ; j++) {
//				arr[i][j] = scan.nextInt();
//				if(t) {
//					max = arr[i][j];
//					r=1;
//					c=1;
//					t=false;
//				}
//				if(max<arr[i][j]) {
//					max=arr[i][j];
//					r = i+1;
//					c = j+1;
//				}
//			}
//		}

		
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0 ; j < arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
				
				if(arr[i][j] > max) {
					max = arr[i][j];
					r = i;
					c = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println((r+1)+" "+(c+1));
	}
}
