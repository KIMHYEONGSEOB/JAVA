package quiz04;

public class ToArray {

	/*
	 * 1.ToArray는 접근제어자를 통해서, 외부에서 객체로 생성할 수 없도록 만들어 주세요.
	 * 2.메서드에는 public static을 붙여서 메인에서 호출 해주세요.
	 */
	private ToArray(){}
	
	public static String toArray(int[] a) {
		String str= "";
		for(int i =0 ; i < a.length ; i++) {
			if(i!=a.length-1) {
			 str += a[i]+",";
			}
			else {
			 str += a[i];
			}
		}
	return "["+str+"]";
	}

	public static String toArray(char[] ch) {
		String str = "";
		for(int i = 0 ; i< ch.length ; i++) {
			if(i!=ch.length-1) {
				 str += ch[i]+"','";
				}
				else {
				 str += ch[i];
				}
		}
		return "['"+str+"']";
	}

	public static String toArray(String[] st) {
		String str = "";
		for(int i = 0 ; i< st.length ; i++) {
			if(i!=st.length-1) {
				 str += st[i]+"\",\"";
				}
				else {
				 str += st[i];
				}
		}
		return "[\""+str+"\"]";	
	}
}
