package baekjoon8;

import java.util.Scanner;

public class Baekjoon8_5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();

		int a = 0;
		int b = 1;
		
		boolean bool = true;
		for(int i = 0 ; i <x ; i++) {
			if(bool) {
				a++;
				b--;
			}
			if(!bool) {
				a--;
				b++;
			}
			if(a==0) {
				a++;
				bool = !bool;
			}
			if(b==0) {
				b++;
				bool = !bool;
			}
		}
		System.out.println(a+"/"+b);
		
		
		
		
//		int a = 1;
//		int b = 2;
//
//		int index = 2;
//
//		if(x==1) {
//			System.out.println("1/1");
//			return;
//		}else if(x==2) {
//			System.out.println(a+"/"+b);
//		}
//
//		while(true) {
//			if(a<b) {
//				while(true){
//					a++;
//					b--;
//					index++;
//
//					if(index == x) {
//						if(b==0) {
//							System.out.println(a+"/"+ ++b);
//						}else {
//							System.out.println(a+"/"+b);
//						}
//
//						return;
//					}
//					if(b==0) {
//						++b;
//						break;
//					}
//				}
//			}
//			else {
//				while(true){
//					a--;
//					b++;
//					index++;
//
//					if(index == x) {
//						if(a==0) {
//							System.out.println(++a+"/"+b);	
//						}else {
//							System.out.println(a+"/"+b);
//						}
//						return;
//					}
//					if(a==0) {
//						++a;
//						break;
//					}
//				}
//			}
//		}
		
		
		
	}
}