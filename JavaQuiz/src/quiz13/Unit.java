package quiz13;

public abstract class Unit {

	public int hp;
	public int x;
	public int y;


	public void location() {
		System.out.println("x: " + x + " " + "y: " + y +"위치에 있습니다.");
	};
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	};
	public void stop() {
		
	}
	
	
	
}
