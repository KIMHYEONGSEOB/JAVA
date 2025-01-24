package quiz20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 로또 번호 자동 생성기
		 * Set을 이용해서 6개의 랜덤한 로또 번호를 만들어내는 프로그램 코드를 작성해 보세요. 
		 * 
		 * 
		 */
		
		Random r = new Random();
		
		Set<Integer> lotto = new TreeSet<>();

		
			
		while(lotto.size()<6) {
			lotto.add(r.nextInt(45)+1);
		}

		Iterator<Integer> iter = lotto.iterator();
		
		while(iter.hasNext())
		System.out.print(iter.next()+ " ");

	}
}
