package Quiz01;

import java.util.Scanner;
public class Quiz15 {

	public static void main(String[] args) {

		/*
		 * 가로, 세로 길이를 입력 받습니다.
		 * 가로, 세로 길이의 사각형을 출력하며 됩니다.
		 * 단, 윤곽만 나타나도록 출력하면 됩니다.
		 * 
		 * 힌트 -> if문을 잘 생각하면 됨
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("가로>");
		int a = scan.nextInt();
		System.out.print("세로>");
		int b = scan.nextInt();


		for(int i = 0 ; i < b ; i++) {
			if(i == 0 || i == b-1) {
				for(int j = 0 ; j < a ; j++) {
					System.out.print("*");
				}
			}
			else {
				for(int j = 0 ; j < a ; j++) {
					if(j==0||j==a-1) {
						System.out.print("*");
					}
					else {
					System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
		for(int i = 1; i <=a ; i++) {
			for(int j = 1 ; j <= b ; j++) {
				if(i == 1 || i ==b) {//첫행, 마지막행
					System.out.print("*");
				}else {//첫행, 마지막행 아닐때
					if(j == 1 || j ==a) { //첫열, 마지막열
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
