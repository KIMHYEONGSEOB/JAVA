package quiz23;

public class MainClass {

	public static void main(String[] args) {
		
		Video th1 = new Video();
		Download th2 = new Download();
		
		Thread thread1 = new Thread(th1);
		Thread thread2 = new Thread(th2);
		thread1.start();
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread2.start();
		
	}
}
