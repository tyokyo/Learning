package watch;
public class Main3 {
	public static void main (String[] args) {
		// Create the zoo to store animals
		Zoo zoo = new Zoo();
		// Register listeners to be notified when an animal is added
		zoo.registerAnimalAddedListener(new AnimalAddedListener() {
			@Override
			public void updateAnimalAdded (Animal animal) {
				// Print the name of the newly added animal
				System.out.println("Added a new animal with name '" + animal.getName() + "'");
			}

			@Override
			public void onAnimalAdded(Animal animal) {
				// TODO Auto-generated method stub
				
			}
		});
		// Add an animal notify the registered listeners
		zoo.addAnimal(new Animal("Tiger"));
	}
}