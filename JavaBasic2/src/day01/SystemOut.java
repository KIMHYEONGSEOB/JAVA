package day01;

public class SystemOut {

	public static void main(String[] args) {
		//main 쓰고 crtl + space 누르면 실행함수 자동 생성
		//sysout이라고 적고 ctrl + space 출력문 생성

		/*
		 한줄주석 - ctrl + / 
		 코드이동 - alt + 방향키

		 프로젝트 export - general탭 -> archive 선택
		 프로젝트 import - general탭 -> project into workspace선택
		 */


		//1. println() - 개행을 마지막에 포함
		System.out.println("곧 쉬는 시간이네");
		System.out.println("아 나는 집에 가야겠다. 나만 간다");

		//2. print() - 개행 미포함
		System.out.print("줄바꿈 없다~\n");
		System.out.print("줄바꿈 없다~\n");

		//3. printf() - 형식 지정 출력문
		/*
		 * 서식문자
		 * \n - 줄바꿈
		 * \t - 탭버튼 정렬
		 * %d - 정수
		 * %s - 문자
		 * %f - 실수
		 **/
		System.out.printf("맨 처음에 하고싶은 말을 적습니다. %s은 %d월 %d일 입니다.", "제 생일", 10, 3);
		System.out.printf("\n원주율은 %f 입니다.",3.14);
		System.out.printf("\n원주율은 %.2f 입니다.", 3.14);
		System.out.printf("\n원주율은 %.3f 입니다.", 3.141592);
		System.out.printf("\n%dx%d=%d %dx%d=%d",2,1,2*1,2,2,2*2);
	}

}
