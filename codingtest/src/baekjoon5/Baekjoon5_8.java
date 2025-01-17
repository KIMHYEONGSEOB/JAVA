package baekjoon5;

import java.util.Arrays;
import java.util.Scanner;

//1152 단어의 개수
public class Baekjoon5_8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//입력받은 문장을 .trim()으로 앞과 뒤 공백을 자른뒤 .split()으로 여백기준으로 단어를 string 배열에 담음

		String arr[] = scan.nextLine().trim().split(" ");
		//문제는 아무것도 없는 공백만 들어와도 공백이라는 값을 담기에 배열에 들어있는 값이 공백일 경우의 조건을 건다.
		if(arr[0].equals("")) {
			System.out.println("0");
		}else {
			System.out.println(arr.length);
		}
	}
}

