package Quiz01;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		
		/*
		 * 랜덤한 문제를 생성하고, 정답 맞추기 프로그램
		 * 
		 * 1. 0을 입력하면 종료가 됩니다.
		 * 2. 종료될때는 정답, 오답 개수를 출력해 주세요.
		 */
		Scanner scan = new Scanner(System.in);
		int answer;
		int o = 0;
		int x = 0;
		while(true) {
			int a = (int)(Math.random() * 100)+1;
			int b = (int)(Math.random() * 100)+1;
			System.out.print(a + " + " + b +" = ?\n[문제를 그만 푸시려면 0을 입력하세요.]\n>");
			answer = scan.nextInt();
			
			if(answer==0) {
				break;
			}
			if(answer==a+b) {
				System.out.println("정답입니다");
				o++;
			}
			else {
				System.out.println("틀렸는데요?");
				x++;
			}
			System.out.println("--------------");
		}
		System.out.println("프로그램 정상 종료");
		System.out.println("정답:" + o);
		System.out.println("오답:" + x);
			
	}
}
