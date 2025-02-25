package baekjoon12;

import java.util.Scanner;

public class Baekjoon6_5 {
    public static void main(String[] args) {

        int i = 0;
        int sum =0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(true){
            i++;
           if(Integer.toString(i).contains("666")){
               sum++;
           };
           if(sum == n){
               break;
           }
        }
        System.out.println(i);
    }
}
