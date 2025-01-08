package Quiz01;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int star = scan.nextInt();
		
		for(int i = 1 ; i <=star ; i++) {
			for(int j = 1 ; j <= star - i ; j++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
