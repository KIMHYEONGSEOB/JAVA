package day09.static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
		
		System.out.println(s1 == s2 && s3 == s4);
		
		s1.getInstance();
	}
}
