package day01;

public class SystemOut {

	public static void main(String[] args) {
		// main이라고 작성하고 crtrl + space를 누르면 메인함수가 자동생성된다.
		/*
		  실행 단축키 - ctrl + f11 
		  전체 선택 단축키 - ctrl + a 
		  되돌리기 단축키 - ctrl + z 
		  정렬 단축키 - 전체 선택후 ctrl + i
		  코드를 옮길때 - alt + 방향키
		 */

		// 개행을 포함하는 println() - 맨 마지막에 \n을 자동으로 넣어준다.
		System.out.print("안녕하세요!?");
		System.out.print("금요일입니다.");
		System.out.print("집에 가고 싶어요!");

		// 개행이 없는 print()
		System.out.print("줄바꿈이 없음\n");

		// 형식지정 출력문 printf()
		// 서식문자
		/*
		 \n 줄바꿈 
		 \t tab 버튼 만큼 8칸 띄어쓰기 
		 %d 정수를 입력받음 
		 %s 문자열을 입력받음 
		 %f 실수값을 입력받음
		 */
		System.out.printf("%s가 하고 싶은말을 맨 앞에 적는다 %d시 %d분전\n", "형섭이", 5, 7);
		System.out.printf("%d + %d = %d", 5, 7, 5 + 7);
	}

}
