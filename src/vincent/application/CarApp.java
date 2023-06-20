package vincent.application;

import vincent.data.Avanza;
import vincent.data.Car;

public class CarApp {
  public static void main(String[] args) {

    Car car = new Avanza();
    car.drive();
    System.out.println(car.getTire());
  }
}
