package ramda.anonymous.basic;

//인터페이스 선언
interface Car{
	void run();
}

class Tico implements Car{
	@Override
	public void run() {
		System.out.println("티코~");
	}
}

public class Garage {
	//딱 한번만 사용하고, 재활용 할 생각이 없는 클래스는 익명객체로 생성할 수 있다.
	public Car car = new Car() {
		@Override
		public void run() {
			System.out.println("익명객체 티코 입니다~@");	
		}
	};
	
	public static void main(String[] args) {
		Tico tc = new Tico();
		tc.run();
		Garage g = new Garage();
		g.car.run();
		Car c = new Car() {
			@Override
			public void run() {
				System.out.println("메인에서 선언한 익명객체입니다");	
				
			}
		};
		c.run();
	}
}


