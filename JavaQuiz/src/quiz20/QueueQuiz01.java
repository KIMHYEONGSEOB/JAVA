package quiz20;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueQuiz01 {

	public static void main(String[] args) {

		/*
		 * 은행 대기열 시뮬레이터
		 * 
		 * Queue 인터페이스와 LinkedList를 활용하여 대기열을 관리하세요.
		 * 
		 * 손님 정보는 Customer라는 클래스로 생성하세요
		 * Customer은 name, arrivalTime을 가지고 있습니다.
		 * arrivalTime은 업무처리 소요시간 입니다
		 * 
		 * 손님은 60%의 확률로 도착하고 (랜덤.nextInt(100) < 60)
		 * 대기열이 비어있지 않을 때, 50%확률로 업무가 처리됩니다. (랜덤.nextInt(100) < 50)
		 * 
		 * 30회 시뮬레이터를 거쳤을 때, 총 소요시간과, 처리하지 못한 손님을 출력해 주세요.
		 * 
  			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			는 프로그램을 1초 정지 시키는 코드입니다
		 * 
		 * 
		 */

		//대기열
		
		//내가짠 코드
//		Queue<Customer> queue = new LinkedList<>();
//		
//		Random r = new Random();
//		int index = 1 ;
//		int sum = 0;
//		for(int i = 1 ; i <=30 ; i++) {
//			
//			//고객 업무 처리
//			if(!queue.isEmpty()) {
//				if(r.nextInt(100)<50) {
//					Customer c = queue.poll();
//					sum += c.getArrivalTime();
//					System.out.println(c.getName() + "업무 처리완료");
//				}
//			}
//			
//			//고객 입장
//			if(r.nextInt(100)<60) {
//				queue.offer(new Customer(index +"번 고객",r.nextInt(3)+1));
//				System.out.println(index + "번 고객 입장");
//				index++;
//			}else {
//				System.out.println("고객 안들어옴!");
//			}
//
//
//			System.out.println(queue.toString());
//			
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//
//		}
//		
//		System.out.println("\n남은 대기열" + queue.toString());
//		System.out.println(sum+"분 소요");
		
		Queue<Customer> queue = new LinkedList<>();
		
		Random ran = new Random();
		int sum = 0; //누적 시간
		
		for(int i = 1; i <= 30; i++) {
			if(ran.nextInt() < 60) {//손님이 도착했습니다!
				queue.offer(new Customer("customer"+i,ran.nextInt(3)));
				System.out.println("customer" + i + "손님이 도착 했습니다.");
			}
			System.out.println("현재 대기열:" + queue.toString());
			
			if(!queue.isEmpty() && ran.nextInt(100) < 50) {
				Customer c = queue.poll();
				sum += c.getArrivalTime(); //시간 누적
				System.out.println(c.getName() + "님의 업무가 처리되었습니다.");
			}
			try {
				Thread.sleep(1000); //1초 일시정지
			} catch (Exception e) {

			}
		}
		System.out.println("총 소요시간:" + sum);
		System.out.println("처리되지 못한 손님");
		for(Customer m : queue) {
			System.out.print(m.getName()+" ");
			
		}


	}
}
