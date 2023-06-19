class Person {
  String name;
  String address;
  final String country = "Indonesia";

  Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  Person(String paramName) {
    this(paramName, null);
  }

  Person() {
    this(null);
  }

  void sayHello(String userName) {
    System.out.println("Hello " + userName + " , My name is " + name);
  }
}
