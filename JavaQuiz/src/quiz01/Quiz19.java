package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		
		//
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int[] arr= new int[n];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] < x) {
				System.out.print(arr[i]+" ");
			}
		}		
	}
}
