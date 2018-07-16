package thread;

public class SyncMainTest {
	public static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 2; i++) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					for (int j = 0; j < 100; j++) {
						synchronized (SyncMainTest.class) {
							count++;
						}
					}
				}
			}).start();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(count);
	}
}
