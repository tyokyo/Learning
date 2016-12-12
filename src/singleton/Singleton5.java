package singleton;

public class Singleton5    
{    
	private static  Singleton5 singleton = null;    

	private Singleton5()    { }    
	public static Singleton5 getInstance()    
	{    
		if (singleton== null)    
		{    
			synchronized (Singleton5.class)    
			{    
				if (singleton== null)    
				{    
					singleton= new Singleton5();    
				}    
			}    
		}    
		return singleton;    
	}    
} 