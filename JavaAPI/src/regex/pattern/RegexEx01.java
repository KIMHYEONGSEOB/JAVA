package regex.pattern;

public class RegexEx01 {

	public static void main(String[] args) {
		
		String info = "홍길자|30|서울시 강남구|010-1234-5678";
		
		//전화번호 형식만 찾아서 **** 암호처리
		String pattern = "[0-9]{3}-[0-9]{3,4}-[0-9]{4}";
		
		//매개변수에 regex라고 쓰여 있으면, 정규표현식이 들어갈 수 있다는 뜻
		String result = info.replaceFirst(pattern, "***-****-****");
		System.out.println(result);
	}
}
