package singleton;

public class Singleton4
{    
	private static  Singleton4 singleton = null;    

	private Singleton4()    
	{    
	}    
	public static Singleton4 getInstance()    
	{    
		synchronized (Singleton4.class)    
		{    
			if (singleton== null)    
			{    
				singleton= new Singleton4();    
			}    
		}    
		return singleton;    
	}    
}
