package day03;

import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수>");
		int point = scan.nextInt();
		
		//학점
		String grade = null;
		
		if(point >= 90) {
			if(point>=95) {
				grade = "A+학점";
			}
			else{
				grade = "A학점";
			}
		}
		else if(point >= 80) {//80~89
			if(point>=85) {
				grade = "B+학점";
			}
			else {
				grade = "B학점";
			}
		}
		else if(point >= 70) {//70~79
			if(point>=75) {
				grade = "C+학점";
			}
			else {
				grade = "C학점";
			}
		}
		else if(point >= 60) {//60~69
			grade = "D학점";
		}
		else {//~60
			grade = "F학점";
		}
		
		
		//학점을 여기서 사용....
		System.out.println("당신의 학점은: " + grade + "입니다.");
		
		scan.close();
	}
}
