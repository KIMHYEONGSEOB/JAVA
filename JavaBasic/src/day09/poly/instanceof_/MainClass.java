package day09.poly.instanceof_;

public class MainClass {

	public static void main(String[] args) {
		
		Person hong = new Student("홍길동", 10, "123");
		Person park = new Teacher("박찬호", 20, "체육");
		Person choi = new Employee("최강창민", 30, "가수");
		
		printPerson(hong);
//		Arrays.to
	}
	
	public static void printPerson(Person p) {
		
		//p가 Student였으면 Student 캐스팅
		//p가 Teacher였으면 Teacher 캐스팅
		if(p instanceof Student) {//p가 student였으면 true
			Student s = (Student)p;
			System.out.println("p는 원래 Student 였음");
			System.out.println(s.info());
		}else if(p instanceof Teacher) {
			System.out.println("p는 원래 Teacher 였음");
			Teacher t = (Teacher)p;
		}else if(p instanceof Employee) {
			System.out.println("p는 원래 Employee 였음");
			Employee e = (Employee)p;
		}
	}
}
