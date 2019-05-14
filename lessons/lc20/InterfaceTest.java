import java.util.*;

/*
Interfaces
  Only contain abstract methods. No constructor. They just describe functions.
  Data fields are static & final (ie. are not connected to object type [bc no object lol], and cannot be changed)


  Often describes behavior for subclass objects
*/
public Interface AnimalBehavior {

  // no constructor for Interfaces

  public abstract void speak(); // describe what child objects can do

}


class Dog implements AnimalBehavior{

  public void speak(){
    System.out.println("Bark!");
  }

} // usage: dog1.speak();

class Cat implements AnimalBehavior {
  public void speak(){
    System.out.println("Meow!");
  }
} //cat1.speak();
