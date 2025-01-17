package quiz01;

import java.util.Scanner;

public class Quiz20 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int arr[] = new int[n];
//		for(int i = 0 ; i < arr.length ; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		int min = arr[0];
//		int max = arr[0];
//		
//		for(int i = 0 ; i < arr.length ; i++) {
//			if(arr[i]<min) {
//				min = arr[i];
//			}
//			else if(arr[i]>max) {
//				max = arr[i];
//			}
//		}
		int max = 0;
		int min = 0;
		for(int i = 0 ; i < arr.length ; i++) {
		arr[i] = scan.nextInt();
		if(i == 0) {
			 max = arr[i];
			 min = arr[i];
		}
		
		if(arr[i] > max) {
			max = arr[i];
		}
		if(arr[i] < min) {
			min = arr[i];
		}
		
	}
		System.out.println(min + " " + max);
		scan.close();
	}
}
