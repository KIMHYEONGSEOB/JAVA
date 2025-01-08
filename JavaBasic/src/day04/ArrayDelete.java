package day04;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		//배열의 삭제 - 배열은 삭제의 개념이 없음 (크기가 고정이라서)
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int index = 5; //삭제할 위치
		
		//크기가 -1 인 배열 하나 생성
		int[] newArr = new int[arr.length - 1];
		
		//원본 배열의 삭제할 위치부터 마지막까지 당겨옴 -> 복사
		for(int i = index ; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
		//복사
		for(int i = 0 ; i< newArr.length; i++) {
			newArr[i] = arr[i];
		}
		arr= newArr;
		newArr = null;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
	}
}
