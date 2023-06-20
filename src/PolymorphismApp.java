public class PolymorphismApp {
  public static void main(String[] args) {

    Employee employee = new Employee("Vincent");
    employee.sayHello("Budi");

    employee = new Manager("Vincent", null);
    employee.sayHello("Bambang");

    employee = new VicePresident("Vincent");
    employee.sayHello("Popo");

    sayHello(new Employee("Abang"));
    sayHello(new Manager("Adek"));
    sayHello(new VicePresident("Kakak"));
  }

  static void sayHello(Employee employee) {
    if (employee instanceof VicePresident) {
      VicePresident vicePresident = (VicePresident) employee;
      System.out.println("Hello VP " + vicePresident.name);
    } else if (employee instanceof Manager) {
      Manager manager = (Manager) employee;
      System.out.println("Hello Manager " + manager.name);
    } else {
      System.out.println("Hello Employee " + employee.name);
    }
  }
}
