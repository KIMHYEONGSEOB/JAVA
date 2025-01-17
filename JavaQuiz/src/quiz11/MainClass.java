package quiz11;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("전사");
		Sorceress s1 = new Sorceress("법사");
		Warrior w2 = new Warrior("형섭이(전사)");
		Sorceress s2 = new Sorceress("길동이(법사)");
		w1.info();
		s1.info();
		w2.info();
		s2.info();
	
		w1.breaker(s1);
		w1.breaker(s1);

		s1.info();
		Player p[] = {w1,w2,s2};
		s1.blizzard(p);
		
		w2.info();
		s1.info();
		
	}
}
