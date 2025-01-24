package quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileQuiz03 {

	public static void main(String[] args) {

		/*
		 * youjin choi가 입사한 회사에서는 매일 오전 7시에 연계사에서 
		 * 날짜유형의 csv파일을 전송을 해줍니다.
		 * 
		 * ex) 2025_01_24_data.csv 유형의 파일입니다
		 *
		 * 그래서 youjin choi는 *매일 아침*마다 csv파일을 읽어서 데이터베이스에 저장하는
		 * 프로그램 코드를 만들어야 합니다.
		 *
		 * 데이터베이스에 저장하려면, List<Data>클래스로 값을 저장해야 합니다.
		 * Data클래스는 getter, setter를 가지는 은닉 클래스입니다.
		 * 
		 * 1. buffered를 사용해서 날짜_data.csv파일을 읽어서 한줄 한줄씩 출력해주세요. 
		 * 2. 읽은 데이터를 ,기준으로 분리해서 데이터를 리스트에 잘 정리해서 저장해 주세요.
		 */

		List<Data> read = new ArrayList<>();

		Date date = new Date();


		String sdf = new SimpleDateFormat("yyyy"+"_"+"MM"+"_"+"dd"+"").format(new Date());

		String path = "C:\\Users\\김형섭\\Desktop\\course\\java\\workspace\\JavaQuiz\\src\\quiz21\\"+sdf+"_data.csv";
		BufferedWriter bw =null;
		BufferedReader br = null;

		try {
			br = new BufferedReader (new FileReader(path));


			System.out.println(br.readLine());

			String str;

			while((str = br.readLine()) != null) {
				System.out.println(str);
				String [] arr = str.split(",");
				read.add(new Data(arr[0],Integer.parseInt(arr[1]),arr[2],arr[3]));
			}
			
			for(Data a :read) {
				System.out.print ("이름: "+ a.getName()+" ");
				System.out.print ("나이: " + a.getAge()+" ");
				System.out.print ("이메일: " + a.getEmail()+" ");
				System.out.println ("주소: " + a.getAdr()+" ");
			}


		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				br.close();
			} catch (Exception e) {
			}
		}


	}
}
