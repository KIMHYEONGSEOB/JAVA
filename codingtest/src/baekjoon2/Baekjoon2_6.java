package baekjoon2;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Baekjoon2_6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String s  = (scanner.nextLine());
        int c = Integer.parseInt((scanner.nextLine())); 
        StringTokenizer tokenizer = new StringTokenizer(s);    
        int a = Integer.parseInt(tokenizer.nextToken());
        int b = Integer.parseInt(tokenizer.nextToken());

        b += c;
        
        if(b>60) {
        	a += b/60;
        	b = b%60;
        }
        
        if(a>23) {
        	a= a%24;
        }
        
//        //23시까지의 정수,
//        //59분까지의 정수,
//        //23시 59분에서 1분이 지나면 0시 0분
//        if(b+c<60){1
//        	b += c;
//        }
//        //분과 분이 60이 넘어가면 시간을 하나 올려줌
//        else if(++a<24){
//        	a +=((b+c)/60);
//        	b = ((b+c)%60);	
//        }
//        else {
//        	a= -1;
//        	a +=((b+c)/60);
//        	b = ((b+c)%60);	
//        }
        System.out.println(a+" "+b);
	}
}
