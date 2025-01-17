package day08.encap.obj;

public class MainClass {

	public static void main(String[] args) {
		
		Hotel hotel = new Hotel();
		
	
		//setter
		hotel.setChef(new Chef());
		
		//getter
		Chef chef = hotel.getChef();
		
		chef.cook();
		
		hotel.setEmp(new Employee());
		
		
	}
}
