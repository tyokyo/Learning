package Queue.BlockingDeque;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingDequeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BlockingDeque<String> deque = new LinkedBlockingDeque<String>();  
		  
		deque.addFirst("1");  
		deque.add("3");
		deque.addLast("2");  
		  
		String two = deque.takeLast();  
		System.out.println(two);
		String one = deque.takeFirst();
		System.out.println(one);
	}

}
