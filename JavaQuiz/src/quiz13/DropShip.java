package quiz13;

public class DropShip extends Unit{

	int x = 0;
	int y = 0;
	int hp = 60;

	Unit[] arr  = new Unit[8];

	public void ride(Unit unit){
		if(unit instanceof Tank) {
			for(int i = 0 ; i < arr.length ; i++) {
				if(arr[i]==null) {
					if(i>4) {
						System.out.println("못들어가요");
					}
					else {
						for(int j = 0; j < 4 ; j++) {
							arr[i+j] = unit;
						}
					}
					System.out.println("탱크");
					return;
				}
			}
		}
		else if(unit instanceof Marine) {
			for(int i = 0 ; i < arr.length ; i++) {
				if(arr[i]==null) {
					if(i<=7) {
						arr[i] = unit;
					}
					else {
						System.out.println("못들어가요");
					}
					System.out.println("마린");
					return;
				}
			}
		}
	}
}