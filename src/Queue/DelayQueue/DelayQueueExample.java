package Queue.DelayQueue;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueExample {  
	  
    public static void main(String[] args) throws InterruptedException {  
        DelayQueue queue = new DelayQueue();  
  
        Delayed element1 = new Delayed() {
			
			@Override
			public int compareTo(Delayed arg0) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public long getDelay(TimeUnit unit) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
  
        queue.put(element1);  
  
        Delayed element2 = queue.take();  
    }  
}  
