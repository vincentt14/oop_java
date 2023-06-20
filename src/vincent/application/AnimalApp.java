package vincent.application;

import vincent.data.Animal;
import vincent.data.Cat;

public class AnimalApp {
  public static void main(String[] args) {

    Animal animal = new Cat();
    animal.name = "Puss";

    animal.run();
  }
}
