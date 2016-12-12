package watch;
public class CountingAnimalAddedListener implements AnimalAddedListener {
	private static int animalsAddedCount = 0;
	@Override
	public synchronized void updateAnimalAdded (Animal animal) {
	    // Increment the number of animals
	    animalsAddedCount++;
	    // Print the number of animals
	    System.out.println("Total animals added: " + animalsAddedCount);
	  }
	@Override
	public void onAnimalAdded(Animal animal) {
		// TODO Auto-generated method stub
		
	}
}