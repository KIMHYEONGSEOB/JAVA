package baekjoon_source;

import java.util.Scanner;

public class Baekjoon_1978 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		//소수 갯수
		int answer = 0;

		//n번 만큼 s를 입력 받는다
		for(int i = 0; i < n ; i++) {
			int sum = 0;
			int s = scan.nextInt();

			//입력받은 수 보다 작은 수를 1부터 차례대로 나눴을을때 나머지가 0일경우 1누적
			for(int j = 1 ; j <= s ; j++) {
				sum += s % j == 0 ? 1 : 0;
			}
			//누적 수가 2면 소수 갯수를 1개 늘려주고 다시 s를 입력 받는다.
			answer += sum == 2 ? 1 : 0;
		}
		System.out.println(answer);
	}
}
