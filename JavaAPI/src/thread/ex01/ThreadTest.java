package thread.ex01;

public class ThreadTest implements Runnable {

	//1. runnable인터페이스를 상속받아서 사용하는 방법
	
	int num = 0;
	
	@Override
	public /*synchronized*/ void run() {
		//synchronized - 쓰레드가 동기화 메서드를 점유할 때, 다른 쓰레드의 침범을 막아준다.
		for(int i = 1 ; i <= 10 ; i++) {
			
			if(Thread.currentThread().getName().equals("A")) {
				
			}
			num++;
			System.out.println(Thread.currentThread().getName() + " num값: " + num);
			
			//일시정지
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	
}
