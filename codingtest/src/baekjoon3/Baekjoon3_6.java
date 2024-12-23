package baekjoon3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Baekjoon3_6 {
//Scanner를 사용할 시 속도가 느리므로 Bufferedreader를 사용함
//Bufferedreader를 사용할 경우 IOException을 사용 해야 한다.
	public static void main(String[] args) throws IOException{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer token;
		int a = Integer.parseInt(bf.readLine());
		
		for(int i=0 ; i<a ; i++) {
			token = new StringTokenizer(bf.readLine());
			int b = Integer.parseInt(token.nextToken());
			int c = Integer.parseInt(token.nextToken());
			bw.write((b+c)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
