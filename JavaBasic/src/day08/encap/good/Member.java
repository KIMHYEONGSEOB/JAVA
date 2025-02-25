package day08.encap.good;

public class Member {

	//특별한 기능이 있는게 아니고, 단순히 값을 저장하는 용도의 클래스
	//DTO = Data Transfer Object
	
	//getter, setter를 단축키로 만들기
	//source -> generate getter,setter
	//alt + shift + s -> generate getter,setter
	
	
	//생성자 - 기본 생성자 1, 멤버변수 개수만큼 값을 전달받는 생성자 1
	private String name;
	private int age;
	private String address;
	private String phone;
	private boolean isApprove;
	
	
	public String getName() {
		return name;
	}
	public Member(String name, int age, String address, String phone, boolean isApprove) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.isApprove = isApprove;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isApprove() {
		return isApprove;
	}
	public void setApprove(boolean isApprove) {
		this.isApprove = isApprove;
	}
}
