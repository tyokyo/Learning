package singleton;

public class Singleton6 {  
	private static Singleton6 instance = null;  
	private Singleton6() {  
	}  
	private static synchronized void syncInit() {  
		if (instance == null) {  
			instance = new Singleton6();  
		}  
	}  
	public static Singleton6 getInstance() {  
		if (instance == null) {  
			syncInit();  
		}  
		return instance;  
	}  
} 
