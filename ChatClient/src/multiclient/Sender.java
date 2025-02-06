package multiclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class Sender extends Thread {

	
	private Socket socket;
	
	public Sender(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {

		//사용자에게 입력받아서, 서버로 output함
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
			//서버로 전송할 output
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			while(true) {
		
					String message = br.readLine(); //입력
					
					if(message.equals("exit")) {
						br.close();
						out.close();
						socket.close();
						break; //종료
						
					}
					
					out.println(message); //소켓에 메시지 전송
					out.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
