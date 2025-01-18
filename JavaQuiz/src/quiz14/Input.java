package quiz14;

import java.util.Scanner;

public class Input {

	public static void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 신용카드 2. 페이팔결제");
		int i =scan.nextInt();
		if(i == 1){
			Payment card  = (Payment) new CreditCardPayment();
			card.pay(scan.nextInt());
			card.validatePaymentDetails(scan.next());
		}
		else if(i == 2) {
			Payment card = (Payment) new PayPalPayment();
			card.pay(scan.nextInt());
			card.validatePaymentDetails(scan.next());
		}
		else {
			System.out.println("잘못된 값 입력");
		}
	}
}
