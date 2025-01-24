package quiz21;

public class Data {

	private String name;
	private int age;
	private String email;
	private String adr;
	
	public Data() {
		
	}
	
	public Data(String name, int age, String email, String adr) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.adr = adr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	
}
