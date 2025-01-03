package day03;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		
		//switch문장은 else if문과 90% 유사함
		Scanner scan = new Scanner(System.in);
		System.out.print("점수>");
		int point = scan.nextInt();
		
		switch (point / 10) { // switch문장에 소괄호에는 변수 or 변수의 연산식이 들어갈 수 있음
		case 10:
		case 9://99~90
				if(point >= 95) {
				System.out.println("A+학점");
				}
				else {
					System.out.println("A학점");	
				}
			break;
		case 8://89~80
			System.out.println("B학점");
			break;
		case 7://79~70
			System.out.println("C학점");
			break;
		case 6://69~60
			System.out.println("D학점");
			break;
		default://60~
			System.out.println("F학점 재수강");
			break;
		}
	}
}
