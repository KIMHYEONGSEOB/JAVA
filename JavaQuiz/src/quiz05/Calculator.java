package quiz05;

public class Calculator {

	int result ;
	double pi = 3.14;
	
	int add(int a){
		result += a;
		return result;
	}
	
	int sub(int s){
		result -= s;
		return result;
	}
	double circle(int p){
		return pi*p*p;
	}
}
