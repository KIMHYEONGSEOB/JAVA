package day06;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone phone = new Phone(); //생성자
		
		phone.info();
		
		Phone red = new Phone("블루");
		red.info();
		
		Phone black = new Phone("black", 30000);
		
		black.info();
		
		Phone white = new Phone("아이폰16프로", "White", 1550000);
		
		white.info();
		

	}
}
