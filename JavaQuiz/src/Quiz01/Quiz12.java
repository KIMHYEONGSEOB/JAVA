package Quiz01;

public class Quiz12 {

	public static void main(String[] args) {
		
		int[] arr = {1000, 500, 100, 50, 10};
		int money = 17780;
		int i = 0;
		//가장 최선의 방법으로 금액을 거슬러준다.
		while(i<arr.length) {
			System.out.println(arr[i] + "원: " + money / arr[i]);
			money %= arr[i];
			i++;
		}
	}
}
