package Queue.blockQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{  
	  
    protected BlockingQueue queue = null;  
  
    public Consumer(BlockingQueue queue) {  
        this.queue = queue;  
    }  
  
    public void run() {  
        try {  
            System.out.println("take-"+queue.take());  
            System.out.println("take-"+queue.take());  
            System.out.println("take-"+queue.take());  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
    }  
}  