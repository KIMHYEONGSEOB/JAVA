package day04;

import java.util.Scanner;

public class BreakEx02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //한번만 실행시킬 코드는 반복문 바깥에
		//정답 맞추기
		while(true) {

			System.out.println("3 x 4 = ?");
			System.out.print("정답>");
			
	
			if(scan.nextInt() == 12) {
				System.out.println("정답입니다!");
				break;
			}
			else {
				System.out.println("오답입니다");
			}

		}
		scan.close();
	}
}
