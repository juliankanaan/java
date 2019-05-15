
import java.util.*;


public class StudentTest {

  public static void main(String[] args) {
    Student student1 = new Student("Julian", 3.2);

    // clone this boi

    Student copy = (Student)(student1.clone());

    System.out.println(copy.fullName + " " + copy.gpa);


  }
}
