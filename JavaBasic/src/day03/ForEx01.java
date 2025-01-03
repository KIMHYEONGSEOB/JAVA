package day03;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		
		//1~10ㅏ지 합 for
		int sum = 0;
		
		for(int i = 1 ; i <= 10 ; i++) {
			sum += i;
		}
		System.out.println("1~10까지합: " + sum);
		
		System.out.println("----------------------------");
		
		for(int i = 10 ; i >0 ; i--) {
			System.out.println(i);
		}
		System.out.println("----------------------------");
		//for문으로 입력받은 구구단을 출력
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 1 ; i<10 ; i++) {
			System.out.println(n+" x " + i + " = " + n*i);
		}
	}
}
