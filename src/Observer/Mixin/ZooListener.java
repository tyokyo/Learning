package Observer.Mixin;

import Observer.Animal;

public interface ZooListener {
  public void onAnimalAdded (Animal animal);
  public void onAnimalRemoved (Animal animal);
}