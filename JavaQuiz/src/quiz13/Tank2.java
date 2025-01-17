package quiz13;

public class Tank2 extends Unit2 {

	private boolean changeMode = false;
	
	public Tank2() {
		this.hp = 100;
	}
	@Override
	public void location() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	public void changeMode() {
		changeMode = !changeMode;
	}
	
}
