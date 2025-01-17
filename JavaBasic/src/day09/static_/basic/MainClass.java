package day09.static_.basic;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		//static멤버의 사용
		System.out.println("원주율:" + Calculator.pi);
		System.out.println(Calculator.circle(3));
		
		Math.random();
	}
}
