import java.util.*;


public class GeometricObjects {

  // create ArrayList
  static ArrayList<SimpleGeometricObject> shapes = new ArrayList<SimpleGeometricObject>();
  static double sum =0;


  // create new objects
  static Octagon octa = new Octagon(2.0); //sideLength
  static Circle circ = new Circle(5.0); // accepts radius
  static Rectangle rect = new Rectangle(5.0); // length & width

  public static void main(String[] args) {


    // add them to ArrayList
    shapes.add(rect);
    shapes.add(octa);
    shapes.add(circ);

    // pass thru sumArea function

    //shapes.forEach((shape) -> System.out.println(shape.getArea()));

    System.out.println( sumArea() ); // pass thru

  }

  public static double sumArea(){


    shapes.forEach((shape) -> sum += shape.getArea());

    return sum;

  }


}
