import java.util.*;


public class Shape {
  String name; String color;

  // set a static variable (ie. not tied to a specific object)
  static String shapeType; // going to be set equal to "polygon in a static main method"
  final String finalVar = "hi"; // should not editable 


  public Shape(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public String getName(){
    return name;
  }
  public String getColor(){
    return color;
  }

}
