package quiz23;

public class Video implements Runnable{


	//	@Override
	//	public void run() {
	//
	//		System.out.print("동영상을 다운로드합니다.: ");
	//
	//		try {
	//			Thread.sleep(1);
	//			int sum = 0;
	//			while(true) {
	//				Thread.sleep(1000);
	//				System.out.print("*");
	//				sum++;
	//				if(sum==10) {
	//					break;
	//				}
	//			}
	//			System.out.println(""
	//					+ "\n다운로드가 완료 0되었습니다.");
	//		} catch (InterruptedException e) {
	//			e.printStackTrace();
	//		}

	@Override
	public void run() {
		System.out.println("음악실행 ");
		for(int i = 1 ; i <= 15 ; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("음악종료");
		
	}
}

