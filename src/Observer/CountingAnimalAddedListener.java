package Observer;
public class CountingAnimalAddedListener implements AnimalAddedListener {
	private static int animalsAddedCount = 0;

	public synchronized void updateAnimalAdded (Animal animal) {
	    // Increment the number of animals
	    animalsAddedCount++;
	    // Print the number of animals
	    System.out.println("Total animals added: " + animalsAddedCount);
	  }
}