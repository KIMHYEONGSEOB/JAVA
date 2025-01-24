package quiz20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz03 {

	public static void main(String[] args) {

		/*
		 * 회원 정보 프로그램 시뮬레이터
		 * 
		 * 무한 반복문 안에서 메뉴를 입력받고, 해당 메뉴에 알맞은 내용을 채워 넣어주면 됩니다.
		 * 
		 * 메뉴 1.유저등록, 2.전체회원정보출력, 3.회원정보검색, 4.회원정보삭제, 5.프로그램종료
		 * 
		 * 1. 스캐너로 name age 입력받아서 user객체를 리스트에 추가
		 * 2. 모든 회원 정보를 출력하면 된다.
		 * 3. 찾을 이름을 입력받아서 이름이 있으면 이름과 나이를 출력해 줍니다. 찾는 이름이 없을면 "~~~님은 이목록에 없습니다.출력
		 * 4. 삭제할 이름을 입력받아서, 동일한 이름을 가진 회원이 있으면 User를 삭제
		 * 5. 종료
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		List<User> list = new ArrayList<>();

		 re: while(true) {
			System.out.println("======================================================================");
			System.out.println("메뉴 1.유저등록, 2.전체회원정보출력, 3.회원정보검색, 4.회원정보삭제, 5.프로그램종료 중 선택");
			System.out.println("======================================================================");
			switch (scan.nextInt()) {
			case 1:
				System.out.print("이름: ");
				String name = scan.next();
				System.out.print("나이: ");
				int a = scan.nextInt();
				list.add(new User(name, a));
				break;
			case 2:
				for(int i = 0 ; i < list.size() ; i++) {
					System.out.println((i+1)+"번째 회원 이름: " + list.get(i).getName() + " 나이: "+ list.get(i).getAge());
				}
				break;
			case 3:
				System.out.print("찾을 이름을 입력해주세요: ");
				String s = scan.next();
				
//				for(int i = 0 ; i < list.size() ; i++) {
//					if(list.get(i).getName().equals(s)) {
//						System.out.println("이름: " + list.get(i).getName() + " 나이: "+ list.get(i).getAge());
//						continue re ;
//					}
//				}
//				System.out.println( s + "님은 이 목록에 없습니다.");
				
				boolean bool = true;
				
				for(int i = 0; i < list.size(); i++) {
					User u = list.get(i);
					String n = u.getName();
					
					if(s.equals(n)) {
						System.out.println("찾은정보:" + u.getName()+", "+u.getAge());
						bool = false;
						break;
					}
				}
				if(bool) {
					System.out.println( s + "님은 이 목록에 없습니다.");
				}
				
				

				break;
			case 4:
				System.out.print("삭제할 이름을 입력해주세요: ");
				String str = scan.next();
				for(int i = 0 ; i < list.size() ; i++) {
					if(list.get(i).getName().equals(str)) {
						System.out.println("이름: " + list.get(i).getName() + " 나이: "+ list.get(i).getAge()+ " 삭제 되었습니다.");
						list.remove(i);
						continue re  ;
					}
				}
				System.out.println( str + "님은 이 목록에 없습니다.");

				
				
				break;
			case 5:
				scan.close();
				return ;

			default:
				break;
			}
		}

	}
}
