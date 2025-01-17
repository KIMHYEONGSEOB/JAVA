package day08.encap.obj;

public class Hotel {

	private Chef chef;
	private Employee emp;
	
	//호텔이 생성될 때, chef를 같이 생성한다.
	public Hotel() {
		this.chef = new Chef();
		this.emp = new Employee();
	}
	
	//chef변수의 getter, setter
	//setter - 매개변수로 객체를 받는타입
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public Chef getChef() {
		return chef;
	}
	
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	public Employee getEmp() {
		return emp;
	}
	//getter - 객체를 반환으로 돌려주는 형태
}
