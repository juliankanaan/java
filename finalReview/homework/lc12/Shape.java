
import java.util.*;
/*
classes are used to create objects, their characteristics (data fields),
behaviors (thru methods), and how they are initialzed (thru constructors)

*/


public class Shape {
  String name; // define data fields
  String color;

  public Shape(String name, String color) { // construct it
    this.name = name;
    this.color = color;
  }
  public double getArea(){
    return 0.0;
  }

}
class Rectangle extends Shape {

  double width; double length;



  public Rectangle(double length, double width) {
    super("Rectangle", "red");
    this.length = length;
    this.width = width;
  }
  public double getArea() {
    return length * width;
  }
}
