package baekjoon6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Baekjoon6_5 {

	public static void main(String[] args) {


		Map<Character, Integer> map = new TreeMap<>();
		
		Scanner scan = new Scanner(System.in);
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in);
		char[] ch = scan.next().toUpperCase().toCharArray();
		
		//맵 입력
		for(int i = 0 ; i < ch.length ; i++) {
			if(map.containsKey(ch[i])) {
				map.put(ch[i] ,(map.get(ch[i]))+1);
			}else {
				map.put(ch[i], 1);
			}
		}
		
		//대소 비교
//		char max=ch[0];
//		for(int i = 0 ; i <map.size() ; i++) {
//			for(int j = 0; j <map.size() ; j++) {
//				if(map.get(ch[i])>map.get(ch[j])){
//					max = ch[i];
//				}
//			}
//		}
//
//		for( : map) {
//			
//		}
		
		
//		
//		//같은값 비교
//		for(int i = 0 ; i <ch.length ; i++) {
//				if(map.get(ch[i]) == map.get(max) && ch[i] != max) {
//					System.out.println("?");
//					return;
//			}
//		}
		
//		System.out.println(map.toString());
//		System.out.println(max);
		
		
//		Scanner scan = new Scanner(System.in);
//
//		char[] arr = scan.next().toUpperCase().toCharArray();
//		char[] arr2 = new char[26];
//		int[] arr3 = new int[26];
//		char answer = 'A';
//		int index = 0;
//		for(char i = 'A' ; i <= 'Z' ; i++) {
//			arr2[index] = i;
//			index++;
//		}
//		re : for(int i = 0 ; i < arr.length ; i++) {
//			for(int j = 0 ; j < arr2.length ; j++) {
//				if(arr[i] == arr2[j]) {
//					arr3[j] +=1;
//					continue re;
//				}
//			}
//		}
//		int max = 0;
//		for(int i = 0; i <26 ; i++) {
//			if(max<arr3[i]) {
//				max = arr3[i];
//				answer = (char)(i+65);
//			}
//			else if(max == arr3[i]) {
//				answer = '?';
//			}
//		}
//		System.out.println(answer);
	}
}
