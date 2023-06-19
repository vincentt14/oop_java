public class ManagerApp {
  public static void main(String[] args) {

    var manager = new Manager();
    manager.name = "Vincent";
    manager.sayHello("Budi");

    var vp = new VicePresident();
    vp.name = "Joko";
    vp.sayHello("Widodo");
  }
}
