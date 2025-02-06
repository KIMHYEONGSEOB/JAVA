package multiclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Receive extends Thread{

	private Socket socket;
	
	public Receive(Socket socket) {
		this.socket = socket;
		
	}
	
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
			
			while(true) {
				String message = br.readLine();
				
				System.out.println(message);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
