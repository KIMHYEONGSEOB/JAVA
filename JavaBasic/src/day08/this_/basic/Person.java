package day08.this_.basic;

public class Person {
	//공통클래스(부모클래스)

	String name;
	int age;
	
	//생성자 연결 - this()
	//1. 중복되는 프로그램 코드를 생성자 연결을 통해서 줄여 줄 수 있음
	//2. this()는 생성자의 첫번째 줄에 있어야 한다.
	Person(String name, int age){
		this.name = name;
		this.age = age;
//		System.out.println(this);//나의 주소값
	}
	
	Person(String name){
		this(name, 1);

	}
	
	Person(){
		this("이름x", 1);
	}
	String info() {
		return "이름: " + name + " 나이: "+ age;
	}
}
