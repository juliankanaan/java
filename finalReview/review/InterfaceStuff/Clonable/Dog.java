import java.util.*;
public class Dog implements Cloneable {
  String name;

  public Dog(String name) {
    this.name = name;
  }

  public Object clone(){
    try {
      return super.clone();
    } catch (CloneNotSupportedException e){
      return null; // no object
    }
  }
}
