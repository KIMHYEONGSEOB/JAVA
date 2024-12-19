package baekjoon1;

import java.util.Scanner;

public class backjoon1_10 {

	public static void main(String[] args) {
		int a, b, c3, d4, e5;
		
		Scanner scanner = new Scanner(System.in);
		
		a = Integer.parseInt(scanner.nextLine());
		b = Integer.parseInt(scanner.nextLine());
		
		e5 = a * (b/100);
		d4 = a * ((b-((b/100)*100))/10);
		c3 = a * ((b -((b/10)*10))/1);
		System.out.println(c3);
		System.out.println(d4);
		System.out.println(e5);
		
		System.out.println(a*b);
		
		scanner.close();
	}
}
