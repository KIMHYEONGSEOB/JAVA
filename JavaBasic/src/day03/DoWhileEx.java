package day03;

public class DoWhileEx {

	public static void main(String[] args) {
		
		//dowhile - 조건이 false여도 무조건 1번은 실행됨, 2회실행 부터는 while문과 동일함
		
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i<=10);
		
	}
}
