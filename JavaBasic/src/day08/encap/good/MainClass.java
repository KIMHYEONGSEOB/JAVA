package day08.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate md = new MyDate();
		md.setYear(2026);//유효성 검증에서 걸린다.
		md.setYear(2025);
		md.setMonth(13);
		md.setMonth(12);
		md.setDay(32);
		md.setDay(31);
		md.setSsn("98100311111111");
		md.setSsn(null);
		
		int year = md.getYear();
		System.out.println("년도: " + year);
		
		int month = md.getMonth();
		System.out.println("월: " + month);
		
		int day = md.getDay();
		System.out.println("일: " + day);
		
		String ssn = md.getSsn();
		System.out.println("주민번호:" + ssn);
		
	}
}