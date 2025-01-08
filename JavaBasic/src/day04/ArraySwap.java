package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {
	
	public static void main(String[] args) {
		
//		int x = 5;
//		int y = 10;
//		int temp = 0;
//
//		temp = x; x = y; y = temp;
//		
//		System.out.println(x + "-" + y);
		
		Scanner scan = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int temp;
		
		temp = arr[a]; arr[a] =arr[b]; arr[b] = temp;
		
		System.out.println(Arrays.toString(arr));
		

	}
}