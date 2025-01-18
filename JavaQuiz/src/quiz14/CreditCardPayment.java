package quiz14;

public class CreditCardPayment implements Payment {

	@Override
	public void pay(int amount) {

		System.out.println("신용카드로 [" + amount + "]원을 결제합니다.");
		
	}

	@Override
	public boolean validatePaymentDetails(String details) {
		
//		if(details.length() == 16) {
//			System.out.println("올바른 번호입니다.");
//			return true;
//		}
//		else {
//			System.out.println("올바르지 않은 번호입니다.");
//			return false;
//		}
		return details.length() == 16;
	}

	
}
