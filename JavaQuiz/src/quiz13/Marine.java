package quiz13;

public class Marine extends Unit {
	
	static int attack;
	static int armor;

	public Marine(){
		hp= 60 ;
		x = 0;
		y = 0;
		
	}
	static {
		attack = 6;
		armor = 0;
	}
	
	public void stimpack() {
		attack ++;
	}

	public void stop() {
		
	}

	
}
