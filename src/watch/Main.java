package watch;
public class Main {
	public static void main (String[] args) {
		// Create the zoo to store animals
		Zoo zoo = new Zoo();
		// Register a listener to be notified when an animal is added
		zoo.registerAnimalAddedListener(new PrintNameAnimalAddedListener());
		// Add an animal notify the registered listeners
		zoo.addAnimal(new Animal("Tiger"));
	}
}