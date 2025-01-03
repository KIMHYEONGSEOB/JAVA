package baekjoon4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon4_4 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int arr[] =new int[9];
		int max = arr[0];
		int result=0;
		
		for(int i = 0; i<9; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
			if(i==0) {
				max = arr[i];
			}
			if(max<arr[i]) {
				max=arr[i];
				result = i;
			}
		}	
		
		bw.write(max+"\n");
		bw.write((++result)+"\n");

		bw.flush();
		bw.close();
	}
			
}


