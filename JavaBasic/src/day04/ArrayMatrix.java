package day04;

import java.util.Arrays;

public class ArrayMatrix {

	public static void main(String[] args) {
		
		//행렬 - 2차원 배열
		//배열안에 배열이 저장되는 형태
		int[] kor = {10, 20, 30};
		int[] math = {40, 50, 60};
		int[] eng = {70, 80, 90};
		
		int[][] arr = {kor, math, eng};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		
		//2차원 배열의 사용
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][1]);

		//2차원배열을 한번에 생성하고, 초기화
		int[][] arr2 = {{10, 20, 30},{40, 50, 60},{70, 80, 90}};
		
		System.out.println(arr2[0][0]);
		System.out.println(arr2[0][1]);
		System.out.println(arr2[0][2]);
		System.out.println(arr2[1][1]);
	}
}
