package quiz01;

import java.util.Scanner;

public class MethodQuiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(java(5));
	}
	
	static String java(int a) {
		
//		char []c = new char[a] ;
		String str ="";
		for(int i = 0 ; i < a ; i++) {
			if(i%2 == 1) {
				str += "바";
			}
			else {
				str += "자";
			}
		}
//		String str = new String(c);
		return str;
	}
}
