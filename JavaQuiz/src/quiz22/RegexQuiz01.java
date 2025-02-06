package quiz22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 가격 형식만 찾아서 순서대로 출력해 보세요.
		 * 4,500원
		 * 1,200원
		 * 6000원
		 */
		
		String str = "헐4,500원 일수도 있고~ 1,200원 일수도 있지. 하지만 가격은 6000원 일 수도 있어";
		
//		String pattern1 = "\\d{0,3},\\d{1,4}원|\\d+원";
		String pattern1 = "\\d+,?\\d+원";
		
		Pattern p = Pattern.compile(pattern1);
		Matcher m = p.matcher(str);
		
		while(m.find()) {
			System.out.println(m.group());
		}
	}
}
