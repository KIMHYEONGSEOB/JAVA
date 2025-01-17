package quiz04;

 class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 1번 과제
		 
		Arrays.toString()와 똑같은 기능 구현하기
		1. toArray() - int[]을 매개변수로 입력받아 배열의 모형을 문자열로 리턴하는 메서드
		2. toArray() - 1번과 내용은 같고, char[]을 받도록 overloading
		2. toArray() - 1번과 내용은 같고, String[]을 받도록 overloading
		*/
//	ToArray arr = new ToArray();
	
	int inarr[] = {1,2,3,4,5};
	char ich[] = {'김','형','섭'};
	String st[] = {"김형섭", "김현수", "안종수"};

		System.out.println(ToArray.toArray(inarr));
		System.out.println(ToArray.toArray(ich));
		System.out.println(ToArray.toArray(st));
	}
		

}
