package vincent.data;

public class Bus implements Car {

  @Override
  public void drive() {
    System.out.println("bus drive");
  }

  @Override
  public int getTire() {
    return 8;
  }

  @Override
  public String getBrand() {
    return "Hyundai";
  }

  @Override
  public boolean isMaintenance() {
    return true;
  }

  @Override
  public boolean isBig() {
    return Car.super.isBig();
  }
}
