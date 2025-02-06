package baekjoon6;

import java.util.Scanner;

public class Baekjoon6_8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		float sum = 0;
		float index=0;
		for(int i = 0 ; i < 20 ; i++) {

			String sub = scan.next();
			float sc = scan.nextFloat();
			String gr = scan.next();

			if((sub.length()>=1 && sub.length()<=50))
			switch (gr) {
			case "A+":
				sum += sc*4.5;
				index += sc;
				break;
			case "A0":
				sum += sc*4.0;	
				index += sc;
				break;
			case "B+":
				sum += sc*3.5;
				index += sc;
				break;
			case "B0":
				sum += sc*3.0;
				index += sc;
				break;
			case "C+":
				sum += sc*2.5;
				index += sc;
				break;
			case "C0":
				sum += sc*2.0;
				index += sc;
				break;
			case "D+":
				sum += sc*1.5;
				index += sc;
				break;
			case "D0":
				sum += sc*1.0;
				index += sc;
				break;
			case "F":
				sum += sc*0.0;
				index += sc;
				break;
			default:
				
				break;
			}
		}
		if(index == 0) {
			System.out.println(0.000000);
		}else {
			System.out.printf("%.6f",(sum/index));
		}

	}
}
