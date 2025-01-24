package quiz21;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class FileQuiz01 {

	/*
	 * 1. 스캐너를 이용해서 파일명을 입력 받는다.
	 * 2. file폴더 하위에 입력받은 파일명으로 파일을 쓴다.
	 * 3. 파일을 쓸 때, "쓰고 싶은 말"을 사용자에게 입력 받습니다.
	 * 4. 
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("파일 이름을 입력해주세요.(확장자포함)");
		String path = "C:\\Users\\김형섭\\Desktop\\course\\java\\File\\"+scan.nextLine();
		Writer fw = null;

		try {
			fw = new FileWriter(path);
			System.out.println("---하고싶은 말을 입력하세요---");
			while(true) {
				String str = scan.nextLine();
				if(str.equals("쓰고 싶은 말")) {
					fw.write(str); 
					System.out.println("입력 되었습니다.");
					break;
				}
				System.out.println("다시 입력하세요");
			}



		}catch (Exception e){
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
			}
		}
	}



}
