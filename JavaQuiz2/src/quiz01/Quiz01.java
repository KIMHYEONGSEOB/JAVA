package quiz01;

public class Quiz01 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		
		System.out.println(y += 10 - x++); //13
		System.out.println(x+=2); //5
		System.out.println( !('A' <= c && c <='Z') ); //false
		System.out.println('C'-c); //2 int보다 작을 경우 결과는 int로 변환됨
		System.out.println(c+1);// 66 
		System.out.println(++c); //B 단항 연산자는 변환되지 않음
		System.out.println(c++); //B 대입후 증가되는 후위 연산자
		System.out.println(c); //C

	}
}
