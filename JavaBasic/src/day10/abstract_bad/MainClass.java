package day10.abstract_bad;

public class MainClass {

	public static void main(String[] args) {
		
		SeoulStore store = new SeoulStore();
		
		
		store.apple();
		store.grape(); //오버라이드가 되지 않으면, 잘못된 메서드 실행이 될 수 있
		store.melon();
		store.orange();
		
		
		
	}
}
