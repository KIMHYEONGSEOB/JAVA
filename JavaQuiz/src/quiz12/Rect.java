package quiz12;

public class Rect extends Shape {
	//사각형은 생성될 때 이름과, 변의 길이를 받도록 처리하고,
	//getArea()는 사각형의 넓이를 계산하도록 오버라이딩 처리
	//main에서 확인
	int w ;
	
	
	public Rect(String name , int w) {
		super(name);
		this.w =w;
	}
	public double getArea() {
		
		return w*w;
	}
	
}
