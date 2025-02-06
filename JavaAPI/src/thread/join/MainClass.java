package thread.join;

public class MainClass {

	public static void main(String[] args) {
		
		TestA a = new TestA();
		Thread thread = new Thread(a);
		
		thread.start();
		
		try {
			thread.join();//이 쓰레드가 종료될때까지 다른쓰레드를 정지 시킨다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("A쓰레드의 계산결과: " + a.sum);
		System.out.println("메인쓰레드 종료");
		
	}
}
