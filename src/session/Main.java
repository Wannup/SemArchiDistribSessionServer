package session;

public class Main {

	public static void main(String[] args) {
		new Thread(){
			public void run(){
				ServerSession server = new ServerSession(8080);
				server.run();
			}
		}.start();

	}

}
