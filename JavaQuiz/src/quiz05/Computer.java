package quiz05;

public class Computer extends Calculator {

	//오버라이딩
	double circle(int p) {
		return Math.PI * p * p;
	}
	
	double rect(double d) {
		return d * d;
	}
	
	double rect(double w, double h) {
		return w * h;
	}
	
	double rect(double x, double y, double z) {
		return x * y * z;
	}
}
