package api.io.readwrite;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterEx {
	
	public static void main(String[] args) {
		
		/*
		 * 문자를 써서 파일을 저장할 때 사용하는 클래스 Filewriter이다.
		 * 2바이트 기반으로 동작하기 때문에, 한글처리가 가능함
		 */
		
		String path = "C:\\Users\\김형섭\\Desktop\\course\\java\\File\\bye.txt";
		Writer fw = null;
		
		try {
			fw = new FileWriter(path);
			//  \r 캐리지 리턴이라고 한다! 커서를 맨 왼쪽으로 옮겨준다.
			String str = "지금은 4시 12분 입니다~ \r\n아 집에 가고 싶다~\r\n저 먼저 가도 되나요??";
			fw.write(str);
			System.out.println("파일 출력 완료!!");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
			}
		}
	}
}
