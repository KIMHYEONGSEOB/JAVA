package ramda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainClass01 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("홍길동", "이순신", "홍길자", "신사임당");
		
		for(String l : list) {
			System.out.println(l); //프로그램 코드 처리
		}
		
		System.out.println("===================================");
		//람다스트림을 알고 있다면
		
//		Stream<String> stream = list.stream();
//		
//		stream.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		});
		
		//람다로 변형
		list.stream().forEach(t-> System.out.println(t));
	}
}
