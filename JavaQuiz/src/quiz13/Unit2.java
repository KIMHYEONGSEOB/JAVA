package quiz13;

public abstract class Unit2 {

	public int x;
	public int y;
	public int hp;
	
	public abstract void location();
	public abstract void move(int x, int y);
	public  void stop() {
		System.out.println("정지");
	};
	
}
