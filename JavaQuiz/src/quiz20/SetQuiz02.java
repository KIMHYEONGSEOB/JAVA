package quiz20;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetQuiz02 {

	public static void main(String[] args) {

		/*
		로또기기 당첨 시뮬레이터!

		{5, 23, 35, 7, 41, 13} 이 번호가 당첨 번호입니다.
		랜덤한 로또번호 6개를 생성해서, 당첨 번호와 일치하는지 확인합니다.
		몇 번의 시도 끝에 당첨되는지 계산하고, 소요된 비용을 출력하세요.
		로또 1회 구매 비용은 1,000원입니다.

		힌트)
		set이 요소가 동일한지 확인하는 메서드는 set.equals(set) 입니다
		 */
		Random r = new Random();
//		Set<Integer> l = new TreeSet<>();
		Integer list[] = {5,23,35,7,41,13};
		long count = 0;
		long b = 0;

		Set<Integer> l = new TreeSet<Integer>(Arrays.asList(list));


		while(true) {
			Set<Integer> lotto = new TreeSet<>();
			while(lotto.size()<6) {
				lotto.add(r.nextInt(45)+1);
			}
			count++;
			b += 1000;
			if(lotto.equals(l)) {
				System.out.println("당첨!");
				System.out.println(count+"회 로또를 구매하였고 " + b +"원이 들었습니다");
				break;
			}
		}

	}
}
