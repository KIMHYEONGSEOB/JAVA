package api.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateEx {

	public static void main(String[] args) {
		
		/*
		 * LocalDate 클래스 - 년 월 일 정보
		 * LocalTime 클래스 - 시 분 초 정보
		 * LocalDateTime 클래스 - 년 월 일 시 분 초
		 */
		
		LocalDate now = LocalDate.now(); //지금 날짜
		System.out.println(now);
		
		LocalDate ofDate = LocalDate.of(2022, 2, 12); //년 월 일
		System.out.println(ofDate);
		
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		
		//localdatetime -> 문자형 포맷 짝꿍
		DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분 ss초 E요일");
		
		String result2 = time.format(dtf);
		System.out.println(result2);
		
		
	}
}
