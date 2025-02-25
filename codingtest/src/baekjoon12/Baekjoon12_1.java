package baekjoon12;

import java.util.*;

public class Baekjoon_12_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int max = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i<n ;i++){
            list.add(scanner.nextInt());
        }

        for(int i = 0; i < n; i++){
            for(int j = 0 ; j <n ; j++){
                for(int k = 0; k < n ; k++){
                    if(i != j && j != k && k != i){
                    if(list.get(i) + list.get(j) + list.get(k) <= m){
                        if(list.get(i) + list.get(j) + list.get(k) > max){
                                max = list.get(i) + list.get(j) + list.get(k);
                            }

                        }
                    }

                }
            }
        }
        System.out.println(max);

    }
}
