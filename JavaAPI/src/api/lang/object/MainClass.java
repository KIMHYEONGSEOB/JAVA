package api.lang.object;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 오브젝트 클래스
		 * toString - 객체의 주소를 문자열로 반환
		 * equals - 객체의 주소값을 비교해서, 같은 객체라면 true
		 * hashCode - 객체의 값을 고유한 숫자로 반환
		 * getClass - 현재 실행되는 클래스를 반환.
		 * clone (protected) - 객체 복사
		 * finalize - 객체가 소멸될 때 동작한다. (정확한 시점을 알기가 어렵다)
		 */
		Person person = new Person("홍길동");
		
//		String s = 
		
		System.out.println(person.toString());
		
		Person person2 = new Person("홍길동");
//		boolean b = person.equals(person);
		System.out.println(person.equals(person));
		
		boolean b2 = person.equals(person2);
		System.out.println(b2);
		
		System.out.println("객체의 고유한 숫자값: " + person.hashCode());
		System.out.println("현재 실행되는 객체를 반환: "+person.getClass());


			try {
				Person clonePerson = (Person)person.clone();
				System.out.println(clonePerson);
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}

			//finalize
			person = null;
			System.gc();
			
	}

	
}
