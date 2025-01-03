package day03;

public class IfEx01 {
	public static void main(String[] args) {
	
		//랜덤한 정수값
		int point = (int)(Math.random()*100)+1;
		
		System.out.println("점수: " + point);
		
		if(60<=point) {
			System.out.println("정처기 합격 입니다!");
		}
		else {
			System.out.println("불합격 입니다!");
		}
	}
}
