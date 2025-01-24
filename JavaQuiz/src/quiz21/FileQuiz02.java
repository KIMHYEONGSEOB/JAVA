package quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz02 {

	public static void main(String[] args) {

		/*
		 * 1. 날짜 클래스를 이용해서 file경로에 20250124.txt 이름으로 파일을 쓴다.
		 * 2. 내용은 "그만" 을 입력할 때 까지 작성해 주면 된다.
		 * 3. 파일을 썼다면, BufferedReader를 이용해서 파일의 내용을 읽어들인다.
		 */
		Scanner scan = new Scanner(System.in);


		String path = "C:\\Users\\김형섭\\Desktop\\course\\java\\File\\"+new SimpleDateFormat("yyyyMMdd").format(new Date())+".txt";
		BufferedWriter bw = null;
		BufferedReader br = null;
		try {
			bw = new BufferedWriter(new FileWriter(path));
			br = new BufferedReader(new FileReader(path));

			while(true) {
				System.out.print(">");
				String str = scan.nextLine();

				if(str.equals("그만")) {
					break;
				}
				str += "\r\n";
				bw.write(str);
				bw.flush();
			}
			System.out.println(br.readLine());

			String st;
			while ((st = br.readLine()) != null) {
				System.out.println(st);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				br.close();
			} catch (Exception e2) {
			}
		}
	}
}

