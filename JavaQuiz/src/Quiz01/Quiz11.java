package Quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		 * 1. 첫째줄에 n정수가 주어집니다.
		 * 2. 이후부터는 n줄에 걸쳐서 정수를 입력 받습니다.
		 * 이 입력 받은 값을, 배열에 순서대로 저장
		 */
		int n = scan.nextInt();
		int[] arr = new int[n];
		int i = 0;
		while(i < n) {
			arr[i] = scan.nextInt();
			i++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
