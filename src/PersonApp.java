public class PersonApp {
  public static void main(String[] args) {

    var person1 = new Person();
    person1.name = "Vincent";
    person1.address = "Pontianak";

    Person person2 = new Person("Windah");
    person2.name = "bambang";
    person2.address = "kakok";
    person2.sayHello("atok");

    Person person3;
    person3 = new Person("Rucci", "Cirebon");

    System.out.println(person1.name);
    System.out.println(person1.address);
    System.out.println(person1.country);
    System.out.println(person2.address);
    System.out.println(person3.address);
    person3.sayHello("jojo");
  }
}
