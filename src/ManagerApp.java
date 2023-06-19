public class ManagerApp {
  public static void main(String[] args) {

    var manager = new Manager("bambang");
    // manager.name = "Vincent";
    manager.sayHello("Budi");

    var vp = new VicePresident("lala");
    // vp.name = "Joko";
    vp.sayHello("Widodo");

    System.out.println(manager);
    System.out.println(vp);
  }
}
