package baekjoon_source;

import java.util.Scanner;

public class Baekjoon_10101 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a,b,c;
		a= scan.nextInt();
		b= scan.nextInt();
		c= scan.nextInt();
		
		if(a==b && b==c && a+b+c==180) {
			System.out.println("Equilateral");
		}else if(a+b+c== 180) {
			if(a==b||b==c||c==a) {
				System.out.println("Isosceles");
			}
			if(a!=b&&b!=c&&c!=a) {
				System.out.println("Scalene");
			}
		}
	}
}
