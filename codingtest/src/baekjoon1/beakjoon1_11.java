package baekjoon1;
import java.util.StringTokenizer;
//StringTokenizer: 문자열을 토큰으로 나누는 라이브러리
import java.util.Scanner;
import java.io.IOException;
public class beakjoon1_11 {

	public static void main(String[] args) {
		long i = 0;
		Scanner scanner = new Scanner(System.in);
		String b = (scanner.nextLine());
		
        StringTokenizer tokenizer = new StringTokenizer(b," ",false);
        //입력받은 문자열 b를 공백을 기준으로 토큰을 나눔
        while (tokenizer.hasMoreTokens()) {//더 남은 토큰이 있는지 확인한다.
            String token = tokenizer.nextToken(); //다음 토큰을 입력한다.
            i += Long.parseLong(token); //long 정수형으로 string을 형변환함
        }
        System.out.println(i);
	}
}