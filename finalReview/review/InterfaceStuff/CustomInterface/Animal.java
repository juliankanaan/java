import java.util.*;
public abstract class Animal implements Behaviors {

  public Animal(){

  }

  // NOTE: you *have* to invoke these interface methods, even just chaining them along
  public abstract void speak(); // all abstract

  public abstract String movementType();
}
class Dog extends Animal implements Behaviors {
  public Dog(){
    // no arg who cares
  }

  public void speak(){
    System.out.println("Dog says bark");

  }
  public String movementType(){
    return "walks on four legs";
  }
}
class Human extends Animal implements Behaviors {

  public Human(){
    // no args
  }


  public void speak(){
    System.out.println("Human says words");

  }
  public String movementType(){
    return "walks on two legs";
  }
}
