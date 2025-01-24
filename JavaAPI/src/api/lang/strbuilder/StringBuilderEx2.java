package api.lang.strbuilder;

public class StringBuilderEx2 {

	public static void main(String[] args) {
		
		//스트링과 스트링 빌더의 시간차이
		
		long start = System.currentTimeMillis();
		
		//문자열 더하기 30만번
		String str = "";
		for(int i = 1; i <= 300000; i++) {
			str += "A";
		}
		long end = System.currentTimeMillis();
		
		System.out.println("수행시간:" + (end - start) * 0.001);
		
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 30000; i++) {
			sb.append("A");
		}
		end = System.currentTimeMillis();
		
		System.out.println("수행시간:" + (end - start) * 0.001);
	}
}
