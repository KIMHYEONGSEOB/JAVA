package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch02 {

	public static void main(String[] args) {
		
		//1~100까지 정렬되어 있는 숫자가 있을 때, 75를 찾는다!
		//이진탐색 - 반을 분할해서 찾아가는 방법
		//조건 - 반드시 값이 순서대로 정렬되어 있어야함
		
		//1. 위치변수 포인터(start, end)를 처음과 끝에 2개를 배치
		//2. 포인터의 중간값을 구함
		//3. 중간값이 찾는값인지 확인함
		//4. 찾는값이 중간값 보다 크면 start를 중간값 +1올림
		//5. 찾는값이 중간값보다 작으면 end를 중간값 -1내림
		
		Scanner scan = new Scanner(System.in);
		int[] arr = {1, 3, 5, 10, 20, 30, 50, 80, 100};
		System.out.print("찾을값>");
		int find = scan.nextInt();
		int start = 0;
		int end = arr.length-1;
//		
		while(start <= end) {
			
			int mid = (start+end) / 2;
			
			if(arr[mid]==find) {
				System.out.println("찾는값은:" + mid + "번째에 있습니다.");
				break;
			}
			//찾는값이 중간값보다 큰경우
			if(arr[mid] < find){
				start = mid + 1;
			}else { //찾는값이 중간값 보다 작은 경우
				end = mid - 1;
			}
		}
		//값을 못찾은 경우에 대한 처리
		if(start > end) {
			System.out.println("값이 없습니다.");
		}
		//찾은 위치를 알려줌, 찾을값이 없다면 음수를 반환
		System.out.println(Arrays.binarySearch(arr, find) +"번째에 있습니다.");
	}
}
