package vincent.data;

public class Avanza implements Car {

  @Override
  public void drive() {
    System.out.println("Avanza Drive");

  }

  @Override
  public int getTire() {
    return 4;
  }
}
