
import java.util.*;
public class DogTest {
  public static void main(String[] args) {
    Dog dog = new Dog("Rex");

    // clone this boi

    Dog dog2 = (Dog)(dog.clone()); 

    System.out.println(dog2.name);

  }
}
