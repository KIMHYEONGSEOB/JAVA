package baekjoon3;

import java.util.Scanner;

public class Baekjoon3_7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//스캐너에는 입력받는 값을 int형으로 바로 받을 수도 있다는것을 깨달았다!
		//굳이 parsInt를 사용할 필요가 없음
		int n = scanner.nextInt();
		
		for(int i = 1 ; i <=n ; i++) {
			//nextInt는 공백을 기준으로 값을 따로 받을 수 있다는것도 깨달았다!
			//굳이 토크나이저를 사용해서 나눌 필요가 없음
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println("Case #"+i+": "+(a+b)); 
		}
	}
}
