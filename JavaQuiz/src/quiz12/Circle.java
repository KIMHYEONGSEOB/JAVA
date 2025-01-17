package quiz12;

public class Circle extends Shape {

	int b ;
	
	public Circle(String name, int b) {
		super(name);
		this.b = b;
	}
	
	
	@Override
	public double getArea() {
		
		return b*b*Math.PI;
	}
	//원형은 생성될 때 이름과, 반지름의 길이를 받도록 처리하고,
	//getArea()는 원형의 넓이를 계산하도록 오버라이딩 처리
	//main에서 확인
}
