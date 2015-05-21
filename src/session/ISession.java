package session;

public interface ISession {

	void setAttribute(String key, Object o);
	Object getAttribute(String key);
	void invalidate();
}
