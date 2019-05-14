import java.util.*;

/*
Abstract classes are classes that do not create its own object
  Child classes are left to create them / implement its methods
  NOTE: Child classes must implement ALL abstract parent classes, even if not used

- abstract methods have signature, no body
- cannot be instantiated with "new"
  but can be used as data type ie. GeometricObjects[] objects = new GeometricObjects[2];


*/


public class GeometricObject {
  String color;

  public GeometricObject(){} //

  public GeometricObject(String color){
    this.color = color;
  }

  public String getColor(){ // not abstract
    return color;
  }

  public abstract double getArea(); // NOTE: this is an abstract method

  public abstract double getPerimeter(); // another abstract method

}
public class Circle extends GeometricObject{
  double radius;

  public Circle(){

  }
  public Circle(double radius){
    this.radius = radius;
  }
  public double getPerimeter(){ // NOTE: overriding parent abstract
    return 3.14;
  }
  public double getArea(){
    return 3.00;
  }

}
