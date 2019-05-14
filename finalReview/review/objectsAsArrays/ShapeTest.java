import java.util.*;
public class ShapeTest {

  public static void main(String[] args) {

    //Shape[] shapes = {new Shape("rectangle", "red"), new Shape("circle", "orange"), new Shape("square", "blue")};

    // w/ ArrayList of objects
    ArrayList<Shape> shapes = new ArrayList<Shape>();
    shapes.add(new Shape("rectangle", "red"));
    shapes.add(new Shape("circle", "blue"));
    shapes.add(new Shape("square", "green"));

    String shapeType = "polygon"; // this random fuckin variable can be set (w/o being tied to a specific
                                  // object), because it's a static variable declared in class

    // printObjects(shapes);
    printArrayListObjects(shapes);

    System.out.println(shapeType);




  }
  public static void printObjects(Shape[] arr){

    for (int i=0; i < arr.length; i++ ) {
      System.out.println( arr[i].getName() + " " + arr[i].getColor() );



    }

  }
  public static void printArrayListObjects(ArrayList<Shape> arr){

    for (Shape shape : arr) {
      System.out.println( shape.color + " " + shape.name );

      // testing final String variable
      // shape.finalVar = "changed"; // throws error. cannot re-assign variable

      System.out.println(shape.finalVar); // outputs hi successfully
    }

  }


}
