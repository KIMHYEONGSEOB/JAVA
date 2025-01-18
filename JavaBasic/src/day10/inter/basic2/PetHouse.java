package day10.inter.basic2;

public class PetHouse {


	//매개변수로 펫 타입을 받아서, 해당 매개변수에 따라서, 알 맞은 형변환을 진행하는 메서드를 만들어라!
	public static void carePet(IPet pet) {

		if(pet instanceof Cat) {
			Cat c = (Cat)pet;
			c.eat();
			c.play();
		}  
		else if(pet instanceof GoldFish) {
			GoldFish g = (GoldFish)pet;
			g.swim();
			g.play();
		}
		else if(pet instanceof Dog) {
			Dog d = (Dog)pet;
			d.eat();
			d.play();
		}
		else {
			return;
		}

	}

}
