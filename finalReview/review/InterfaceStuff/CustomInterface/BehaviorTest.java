import java.util.*;

public class BehaviorTest {
  public static void main(String[] args) {

    Human hu = new Human();
    hu.speak();
    Dog dog = new Dog();
    dog.speak();
    System.out.println(hu.movementType());

  }
}
