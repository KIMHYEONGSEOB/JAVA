package api.io.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamEx {

	public static void main(String[] args) {
		
		/*
		 * io패키지에 모든 클래스는 생성자가 throws키둬으를 던지ㅗ 있어서 
		 * 모두 try~catch 불록과 함께 사용한다.
		 */
		
		String path = "C:\\Users\\김형섭\\Desktop\\course\\java\\File\\hello.txt";
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(path);
		String str = "길동아! 잠깨!";
		fos.write(str.getBytes());
		
		}
		catch(IOException E){
			E.printStackTrace();
		}
		finally {
			try {
				fos.close();
			}catch (Exception e) {
			}
			
		}
	}
}
