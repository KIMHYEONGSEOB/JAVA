package quiz18;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 첫째 줄에 입력의 횟수가 주어지고,
		 * 둘째 줄 입력의 횟수만큼 정수 다시 입력을 받는다.
		 * 
		 * 5
		 * 54 32 43 52 75
		 * 
		 * nextLine() 받아서, split() 쪼개고, parseInt로 변환해서 정수 배열에 저장
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String str[] = scan.nextLine().split(" ");
		int [] arr = new int[str.length];
		for(int i = 0 ; i < str.length ; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		System.out.println(Arrays.toString(arr));
		
		
	}
}
