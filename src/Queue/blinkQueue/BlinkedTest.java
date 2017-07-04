package Queue.blinkQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlinkedTest {
	public static void main(String args[]) throws InterruptedException{
		BlockingQueue<String> unbounded = new LinkedBlockingQueue<String>();  
		BlockingQueue<String> bounded   = new LinkedBlockingQueue<String>(1024);  
		  
		bounded.put("Value1");  
		bounded.put("Value2");  
		System.out.println( bounded.take());
		System.out.println( bounded.take());
	}
}
