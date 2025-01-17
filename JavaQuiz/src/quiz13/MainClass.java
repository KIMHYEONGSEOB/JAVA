package quiz13;

public class MainClass {

	public static void main(String[] args) {
		
		Marine marine = new Marine();
		DropShip dropship = new DropShip();
		dropship.ride(marine);
		Tank tank = new Tank();
		dropship.ride(tank);
		dropship.ride(marine);
		dropship.ride(marine);
		dropship.ride(marine);
		dropship.ride(marine);
		dropship.ride(marine);
	}
}
