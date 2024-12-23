package baekjoon2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon2_7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String s  = (scanner.nextLine());
//		첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어져야 하기 떄문에
//		토크나이저 라이브러리로 토큰 별로 나눈다.
		StringTokenizer token = new StringTokenizer(s);
		//나눈 토큰을 int형 정수로 형변환
		int a = Integer.parseInt(token.nextToken());
		int b = Integer.parseInt(token.nextToken());
		int c = Integer.parseInt(token.nextToken());
		
		if(a==b&&b==c) { //모든 값이 같을 경우
			System.out.println(10000+a*1000);
		}
		
		else if(a==b||b==c||c==a) { //한쌍이라도 같을 경우

		int med = (a==b)? a*100 : (b==c)? b*100 : c*100;
		System.out.println(med+1000);
		}
		
		else{ //그 외에 하나라도 같지 않을 경우
			
			int max = a>b? a:b;
			System.out.println(max > c? max*100:c*100);
	
		}
	}
	}
