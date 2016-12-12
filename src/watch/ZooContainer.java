package watch;
public class ZooContainer implements AnimalAddedListener {
	private Zoo zoo = new Zoo();
	public ZooContainer () {
		// Register this object as a listener
		this.zoo.registerAnimalAddedListener(this);
	}
	public Zoo getZoo () {
		return this.zoo;
	}
	@Override
	public void updateAnimalAdded (Animal animal) {
		System.out.println("Added animal with name '" + animal.getName() + "'");
	}
	public static void main (String[] args) {
		// Create the zoo container
		ZooContainer zooContainer = new ZooContainer();
		// Add an animal notify the innerally notified listener
		zooContainer.getZoo().addAnimal(new Animal("Tiger"));
	}
	@Override
	public void onAnimalAdded(Animal animal) {
		// TODO Auto-generated method stub

	}
}