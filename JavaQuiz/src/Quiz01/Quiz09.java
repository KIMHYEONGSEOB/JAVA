package Quiz01;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int a = 1;
		while(a <= 9) {
			System.out.println(n + " * " + a + " = " + n * a);
			a++;
		}
	}
}
