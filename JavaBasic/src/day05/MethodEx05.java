package day05;

import java.util.*;

public class MethodEx05 {

	public static void main(String[] args) {
		
		//배열의 한계점 -> 크기가 고정
		//Stack -> LIFO(Last In First Out) - 변수 저장하는데 사용됨
		//push() - 마지막에 추가
		//pop() - 마지막에 값을 제거
		
		push(12);
		push(5);
		push(6);
		System.out.println(Arrays.toString(arr));

		pop();
		System.out.println(Arrays.toString(arr));
	
	}
	
	static int[] arr = {1,2,3}; //class 어디서든 사용가능
	
	static void push(int data) {
		
		//1. 배열 크기를 +1 한 새로운 배열 생성
		
		int []temp = new int[arr.length+1];
		//2. arr배열의 요소를 새로운 배열에 복사
		for(int i = 0 ; i<arr.length ; i ++) {
			temp[i] = arr[i];
		}
		//3. 마지막에 추가
		temp[temp.length-1] = data;
		//4. 원본배열을 바꿔치기
		arr = temp;
		temp = null; //temp는 삭제
	}
	
	static int pop(){
//		1. 배열의 길이가 0보다 클때 수행
		if(arr.length>0) {

			//2. 삭제할 데이터를 백업
			int del = arr[arr.length - 1 ];
			
			//3. arr보다 길이가 -1인 temp배열 생성
			int []temp = new int[arr.length-1];
			
			//4. temp로 값을 복사
			for(int i = 0 ; i<temp.length ; i++) {
				temp[i] = arr[i];
			}
			
			//5. 원본배열 바꿔치기
			arr = temp;
			temp = null;
			return del;
			}
		return 0;
	}
}
