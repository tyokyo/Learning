package singleton;

public class Singleton {

	public Singleton() {
		// TODO Auto-generated constructor stub
	}
	public static Singleton instance = null;
	public static Singleton getInstance(){
		if (instance==null) {
			synchronized (Singleton.class) {
				if (instance==null) {
					instance=new Singleton();
				}
				instance = new Singleton();
			}
		}
		return instance;
	}
}
