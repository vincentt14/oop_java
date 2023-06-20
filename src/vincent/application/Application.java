package vincent.application;

import vincent.data.*;

public class Application {
  public static void main(String[] args) {

    Product product = new Product("Samsung Galaxy", 2_000_000);
    System.out.println(product.name);
    System.out.println(product.price);

    Data data = new Data();
  }
}
