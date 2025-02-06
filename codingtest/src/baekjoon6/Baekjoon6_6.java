package baekjoon6;

import java.util.Scanner;

public class Baekjoon6_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();

		String [] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="} ;

		for(int i = 0 ; i < arr.length ; i++) {
			
			str = str.replace(arr[i], "?");
		}
		System.out.println(str.length());
	}
}
