package baekjoon7;

import java.util.Scanner;

public class Baekjoon7_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int arr[][] = new int[100][100];
		int answer = 0;
		Print2D P2 = new Print2D();

		int a = scan.nextInt();
		
		for(int i = 0 ; i < a ; i++) {
			int w  = scan.nextInt();
			int h = scan.nextInt();
			
			for(int j = 0 ; j< 10 ; j ++) {
				for(int k = 0 ; k<10 ; k++) {
					arr[j+w][k+h] = 1;
				}
			}
			P2.print2DArray(arr);
		}
		
		for(int i = 0 ; i < 100 ; i++) {
			for(int j = 0 ; j < 100 ; j++) {
				if(arr[i][j]==1) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}
