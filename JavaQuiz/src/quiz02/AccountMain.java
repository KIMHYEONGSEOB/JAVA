package quiz02;

public class AccountMain {

	public static void main(String[] args) {
		
		Account ac = new Account("김형섭", "1234", 330000);
		
		ac.getBalance();
		
		ac.deposit(10000);
		ac.getBalance();
		
		ac.withDraw(34000);
		ac.getBalance();
	}
}
