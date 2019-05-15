import java.util.*;

/*
default, public, private modifiers.

final, static, regular datatypes

*/

public class Employee {
  int id; // default; can be seen by package & subclasses
  String fullName;
  // static datatypes not tied to Employee objects. Can be accessed just by calling them outright.
  final static String managerName; // can be declared once, then never changed again
  final static String ceoName = "Jim"; // cannot be altered ever again now.


  public Employee(int id, String fullName){
    this.id = id;
    this.fullName = fullName;
  }

  private static void privateMethod(){ // only visible to THIS class
    System.out.print("This method cannot be accessed nor overriden by subclasses");

  }
  public static void publicMethod(){ // visible to all packages
    System.out.println("publicMethod() was called ");

  }
  static void defaultMethod(){ // visible to this package only
    System.out.println("Called defaultMethod()");

  }
}
