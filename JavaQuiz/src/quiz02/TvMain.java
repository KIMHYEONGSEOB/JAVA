package quiz02;

import java.util.Scanner;

public class TvMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Tv tv = new Tv();
		tv.info();
		tv.changeChannel(12); 
		tv.power();
		System.out.println(tv.changeChannel(15)); 
		tv.info();
		tv.power();
	
	}
}
