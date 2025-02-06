package multiclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainClient {

	public static void main(String[] args) {
		
		/*
		 * 채팅
		 * 클라이언트와 서버간의 대화(연결)
		 * 서버(컴퓨터)는 클라이언트의 채팅글을 전달하고,
		 * 여러 클라이언트를 서로 연결 할 수 있게 합니다.
		 */
		
		//클라이언트
		//포트번호 - 프로그램 식별 번호
//		Socket clientSocket = new Socket("아이피번호", 포트번호);
		try {
			Socket clientSocket = new Socket("172.30.1.12", 8181);
		
//			InputStream is = clientSocket.getInputStream();
//			
//			BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
//			
//			String str = br.readLine();
//			System.out.println(str);
			
			//메시지를 받는 클래스
			Receive receive = new Receive(clientSocket);
			
			//데이터를 보내는 클래스
			Sender sender = new Sender(clientSocket);
		
			receive.start(); //쓰레드 스타트
			sender.start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
			System.out.println("호스트 주소 잘못됨");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("종료");
		}
	}
}
