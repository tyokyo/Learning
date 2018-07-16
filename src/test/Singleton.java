package test;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

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
