package baekjoon2;

import java.util.Scanner;

public class Baekjoon2_1 {

    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int i = 1;
        while(i<=a){
            System.out.println(a+" * "+ i +" = " + (a*i));
            i++;
        }
        scan.close();
    }
}
