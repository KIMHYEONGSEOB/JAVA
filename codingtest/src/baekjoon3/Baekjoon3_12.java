package baekjoon3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon3_12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		//EOF를 만들기 위해 scanner 객체의 다음 토큰이 있는지 확인한다 없을시 false
		while(scanner.hasNext()) {
			StringTokenizer tk = new StringTokenizer(scanner.nextLine());
			System.out.println(Integer.parseInt(tk.nextToken())+Integer.parseInt(tk.nextToken()));
		}
	}
}
