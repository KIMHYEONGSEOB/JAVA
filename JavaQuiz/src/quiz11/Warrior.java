package quiz11;

public class Warrior extends Player{
	//전사

	//1. 생성자 - 이름 전달받아서, hp = 1000, mp = 500으로 초기화
	
	public Warrior(String name) {
		this.name = name;
		hp = 1000;
		mp = 500;
	}
	
	//2. 으깨기기술 - 매개변수로 Player를 받는다.
	//스킬을 사용하면 나의 MP가 100이 소모된다.
	//마나가 없으면 스킬 사용 불가
	//타격당한 상대방은 HP가 100이 소모가 된다.
	public void breaker(Player player) {
		if(mp<100) {
			System.out.println(this.name + "가 으깨기를 발동했지만 마나부족!");
			System.out.println("---------------------------------");
		}
		else {
			mp -= 100;
			System.out.println(this.name + "가 으깨기 발동!\n" + player.name +"가"+ 100 +"만큼 피해입음!");
			player.hp -= 100;
			if(player.hp <= 0) {
				System.out.println(player.name + " 사망!");
				player = null;
			}
			System.out.println("---------------------------------");
			
		}
		
	}
}
