package collection.map;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		//사용방법은 HashMap이랑 같음
		//키를 -> 정렬시켜서 저장함
		
		HashMap<Integer, String> map = new HashMap<>();

		map.put(2, "a");
		map.put(3, "b");
		map.put(5, "c");
		map.put(1, "d");
		map.put(4, "e");
		
		
		System.out.println(map.toString());
		System.out.println(map.keySet());
	}
}
