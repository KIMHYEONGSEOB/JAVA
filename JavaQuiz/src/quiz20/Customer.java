package quiz20;

public class Customer {

	private String name;
	private int arrivalTime;
	
	public Customer() {
		
	}
	
	public Customer(String name, int arrivaltime) {
		this.name = name;
		this.arrivalTime = arrivaltime;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	
}
