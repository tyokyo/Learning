package Observer.Mixin;

import Observer.Animal;

public class ZooAdapter implements ZooListener {
  @Override
  public void onAnimalAdded (Animal animal) {}
  @Override
  public void onAnimalRemoved (Animal animal) {}
}