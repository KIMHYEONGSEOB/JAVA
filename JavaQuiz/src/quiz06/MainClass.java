package quiz06;

public class MainClass {

	public static void main(String[] args) {
		
		MyCart ct = new MyCart(10000);
		
		ct.buy("tv");
		ct.buy("radio");
		ct.buy("com");
		ct.buy("radio");
		ct.buy("radio");

	}
}
