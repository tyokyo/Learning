package Observer.Mixin;

import Observer.Animal;

public class NamePrinterZooAdapter extends ZooAdapter {
	@Override
	public void onAnimalAdded (Animal animal) {
		// Print the name of the animal that was added
		System.out.println("Added animal named " +animal.getName());
	}
}