class VicePresident extends Manager {

  VicePresident(String name) {
    super(name, null);
  }

  void sayHello(String name) {
    System.out.println("Hi " + name + ", my name is VP " + this.name);
  }
}
