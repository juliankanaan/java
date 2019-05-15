import java.util.*;
public class Person {
  double feetTall;

  public Person(double feetTall) throws HeightException {
    if (feetTall > 7.5) {
      throw new HeightException("Too tall");
    } else {
      this.feetTall = feetTall;
    }
  }


}
class HeightException extends Exception {

  String message;

  public HeightException(String message) {
    super(message);
    this.message = message;
  }

  public String toString(){
    return "You messed up";
  }

}
