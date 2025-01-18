package day11.exception.trycatch;

public class RunTimeExample {

	public static void main(String[] args) {
		
		//실행예외
//		int[] arr = {1, 2, 3};
//		System.out.println(arr[3]);
		
//		String s = "10!@#!@#!";
//		int r = Integer.parseInt(s);
		
		//NullPointerException
		String str = null;
		str.charAt(0);
		
		System.out.println("실행돼?");
	}
}
