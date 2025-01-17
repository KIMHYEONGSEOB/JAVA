package quiz02;

import java.util.Scanner;

public class Account {
	
	/*
  Account클래스
  
	멤버변수
	이름 - String
	비밀번호 - String
	잔액 - int
	
	생성자
	(이름, 비밀번호, 잔액) 을 받아서 초기화 해주는 생성자 1개
	
	메서드
	입금기능 - deposit(int 금액) : 반환 void - 잔액에 매개변수를 누적하는 기능
	출금기능 - withDraw(int 금액) : 반환 int - 사용자에게 비밀번호를 입력받아서, 비밀번호가 일치하면, 잔액을 차감해하고, 출금값을 반환하는 기능
			문자열의 비교 "문자열".equals("문자열")
	잔액조회 - getBalance() : 반환 int - 잔액을 반환하는 기능
	
	*/

	Scanner scan = new Scanner(System.in);
	String name, pw;
	int n ;
	
	Account(String nm, String p, int m){
		name = nm;
		pw = p;
		n = m;
	}
	
	void deposit(int a) {
		n += a;
		System.out.println(a+"원 입금 되었습니다.");
	}
	int withDraw(int a) {
		System.out.print("비밀번호를 입력 해주세요:");
		
		if(pw.equals(scan.next())) {
			if(n - a >= 0 ) {
			n -= a;
			return a;
			}
			else {
				System.out.println("잔액 부족!");
				return 0;
			}
		}
		else {
			System.out.println("비밀번호가 틀렸습니다.");
			return 0;
		}
		
	}
	
	int getBalance() {
		System.out.println("현재잔액:" + n + "원");
		return n;
	}
	
}
