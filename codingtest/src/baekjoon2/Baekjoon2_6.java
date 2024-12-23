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
        //b와 c를 더해줌
        b += c;
        
        //b가 60 이상일 경우
        if(b>=60) {
        	a += b/60;//a에 b를 60으로 나눈 몫을 대입
        	b = b%60; //b에는 나머지를대입
        }
        //a가 24 이상이면
        if(a>=24) { 
        	a= a%24; //a에 24를 나눈 나머지를 저장
        }
        
        System.out.println(a+" "+b);
	}
}
