package api.io.folder;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		
		/*
		 * 폴더 생성할 때는 file클래스를 사용한다.
		 * 생성자 매개변수로 폴더를 생성할 경로 + 폴더명
		 * 
		 */
		
		String path = "C:\\Users\\김형섭\\Desktop\\course\\java\\File\\myfolder";
		
		try {
			File file = new File(path);
			
			if(!file.exists()) {//파일이 존재하면 true
				//makedirectory mkdirs() , mkdirs()
				file.mkdir(); //폴더 생성
			}else {
				System.out.println("존재합니다.");
				file.delete(); //폴더 삭제(파일 삭제)
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

		
		
		
	}
}
