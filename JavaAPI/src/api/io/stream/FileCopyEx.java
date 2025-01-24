package api.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class FileCopyEx {

	public static void main(String[] args) {
		//1바이트 단위로 파일 읽고 쓰기
		InputStream fis =null;
		OutputStream fos =null;
		
		String inputpath = "C:\\Users\\김형섭\\Desktop\\course\\java\\File\\copy.png";
		String outputpath = "C:\\Users\\김형섭\\Desktop\\course\\java\\Filecopy\\hello.png";
		
		try {
			fis = new FileInputStream(inputpath);
			fos = new FileOutputStream(outputpath);
			
			//100바이트 단위로 읽음
			byte[] arr = new byte[100];
			
//			/읽은 길이 반환, 더 이상 읽을 데이터가 없으면 -1반환
			int result;
			while((result = fis.read(arr)) != -1) {
				System.out.println(Arrays.toString(arr));
				fos.write(arr, 0, result); //데이터, 시작위치, 쓸위치
			}
			System.out.println("파일 복사 성공!");

			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				fos.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
