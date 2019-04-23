import java.util.*;

/*

creating subtype varibles of larger parent classes (supertype) (ie. tiger of animal)

*/
public class Polymorphism {


  public static void main(String[] args) {



  }
  public static void displayShapeFacts(CreateShape obj){

  }

  class ShapeAttributes {
    String color;
    int pixelSize;

    public ShapeAttributes(String color, int pixelSize){
      this.color = color;
      this.pixelSize = pixelSize;

    }
  }
  class CreateShape{
    String type;
    ShapeAttributes attr;

    public CreateShape(String type, ShapeAttributes attr){
     this.type = type;
     this.attr =  attr;

    }
    public String getType(){
      return type;
    }
    
  }


}
