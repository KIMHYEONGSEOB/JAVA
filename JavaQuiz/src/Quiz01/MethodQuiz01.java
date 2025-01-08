package Quiz01;

import java.util.Arrays;

public class MethodQuiz01 {

	public static void main(String[] args) {
		
		method1();
		
		String m2 =method2("안녕");
		System.out.println(m2);
		
		double m3 = method3(10, 20, 30.3);
		System.out.println(m3);
		
		String m4 = method4(9);
		System.out.println(m4);
		
		method5("안녕?!", 5);
		
		int mn = maxNum(5, 4);
		System.out.println(mn);
		
		int abs = abs(-12);
		System.out.println(abs);
		
		char[] carr = {'a', 'b', 'c'};
		String m6 = method6(carr);
		System.out.println(m6);
		
		int[] iarr = {1, 3, 6, 10};
		int m7 = method7(iarr);
		System.out.println(m7);
		
		String[] sarr = method8("안녕","똥개!");
		System.out.println(Arrays.toString(sarr));
		
	}
	
	static void method1() {
		System.out.println("안녕");
	}
	
	static String method2(String s) {
		return s;
	}
	
	static double method3(int a, int b, double c) {
		return a+b+c;
	}
	
	static String method4(int a) {
		if(a%2==0) {
			return "짝수";
		}
		else {
			return "홀수";
		}
	}
	
	static void method5(String s, int a) {
		for(int i = 0 ; i < a ; i++) {
			System.out.print(s);
		}
		System.out.println();
	}
	
	static int maxNum(int a, int b) {
		return a>=b ? a: b;
	}
	
	static int abs(int a) {
		return a<0? -a : a;
	}
	
	static String method6(char[] a) {
		String s= new String(a);
		return s;
	}

	static int method7(int a[]) {
		int sum = 0;
		for(int i =0 ; i < a.length ; i++ ) {
			sum += a[i];
		}
		return sum ;
	}
	
	static String[] method8(String a, String b) {
		String s[] = new String[2];
		 s[0] = a;
		 s[1] = b;
		return s;
	}
}
