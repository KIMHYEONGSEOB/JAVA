package day04;

public class ArrayBasic01 {

	public static void main(String[] args) {
		//배열의 순회
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		int i = 0;
		while(i < arr.length) {
			System.out.println("인덱스:" + i + "는:" + arr[i]);
			sum += arr[i];
			
			i++;
		}
		System.out.println("합계:" + sum);
		
	}
}
