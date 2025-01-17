package day08.this_.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person("홍길동", 20);
		Person p2 = new Person("이순신");
		Person p3 = new Person();
		
		System.out.println(p.info());
		System.out.println(p2.info());
		System.out.println(p3.info());
		
	}
}
