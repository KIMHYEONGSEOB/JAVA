package Quiz01;

import java.util.Scanner;

public class Quiz25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		scan.nextLine();
		for(int i = 0 ; i < t ; i++) {
			String s = scan.nextLine();
			System.out.println(s.charAt(0)+""+s.charAt(s.length()-1));
		}
	}
}
