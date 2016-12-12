package Observer.Mixin;


import java.util.ArrayList;
import java.util.List;

import Observer.Animal;

public class ZooUsingMixin extends ObservableSubjectMixin<ZooListener> {
	private List<Animal> animals = new ArrayList<>();
	public void addAnimal (Animal animal) {
		// Add the animal to the list of animals
		this.animals.add(animal);
		// Notify the list of registered listeners
		this.notifyListeners((listener) -> listener.onAnimalAdded(animal));
	}
	public void removeAnimal (Animal animal) {
		// Remove the animal from the list of animals
		this.animals.remove(animal);
		// Notify the list of registered listeners
		this.notifyListeners((listener) -> listener.onAnimalRemoved(animal));
	}
}