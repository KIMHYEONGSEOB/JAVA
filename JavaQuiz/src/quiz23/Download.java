package quiz23;

public class Download implements Runnable{

//	@Override
//	public void run() {
//
//		System.out.println("음악을 15초간 재생합니다.");
//		
//		try {
//			Thread.sleep(15000);
//			System.out.println("음악 재생이 끝났 습니다.");
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	
	@Override
	public void run() {

//		StringBuilder sb = new StringBuilder(); // 스트링 버퍼는 쓰레드환경에서 동기화의 문제가 발생함
												// 스트링 빌더는 쓰레드환경에서 사용하기위한 용도
	
		System.out.print("동영상 다운을 시작한다: ");
		for(int i =1; i<=10; i++) {
//			sb.append("*");
			System.out.print("*");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n동영상 다운로드 종료");
	}
}
