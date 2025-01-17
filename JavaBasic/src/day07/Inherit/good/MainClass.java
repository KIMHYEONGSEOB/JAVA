package day07.Inherit.good;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person(); //그렇게 많이 쓸 일은 없음(공통 분모를 갖고있는 자식클래스가 있기에)
		p.name = "홍길동";
		p.age = 20;
		System.out.println(p.info());
		
		//상속받은 자식 클래스들
		Student s = new Student(); 
		s.name = "이순신";
		s.age = 30;
		s.studentId = "123123";
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		t.name = "홍길자";
		t.age = 40;
		t.subject = "역사";
		System.out.println(t.info());
	}
}
