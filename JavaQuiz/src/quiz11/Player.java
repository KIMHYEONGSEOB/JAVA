package quiz11;

public class Player {

	public String name;
	public int hp;
	public int mp;
	
	
	public void info() {
		System.out.println("닉네임: " + name);
		System.out.println("hp: " + hp + ", mp: " + mp);
		System.out.println("---------------------------------");
	}
}
