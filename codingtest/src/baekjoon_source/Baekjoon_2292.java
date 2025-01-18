package baekjoon_source;

import java.util.Scanner;

public class Baekjoon_2292 {
	//백준 2292 벌집
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int answer;
		//최초로 최단거리가 늘어나는 수
		int j = 2;
		//최단거리
		int i = 1;
		//입력값이 1보다 작거나 같으면 그대로 0출력
		if(n == 1) {
			answer = 0;
		}
		else {
			
			while(true){
				//입력값이 처음 늘어나는 최단거리 보다 클 경우
				if(n >= j + (i * 6)) {
					//j에 최단거리 * 6을 담음
					j += i * 6;
				}else {
					//아닐 경우 최단거리를 출력후 반복 종료
					answer = i;
					break;
				}
				//최단 거리를 1 늘려준다.
				i++;
			}
		}

		//마지막 값 까지 포함해야 하기에 값을 한개 더해줌
		System.out.println(++answer);
	}
}
