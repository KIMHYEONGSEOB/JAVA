package quiz11;

public class Sorceress extends Player {
	//마법사
	
	//1. 생성자 - 이름을 전달받아서, hp = 500, mp = 1000으로 초기화
	
	public Sorceress(String name) {
		this.name = name;
		hp = 500;
		mp = 1000;
	}
	
	//2. 블리자드스킬 - 광역공격기
	//블리자드 스킬은 마나 200을 소모
	//배열안에 들어 있는 모든 객체에 5~15사이의 랜덤한 피해를 한번 발생을 시킨다.
	//타격당한 플레이어는 체력을 소모해 주면 된다.
	//타격당한 플레이어의 이름을 출력하세요.
	public void blizzard(Player[] players) {
		
		if(mp<200) {
			System.out.println("마나부족!");
			System.out.println("---------------------------------");
		}
		else {
			mp-=200;
			System.out.println(this.name+"가 블리자드 발동!");
//			for(int i = 0 ; i < players.length; i++) {
//				int attack = (int)(Math.random()*11)+5;
//				players[i].hp-= attack;
//				System.out.println(players[i].name + "를 " + attack + "만큼 공격!");
//				if(players[i].hp <= 0) {
//					System.out.println(players[i].name + " 사망!");
//					players[i] = null;
//				}
//			}	
			
			//왜 작동하지?
			for(Player p : players) {
				
				int ran = (int)(Math.random()*11) + 5;
				p.hp -= ran; //상대방 hp - 데미지
				
				System.out.println(p.name + "님이" + ran + "피해를 입었습니다.");
				System.out.println(p);
			}
			System.out.println("---------------------------------");

		}	


	}
}
