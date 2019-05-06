import java.util.*;


public class SimpleGeometricObject {

  double sideLength;
  double radius;


  public SimpleGeometricObject(double sideLength){
    this.sideLength = sideLength;

  }

  public double getArea(){

    return sideLength * sideLength;
  }


}
class Rectangle extends SimpleGeometricObject{

  public Rectangle(double sideLength){
    super(sideLength);
  }

}
class Circle extends SimpleGeometricObject {

  public Circle(double radius){
    super(radius);
  }

  // override the parent getArea() function

  public double getArea(){
    double area = 3.14 * (sideLength * sideLength);

    return area;
  }
}

class Octagon extends SimpleGeometricObject {

  public Octagon(double sideLength){ // construct
    super(sideLength);
  }

  public double getArea(){ // override parent function
    double area = 2 * (1 + Math.sqrt(sideLength)) * (sideLength * sideLength);

    return area;
  }


}
