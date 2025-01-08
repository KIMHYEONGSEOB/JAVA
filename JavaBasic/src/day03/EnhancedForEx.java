package day03;

public class EnhancedForEx {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		//일반 반복문
//		for(int i = 0 ; i < arr.length ; i++) {
//			System.out.println(arr[i]);
//		}
		
//		향상된 for문
		for(int i : arr ) {
			System.out.println(i);
		}
		System.out.println("-----------------------------");
		
		String[] arr2 = {"월", "화", "수", "수", "수", "토", "일"};
		
		for(String i : arr2) {
			System.out.println(i);
		}
		System.out.println("--------------------------------");
		
		int[] point = {34, 56, 12, 96, 98};
		int sum = 0;
		for(int i :point) {
			sum+=i;
		}
		System.out.println("배열요소의 합: " + sum);
		System.out.println("배열요소의 평균: " + sum / (double)point.length);
	}
}
