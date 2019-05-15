import java.util.*;


public abstract class Fruit {

  String name;

  public Fruit() {
    // no args my mans
  }

  public abstract String getName(); // no nothin

}
class Apple extends Fruit {

  public Apple(String name) {
    super(); // not needed
    this.name = name;
  }

  public String getName(){
    return name;
  }

}
