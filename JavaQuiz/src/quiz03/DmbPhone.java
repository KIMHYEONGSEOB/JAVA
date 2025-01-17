package quiz03;

public class DmbPhone extends Phone {
	//DmbPhone은 Phone클래스를 상속 받습니다.
	//channel 변수를 생성하고, color, model, channel을 초기화 하는 생성자를 작성하세요.
	//메인메서드가 정상적으로 실행되도록 메서드를 추가하세요.
	int channel;
	boolean bool = true;
	
	DmbPhone(String m, String c, int ch){
		model = m;
		color = c;
		channel = ch;
	}
	
	void turnOnDmb() {
			if(bool) {
			System.out.println("TV를 켭니다");
			bool = false;
			}
			else {
				System.out.println("TV가 이미 켜져있습니다");
			}
	}
		
	void changeChannel(int a) {
		channel = a;
		System.out.println(channel+"번 채널로 변경");
	}
	
	void turnOffDmb() {
		if(bool) {
		System.out.println("TV가 이미 꺼져있습니다");
		}
		else {
			System.out.println("TV를 끕니다");
			bool = true;
		}
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	};

}
