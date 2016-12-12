package Observer;
public class Main3 {
	public static void main (String[] args) {
		// Create the zoo to store animals
		Zoo zoo = new Zoo();
		// Register listeners to be notified when an animal is added
		zoo.registerAnimalAddedListener(new AnimalAddedListener() {
			@Override
			public void updateAnimalAdded (Animal animal) {
				// Print the name of the newly added animal
				System.out.println("updateAnimalAdded-"+"Added a new animal with name '" + animal.getName() + "'");
			}
		});
		// Add an animal notify the registered listeners
		zoo.addAnimal(new Animal("Tiger"));
	}
}