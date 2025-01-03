package Quiz01;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수1> ");
		int a = scan.nextInt();
		System.out.print("연산을 선택하세요[+, -, *, /]>");
		String o = scan.next();
		System.out.print("정수2> ");
		int b = scan.nextInt();
		
		switch(o) {
		case "+":
			System.out.println("두 수의 덧셈은: "+(a+b));
			break;
		case "-":
			System.out.println("두 수의 뺄셈은: "+(a-b));
			break;
		case "*":
			System.out.println("두 수의 곱셈은: "+(a*b));
			break;
		case "/":
			if(b==0){
				System.out.println("0으로 나눌 수 없음");
			}
			else {
				System.out.println("두 수의 나눗셈은:"+(a/b));
			}
			break;
		default:
			System.out.println("사칙연산 기호를 입력해 주세요.\n[+, -, *, /]");
		}
		
		scan.close();
	}
}
