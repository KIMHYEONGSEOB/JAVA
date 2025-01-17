package quiz13;

public class DropShip2 extends Unit2 {

	private Unit2[] arr = new Unit2[8];
	private int index = 0;
	
	@Override
	public void location() {
		
	}

	@Override
	public void move(int x, int y) {

		
	}
	
	public void ride(Unit2 unit) {
		if (unit instanceof Marine2&& index <= 7) {
			arr[index] = unit;
			index++;
		}else if(unit instanceof Tank2 && index <=4) {
			arr[index] = unit;
			index += 4;
		}else {
			System.out.println("수송선에 자리가 부족합니다.");
		}
	}
	
}
