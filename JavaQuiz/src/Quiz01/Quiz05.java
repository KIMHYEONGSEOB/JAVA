package Quiz01;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		/*
		 * 어떤 정수를 2개 입력 받음
		 * a > b 큰 경우에는 a를 출력
		 * b > a 큰 경우에는 b를 출력
		 * a === b 간은 경우에는 "같은 수 입니다" 를 출력*/
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a > b){
			System.out.println(a);
		}
		else if(a < b) {
			System.out.println(b);
		}
		else {
			System.out.println("같은 수 입니다");
		}
		
		scan.close();
	}
}
