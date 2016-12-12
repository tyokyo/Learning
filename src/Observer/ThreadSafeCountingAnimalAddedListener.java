package Observer;

import java.util.concurrent.atomic.AtomicLong;

public class ThreadSafeCountingAnimalAddedListener implements AnimalAddedListener {
	private static AtomicLong animalsAddedCount = new AtomicLong(0);

	@Override
	public void updateAnimalAdded(Animal animal) {
		// TODO Auto-generated method stub
		animalsAddedCount.incrementAndGet();
		//Print the number of animals
		System.out.println("Total animals added: " + animalsAddedCount);
	}

}