import java.util.*;
public class PersonTest {
  public static void main(String[] args) throws HeightException {

    try {
      Person man = new Person(8.0);
    } catch (HeightException e){
      System.out.print(e); // from toString() property

    }



  }
}
