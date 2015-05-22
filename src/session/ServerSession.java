package session;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class ServerSession {

	private Map<String, String> configs;
	private Map<Integer, Session> sessionList;
	private int Port;
	
	public ServerSession(int port){
		this.Port = port;
		this.configs = new HashMap<String, String>();
		this.sessionList = new HashMap<Integer, Session>();
		
		try {
			init();
			run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void init() throws IOException {
		this.configs = Ini.load("config.ini");
	}
	
	public void run() {

		try {
			ServerSocket socket;
			socket = new ServerSocket(Port);	
			
			System.out.println("Session server is up and ready at 127.0.0.1:" + Port);
			
			while(true){
				Socket clientSocket = socket.accept();
				clientHandle(clientSocket);
				clientSocket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}
	
	public void clientHandle(Socket clientSocket){
		
	}
}
