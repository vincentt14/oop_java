package vincent.application;

import vincent.data.Category;

public class CategoryApp {
  public static void main(String[] args) {

    var category = new Category();
    category.setId("Hellow");

    System.out.println(category.getId());
    System.out.println(category.isExpensive());
  }
}
