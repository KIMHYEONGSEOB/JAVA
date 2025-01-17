package baekjoon4;

import java.util.Scanner;

public class Baekjoon4_8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[42]; //나머지 값을 넣을 인덱스
		int a;
		int result = 0; 
		
		//수를 입력받고 나머지값 인덱스에 맞게 1을 넣어주는 for문
		for(int i = 0 ; i < 10 ; i++) {
			a = scan.nextInt() % 42;
			//같은 수가 들어와도 1로 계속 초기화 됨
			arr[a] = 1;
		}
		//배열의 길이 만큼 반복 하는 for문
		for(int i = 0 ; i < arr.length ; i++) {
			//배열의 값에 1이 있으면 result를 하나 늘려준다.
			if(arr[i] == 1) {
				result++;
			}
		}
		System.out.println(result);
	}
}