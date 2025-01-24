package quiz17;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {


		/*
		 * 1. id문자열을 입력 받는다.
		 * 2. 아이디는 공백을 포함해서 받을 수 있다. nextline()
		 * 3. 공백을 제외하고, 5글자 미만이면, 다시 입력 받습니다.
		 * 4. 5글자 이상이라면 "id 등록" 을 출력하고 종료
		 */

		Scanner scan = new Scanner(System.in);



		while(true) {
			String id = scan.nextLine();

			id = id.replace(" ", "");

			if(id.length() >= 5) {
				System.out.println('"'+ id + '"' + "로 id 등록");
				return;
			}else {
				System.out.print("5글자 이상으로 다시 입력 해주세요: ");
			}
		}
	}
}
