package watch;
public class PrintNameAnimalAddedListener implements AnimalAddedListener {
	public void updateAnimalAdded (Animal animal) {
		// Print the name of the newly added animal
		System.out.println("Added a new animal with name '" + animal.getName() + "'");
	}

	@Override
	public void onAnimalAdded(Animal animal) {
		// TODO Auto-generated method stub
		
	}
}