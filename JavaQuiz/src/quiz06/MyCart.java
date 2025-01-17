package quiz06;

import java.util.Arrays;

public class MyCart extends Cart{
	

	//나의 장바구니 클래스 만들기

	//1. MyCart의 생성자에서는 int매개변수를 하나 받으며, 금액을 초기화합니다. tv=300원, com=400원, radio=500원 으로 초기화
	MyCart(int a){
		money = a;
		tv = 300;
		com = 400;
		radio = 500;
	}




	//2. buy(), add(), info() 메서드를 오버라이딩 합니다.
	void buy(String product) {
		if(money<300) {
			System.out.println("금액부족");
			return;

		}
//		else {
//			if(product.equals("tv")) {
//				money -= tv;
//				add(product);
//			}else if(product.equals("com")) {
//				money -= com;
//				add(product);
//			}else if(product.equals("radio")) {
//				money -= radio;
//				add(product);
//			}
//			else {
//				System.out.println("상품없음");
//				return;
//			}
//		}
		if(!(product.equals("tv") || product.equals("com") || product.equals("radio"))) {
			System.out.println("상품없음");
			return;
		}
		
		switch(product) {
		
		case "com":
			if(money < 400) {
				System.out.println("[금액부족]");
			}
			money -= com;
			return;
		case "tv":
			if(money < 300) {
				System.out.println("[금액부족]");
			}
			money -= tv;
			return;
		case "radio":
			if(money < 500) {
				System.out.println("[금액부족]");
				return;
			}
			money -= radio;
			break;
		default:
			break;	
		}
		add(product); //추가하기 기능 호출
	}

	/*
	 * buy()의 기능
	 * 1. money가 300보다 작으면 "금액부족" 출력후 메서드를 종료.
	 *    매개변수가 tv, com, radio가 아니더라도 "상품없음" 출력 후 종료
	 * 2. 매개변수 tv라면 금액에서 tv가격을 빼고 add(상품)을 호출
	 *    매개변수 com라면 금액에서 com가격을 빼고 add(상품)를 호출
	 *    매개변수 radio라면 금액에서 radio를 빼고 add(상품)을 호출
	 */
	void add(String product) {
//		if(i >= cart.length) {
//			String[] temp = new String [cart.length * 2];
//			for(int j = 0 ; j <cart.length ; j++) {
//				temp[j] = cart[j];
//			}
//			cart = temp;
//			temp = null;
//		}
//		for(int j = 0 ; j < cart.length ; j++) {
//			if(cart[j]==null) {
//				cart[j] = product;
//				i++;
//				break;
//			}
//
//		}
//		info();
		if(i >= cart.length) {
			//2배 크기의 새로운 배열
			String[] newCart = new String[cart.length * 2];
			//배열의 복사
			for(int i = 0; i < cart.length; i++) {
				newCart[i] = cart[i];
			}
			cart = newCart;
			newCart = null;
		}
		cart[i] = product;
		i++; //다음번째에 상품이 담겨야 하니까 1증가
		
		info();
	}

	/*
	 * add()의 기능
	 * 1. 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 *    -기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 *    -기존의 장바구니 값을 새로운 배열에 복사.
	 *    -새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 2. product를 장바구니에 담는다.
	 * 3. info() 메서드를 호출
	 */

	void info() {
//		int bk = 0;
//		for(int j = 0; j < cart.length ; j++) {
//			if(cart[j]==null){
//				break;
//			}
//			if(cart[j].equals("tv")) {
//				bk += tv;
//				System.out.print(cart[j]+" ");
//			}else if(cart[j].equals("com")) {
//				bk += com;
//				System.out.print(cart[j]+" ");
//			}else if(cart[j].equals("radio")) {
//				bk += radio;
//				System.out.print(cart[j]+" ");
//			}
//
//		}
		String str = "[";
		for(int j = 0 ; j < i ; j++) {
			str += cart[j] + " ";
		}
		str += "]";
		System.out.println(str + "\n남은금액:" +money);
	}
	/*
	 * info()의 기능
	 * 
	 * 2. 장바구니에 담긴 물건 목록을 + 금액을 더해서 출력
	 * 3. 메인에서 buy()를 실행 시킨다.
	 */




	
}
