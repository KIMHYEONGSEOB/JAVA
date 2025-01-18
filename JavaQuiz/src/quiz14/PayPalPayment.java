package quiz14;

public class PayPalPayment implements Payment {

	String Pin = "1234";
	@Override
	public void pay(int amount) {

		System.out.println("PayPal로 [" + amount + "]원을 결제합니다.");

	}

	@Override
	public boolean validatePaymentDetails(String details) {

//		if(Pin.equals(details)) {
//			System.out.println("일치하는 PIN번호 입니다.");
//			return true;
//		}
//		else {
//			System.out.println("일치하지 않는 PIN번호 입니다.");
//			return false;
//		}

		return Pin.equals(details);
	}

}
