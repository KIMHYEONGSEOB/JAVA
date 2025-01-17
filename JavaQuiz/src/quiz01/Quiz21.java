package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l,j;
		int arr[] = new int[n];
		//초기 바구니
		for(int i = 0 ; i < n ; i++) {
			arr[i] = i+1 ;
		}
		
		//m번 공을 바꾸기
		for(int i = 0 ; i< m ; i++) {
			l = scan.nextInt()-1;
			j = scan.nextInt()-1;
			int tmp = arr[l];
			arr[l] = arr[j];
			arr[j] = tmp;	
		}
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
