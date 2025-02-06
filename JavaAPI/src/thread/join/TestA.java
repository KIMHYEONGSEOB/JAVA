package thread.join;

public class TestA implements Runnable{

	public int sum = 0;
	
	@Override
	public void run() {
		
		
		for(int i = 1 ; i <= 100; i++) {
			sum+= i ;
			System.out.println("A현재누적합: " + sum);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
