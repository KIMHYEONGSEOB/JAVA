package day05;

import java.util.Arrays;

public class StringMainpulation {

	public static void main(String[] args) {
		
		//문자열 다루기
//		char[] arr = {'a', 'b', 'c'};
//		String str = new String(arr);
//		
//		System.out.println(str);
		
		String str = "abc";
		
		//문자열을 다룰 수 있는 여러가지 함수를 제공해준다.
		//str 에 . 찍어서 사용함
		
		//문자열 한 글자 자르기
		System.out.println(str.charAt(0));
		
		char c = str.charAt(0);
		System.out.println(c);
		
		//문자열 길이 확인
		int len = str.length();
		System.out.println("문자열의 길이:" + len);
		
		//문자열 위치 찾기 indexOf(찾을 문자열)
		str = "안녕하세요? 문자열은 문자의 합 입니다";
		int a = str.indexOf("문자의 합");
		System.out.println(a);
		
		int b = str.indexOf("sdfsdfsdfs");//찾을 문자가 없으면 -1 반환
		System.out.println(b);
		
		//문자열 변경하기 - replace(타겟문자열, 바꿀 문자열)
		String result = str.replace("문자", "word");
		System.out.println(result); //1. 발견되는 모든 문자열을 바꿈
		System.out.println(str); //2. 원본 문자는 바뀌지 않음
		
		//원본 문자 바꾸기!
//		str = str.replace("문자","word");
		
		//모든 공백 제거
		str = str.replace(" ", "안?");
		System.out.println(str);
		
		System.out.println("----------------------------------");
		//대소문자 변경
		str = "Hello World~!";
		
		String r2 = str.toUpperCase();
		String r3 = str.toLowerCase();
		
		System.out.println(r2);
		System.out.println(r3);
		
		//앞 뒤 공백 제거 trim()
		str = "   010-2239-6708    ";
		System.out.println("|"+str+"|");
		String r4 = str.trim();
		System.out.println("|"+r4+"|");
		
		//문자열 자르기
		//substring
		//split
		//toCharArray
		str = "010-2239-6708";
		
		String r5 = str.substring(3); //3번 인덱스 미만 절삭
		System.out.println(r5);
		
//		4<= str <8
		String r6 = str.substring(4, 8); //4이상, 8미만 추출
		System.out.println(r6);
		
		String[] arr = str.split("-");
		System.out.println(Arrays.toString(arr));
		
		char[] arr2 = str.toCharArray(); //한 글자씩 잘라서, char[] 반환
		System.out.println(Arrays.toString(arr2));
		
		//특정문자로 연결하기 합치기 String.join(구분자, 배열 or 문자열 나열)
		String r7 = String.join("", "링딩동", "링딩동", "링딩동", "링딩동");
		System.out.println(r7);
		
//		"서울 > 대구 > 대전 > 부산 > 찍고";
		String[] arr3 = {"서울", "대전", "대구", "부산", "찍고"};
		System.out.println(String.join(" > ", arr3));
		String sum = "";
		for(int i = 0 ; i < arr3.length; i++) {
			sum += arr3[i];
			if(i == arr3.length - 1)
			sum += " > ";
		}
		System.out.println(sum);
	}
}
