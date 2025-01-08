package day04;

public class ArraySearch01 {

	public static void main(String[] args) {
		
		//이 배열 안에서 가장 큰 값을 찾음
		int[] arr = {34, 65, 12, 44, 56, 100, 54, 87, 23, 55};
		
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
