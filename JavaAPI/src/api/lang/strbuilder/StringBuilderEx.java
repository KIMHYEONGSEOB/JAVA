package api.lang.strbuilder;

public class StringBuilderEx {

	public static void main(String[] args) {
		
		//빠른 문자열
		String str = new String("java");
		StringBuilder sb = new StringBuilder("java");
		
		System.out.println(str);
		System.out.println(sb);
		
		//차이점
		str = str + " programming"; //완전 새로운 문자열을 만들어서 저장
		
		sb.append(" programming"); //하나의 객체를 계속 재사용한다.
		//2항연산자와 다른점이 무엇인가?
		
		System.out.println(str);
		System.out.println(sb);
		
		//문자열 중간의 추가 insert
		sb.insert(5, "book ");
		System.out.println(sb);
		
		//문자열의 변경 replace
		sb.replace(5, 9, "책");
		System.out.println(sb);
		
		//문자열 삭제 delete
		sb.delete(5, 7);
		System.out.println(sb);
		
		//빠른 문자열을 -> 문자열로 변환
		String result = sb.toString();
		System.out.println("문자열: " + result);
		
		//거꾸로 뒤집기
		System.out.println(sb.reverse());
	}
}
