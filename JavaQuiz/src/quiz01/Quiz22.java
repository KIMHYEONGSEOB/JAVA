package quiz01;

import java.util.Arrays;

public class Quiz22 {

	public static void main(String[] args) {
		
		//배열의 크기를 한개 늘리고, 값을 복사하고, 맨 앞에 data를 추가해보세요
		int[] arr = {10,20,30,40,50};
		
		int data = 100;
		
		int[] newArr = new int [arr.length+1];
		
//		for(int i = newArr.length-1; i>0 ; i--) {
//			newArr[i] = newArr[i-1];
//		}
		for(int i = 1 ; i < newArr.length ; i++) {
			newArr[i] = arr[i-1];
		}
		
		newArr[0] = data;
		System.out.println(Arrays.toString(newArr));
		

		System.out.println(Arrays.toString(newArr));
	}
}
