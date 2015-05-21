package session;
import java.util.HashMap;
import java.util.Map;


public class Session implements ISession {

	// key = idSession
	private Map<String, Map<String, Object>> sessions;
	
	
	public Session(int id){
		
		this.sessions = new HashMap<String, Map<String, Object>>();
	}
	
	@Override
	public void setAttribute(String key, Object o) {
		
		
	}

	@Override
	public Object getAttribute(String key) {
		return sessions.get(key);
	}

	@Override
	public void invalidate() {
		// TODO Auto-generated method stub
		
	}

}
