package quiz01;
import java.util.Scanner;
public class Quiz04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키(double)와 나이(int)를 입력하세요");
		System.out.print("키>");
		double h = scan.nextDouble();
		System.out.print("나이>");
		int a = scan.nextInt();
		
		if(h >= 140 && a >= 8) {
			System.out.println("놀이기구 탑승이 가능합니다");
		}
		else {
			System.out.println("놀이기구 탑승이 불가능합니다");
		}
		
		scan.close();
	}
}
