package baekjoon4;

import java.util.Scanner;

public class Baekjoon4_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int[] i = new int[a];
		
		for(int k = 0 ; k < b; k++) {
			
			int	bu = scan.nextInt();
			int bu2 = scan.nextInt();
			int ba = scan.nextInt();
			while(bu<=bu2) {
				i[bu-1]= ba;
				bu++;
			}
		}
		for(int k = 0 ; k <a ; k++) {
			
			System.out.print(i[k]+" ");

			
		}
		scan.close();
	}
}
