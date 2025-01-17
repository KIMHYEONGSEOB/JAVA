package day09.poly.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		//다형성이라는 개념이 없다면?
		
//		Student s1 = new Student("홍길동", 20, "123");
//		Student s2 = new Student("김길동", 20, "456");
//		Student s3 = new Student("이길동", 20, "789");
//
//		Teacher t1 = new Teacher("최길동",40,"체육");
//		Teacher t2 = new Teacher("박길동", 50, "국어");
//		
//		Employee e1 = new Employee("유길동", 60, "예능부");
				
		//학생 배열
//		Student[] student = {s1,s2,s3/*, t1*/};
//		Teacher[] teachers = {t1, t2};
//		Employee[] employees = {e1};
		
		//다형성을 적용해보면??
		Person s1 = new Student("홍길동", 20, "123");
		Person s2 = new Student("김길동", 20, "456");
		Person s3 = new Student("이길동", 20, "789");

		Person t1 = new Teacher("최길동",40,"체육");
		Person t2 = new Teacher("박길동", 50, "국어");
		
		Person e1 = new Employee("고길동", 60, "예능부");
		
		Person[] persons = {s1,s2,s3,t1,t2,e1};
		
		for(Person p: persons) {
			System.out.println(p.info());
		}
		System.out.println("==========================");
		
		new House().showStudent(t1);
		new House().showStudent(e1);
		new House().showStudent(s1);
		
	}
}
