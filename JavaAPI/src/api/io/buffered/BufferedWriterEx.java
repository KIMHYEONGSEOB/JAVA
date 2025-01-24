package api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx {
	
	public static void main(String[] args) {
		
		/*
		 * 2바이트 기반에 성능향상 보조 스트림 BuffereWriter
		 */
		Scanner scan = new Scanner(System.in);
		
		
		String path = "C:\\Users\\김형섭\\Desktop\\course\\java\\File\\test02.txt";
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(path,true));//true를 주면 기존 파일이 있을 경우, 내용을 이어서 작성함
			
			while(true) {
				System.out.print(">");
				String str = scan.nextLine();

				
				if(str.equals("exit")) {
					break;
				}
				str += "\r\n"; //줄바꿈	
				bw.write(str);

			}
			bw.flush();

			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			}catch (Exception e) {
			}
		}

		
	}
}
