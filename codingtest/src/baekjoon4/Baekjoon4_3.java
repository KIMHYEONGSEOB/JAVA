package baekjoon4;

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
public class Baekjoon4_3 {

	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(bf.readLine());
		StringTokenizer tk = new StringTokenizer(bf.readLine());
		int b[] = new int[a];
		for(int i = 0 ; i<a; i++) {
//			b[i] = sc.nextInt();
			b[i] = Integer.parseInt(tk.nextToken());
		}
		int max = b[0], min = b[0];
		
			for(int j = 0; j<a;j++) {
				if(max<b[j])
					max=b[j];
				else if(min>b[j])
					min=b[j];		
		}
//			System.out.print(min+" "+max);
			bw.write(min+" "+max);
			bw.flush();
			bw.close();
	}
}
