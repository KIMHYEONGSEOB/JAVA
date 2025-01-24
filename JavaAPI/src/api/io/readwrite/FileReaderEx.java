package api.io.readwrite;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderEx {
	
	public static void main(String[] args) {
		
		/*
		 * 2바이트 기반으로 문자를 읽어들일때 사용하는 클래스 FileReader
		 * 
		 */
		
		Reader rd = null;
		
		String path = "C:\\\\Users\\\\김형섭\\\\Desktop\\\\course\\\\java\\\\File\\\\bye.txt";
		
		try {
			
			rd = new FileReader(path);
			int result;
			while((result = rd.read()) !=-1) { //한글자를 읽어들임, 더 이상 읽을 값이 없으면 -1
				System.out.print((char)result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rd.close();
			}catch (Exception e) {
			}
		}
		
	}

}
