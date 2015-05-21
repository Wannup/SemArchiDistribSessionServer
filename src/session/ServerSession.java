package session;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.HashMap;
import java.util.Map;

public class ServerSession {

	private Map<String, String> configs = new HashMap<String, String>();
	private int Port;
	
	public ServerSession(int port){
		try {
			init(port);
			run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void run() {

		try {
			ServerSocket socket;
			socket = new ServerSocket(Port);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	private void init(int port) throws IOException {

		this.Port = port;

		configs = Ini.load("config.ini");

		
	}
}
