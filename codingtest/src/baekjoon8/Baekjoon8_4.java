package baekjoon8;

import java.util.Scanner;

public class Baekjoon8_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
 
        int sum =1;
        int result= 1;
        int n = scan.nextInt();
        for(int i = 0 ; i < n  ; i++){
            sum *=2;
            result = (sum+1)*(sum+1) ;
        }
        System.out.println(result);
   }
}
