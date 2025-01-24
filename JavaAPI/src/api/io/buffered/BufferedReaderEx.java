package api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {
	public static void main(String[] args) {

		/*
		 * 2바이트 기반의 성능향상 보조스트림
		 * 
		 * readLine() - 한줄씩 통째로 읽어서 가져온다.
		 */

		String path = "C:\\Users\\김형섭\\Desktop\\course\\java\\File\\test02.txt";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(path));

			System.out.println(br.readLine());//더 이상 읽을 데이터가 없으면 null

			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();	
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
