package day10.inter.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Animal baduk = new Dog();
		
		Animal shampoo = new Cat();
		
		Animal hodol = new Tiger();
		
		Animal[] arr = {baduk, shampoo, hodol};
		
		for(Animal a : arr) {
			a.eat(); //animal처럼 동작됨
		}
		
		//펫 타입
		
		IPet [] arr2 = new IPet[3];
		arr2[0] = (IPet)baduk; //바둑이는 animal 타입이지만, IPet을 구현하고 있어서 상호 형변환이 가능함
		arr2[1] = (IPet)shampoo;
		arr2[2] = new GoldFish();
		
		for(IPet a:arr2) {
			a.play(); //펫처럼 사용됨
		}
		
		PetHouse.carePet(arr2[0]);
		PetHouse.carePet(new GoldFish());
	}
}
