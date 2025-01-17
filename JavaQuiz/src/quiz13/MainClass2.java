package quiz13;

public class MainClass2 {

	public static void main(String[] args) {
		
		Marine2 m1 = new Marine2();
		Marine2 m2 = new Marine2();
		Marine2 m3 = new Marine2();
		
		Tank2 t1 = new Tank2();
		
		DropShip2 ship = new DropShip2();
		ship.ride(m1);
		ship.ride(m2);
		ship.ride(t1);
		ship.ride(t1);
		
	}
}
