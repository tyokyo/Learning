package test;

public class Singleton {
	private Singleton singleton =null;
	public Singleton(){}
	public Singleton getInstance(){
		if (singleton==null) {
			synchronized (Singleton.class) {
				if (singleton==null) {
					singleton=new Singleton();
				}
			}
		}
		return singleton;
	}
}
