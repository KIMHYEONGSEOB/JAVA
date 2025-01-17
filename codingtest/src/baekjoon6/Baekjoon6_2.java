package baekjoon6;

import java.util.Scanner;

public class Baekjoon6_2 {
	
//3003번 킹, 퀸, 룩, 비숍, 나이트, 폰
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		전체 체스말의 배열을 초기화 시켜준다.
		int ch[] = {1,1,2,2,2,8};

//		전체 체스말의 배열에 입력받은 값을 빼주고 다시 저장하고 다음 인덱스로 넘어가는 반복문
		for(int i = 0 ; i < ch.length ; i++) {
			ch[i] -= scan.nextInt();
		}
		
		//출력
		for(int i = 0 ; i < ch.length ; i++) {
			System.out.print(ch[i]+" ");
		}
	}
}
