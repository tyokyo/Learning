package Observer;
public   class PrintNameAnimalAddedListener implements AnimalAddedListener {
	public void updateAnimalAdded (Animal animal) {
		// Print the name of the newly added animal
		System.out.println("updateAnimalAdded - Added a new animal with name '" + animal.getName() + "'");
	}
}