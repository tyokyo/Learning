package Queue.arrayQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayQueueTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BlockingQueue queue = new ArrayBlockingQueue(1024);  
		queue.put("1");  
		Object object = queue.take();  
		System.out.println(object.toString());



		BlockingQueue<String> queue2 = new ArrayBlockingQueue<String>(1024);  
		queue2.put("3");  
		queue2.put("4");  
		queue2.put("5");  
		System.out.println("take-"+ queue2.take());
		System.out.println("take-"+ queue2.take());
		System.out.println("take-"+ queue2.take());
	}

}
