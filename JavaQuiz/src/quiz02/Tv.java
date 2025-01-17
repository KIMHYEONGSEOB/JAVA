package quiz02;

public class Tv {
	  /*
		멤버변수
		회사명 - String
		채널번호 - int
		전원 - boolean
		
		생성자
		기본 생성자는 회사명을 초기화 LG
		
		메서드
		정보출력 - info() : 반환 void - 티비의 정보를 출력
		채널변경 - changeChannel(int) : 반환 int - 현재 채널을, 전달받은 값으로 변경하는 기능
	 	전원켜기 - power() : 반환 void - 전원을 껐다 켰다 하는기능
		*/
	
	String com;
	int ch;
	boolean pow;
	
	Tv(){
		com = "LG";
	}
	
	void info(){
		System.out.println("----tv 정보----");
		System.out.println("제조사명:"+ com);
		System.out.println("채널" + ch);
		System.out.println(pow ? "tv가 켜져있습니다": "tv가 꺼져있습니다.");
	}
	int changeChannel(int a){
		if(pow == false) {
			System.out.println("tv가 꺼져있습니다");
			return ch;
		}
		else {
		System.out.println("채널이 " + a + " 번으로 변경 되었습니다.");
			ch = a;
			return ch;
		}
	}
	void power() {
		
		System.out.println(pow ? "전원 종료" : "전원 실행");
		pow = !pow ;
		
	}
	
}
