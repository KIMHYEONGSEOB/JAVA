package ramda.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainClass02 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i <100 ; i++) {
			
			list.add(new Random().nextInt(100)+1);
		}
		System.out.println(list.toString());
		
		System.out.println("--------------------------------");
		
		//중복제거 distinct
		//정렬 sorted
		
		list.stream().distinct().sorted().forEach(a-> System.out.print(a+" "));
		
		System.out.println();
		
		//내림차순
		list.stream()
		.distinct()
		.sorted((o1,o2)-> Integer.compare(o2, o1))
		.forEach(aa-> System.out.print(aa+" "));
		
		System.out.println();
		System.out.println("-------------------------------------------");
		
		//걸러내기 filter - true인 값만 필터링
		list.stream().filter(a-> a % 2 == 0).forEach(b-> System.out.print(b+" "));;
		
		System.out.println("\n-------------------------------------------");
		
		//새로운 stream으로 반환 map
		//원본리스트의 값이 50보다 큰 값이면 true, 아니면 false
		
		list.stream().map(a-> a>50 ? true : false).forEach(a->System.out.print(a+""));
		
		System.out.println("\n-------------------------------------------");
		//스트림의 형변환 mapTo~~~~~
		
		list.stream().mapToDouble(a -> a).forEach(a->System.out.print(a+" "));
		
		System.out.println("\n-------------------------------------------");
		//최종 처리 집계함수 max, min, sum, count, average -> 정수형 스트림만 사용되는 경우가 있다.
		int max = list.stream().mapToInt(a->a).max().getAsInt();
		int min = list.stream().mapToInt(a->a).min().getAsInt();
		int count = (int)list.stream().mapToInt(a->a).count();
		double avg = list.stream().mapToInt(a->a).average().getAsDouble();
		int sum = list.stream().mapToInt(a->a).sum();
		
		System.out.println(max + " " + min + " " +count + " " + avg + " " +sum);
		
		System.out.println("\n-------------------------------------------");
		//최종처리 수집함수 collect - 컬렉션 타입으로 변환
		//50보다 큰 값들만 list로 다시 얻는다.
		
		//리스트로 변환
		List<Integer> newList = list.stream().filter(a->a>=50).collect(Collectors.toList());
		System.out.println(newList.toString());
		
		//맵으로 변환
		Map<Integer, Character> newMap = list.stream().distinct().filter(a-> a>50).collect(Collectors.toMap(a -> a, a-> (char)a.intValue())); 
		
		System.out.println(newMap.toString());
		
		System.out.println("\n-------------------------------------------");
		
		//리스트의 요소들 중에서 4글자 이상인 값을 전부 대문자로 바꾸고, 알파벳 순으로 정렬한 결과를 새로운 리스트로 반환
		List<String> names = Arrays.asList("hong","kim","park","choi","an");
		
		List<String> stringlist = names.stream()
				.filter(a-> 4 <= a.length())
				.map(a-> a.toUpperCase())
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(stringlist.toString());
	}
}
