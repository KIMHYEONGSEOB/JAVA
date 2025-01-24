package quiz20;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapQuiz02 {

	public static void main(String[] args) {

		/*
		메뉴관리 시뮬레이터

		무한 반복문안에서 음식 메뉴를 입력받고, 해당 메뉴에 알맞은 내용을 채워 넣어주면 됩니다.

		 * 음식메뉴는 key로 등록하고 가격은 value로 등록합니다.
		음식 메뉴 정보
		1. 신규 메뉴 등록 2. 메뉴판 전체 보기 3. 메뉴판 수정 4. 메뉴판 삭제 5. 프로그램 종료

		1. 이미 등록된 메뉴인지 확인 후에 메뉴 등록
		2. 메뉴와 가격을 전부 출력
		3. 변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
		4. 변경할 메뉴를 받아서 메뉴가 있다면 삭제
		5. 프로그램 종료
		 */
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> food = new TreeMap<>();


		while(true) {

			System.out.println("1. 신규 메뉴 등록 2. 메뉴판 전체 보기 3. 메뉴판 수정 4. 메뉴판 삭제 5. 프로그램 종료");


			//1.
			try {
				switch (scan.nextInt()) {
				case 1:
					System.out.print("등록할 메뉴 입력: ");
					String str = scan.next();
					System.out.print(str + "의 가격 입력: ");
					Integer price = scan.nextInt();

					Set<String> keyset = food.keySet();

					for(String key : keyset) {
						if(str.equals(key)) {
							System.out.println("이미 등록된 메뉴 입니다!");
							break;
						}
					}
					food.put(str,price);

					break;
				case 2:
					Set <Entry<String, Integer>>entrySet = food.entrySet();
					for(Entry<String, Integer> entry : entrySet) {
						System.out.println("메뉴: " + entry.getKey()+ ", 가격:" + entry.getValue());
					}
					break;
				case 3:
					String modify = scan.next();
					if(food.containsKey(modify)) {
						System.out.print(modify + "의 변경할 가격을 입력해주세요: ");
						food.put(modify, scan.nextInt());
					}else {
						System.out.println(modify+ "는 등록된 메뉴가 아닙니다.");
					}


					break;
				case 4:
					System.out.print("삭제할 메뉴를 입력해 주세요: ");
					String remove = scan.next();
					if(food.containsKey(remove)) {
						System.out.print(remove + "가 삭제 되었습니다.");
						food.remove(remove);
					}else {
						System.out.println(remove+ "는 등록된 메뉴가 아닙니다.");
					}
					break;

				case 5:
					return;

				default:
					break;
				}
			}
			catch (Exception e) {
				System.out.println("잘못된 값 입력!");
				scan.nextLine();
			}
		}
	}
}
