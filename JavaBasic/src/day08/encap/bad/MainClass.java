package day08.encap.bad;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		me.year = 2025;
		me.month = 13;
		me.day = 111;
		me.ssn = "이게 뭔데?";
		
		me.info();
		
	}
}
