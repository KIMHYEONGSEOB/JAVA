package baekjoon5;

import java.util.Scanner;

public class Baekjoon5_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		//입력받은 문자열을 .charAt 메서드로 char형으로 형변환후 int형 b에 변수에 저장
		int b = a.charAt(0);
		System.out.println(b);
	}
}
