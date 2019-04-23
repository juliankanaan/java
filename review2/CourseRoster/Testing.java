import java.util.*;


public class Testing {
  public static void main(String[] args) {

    String[] names = {"John", "Sarah", "marshall", "Jim", "Tom"};

    Course course1 = new Course("CS101");

    for (int i=0; i < names.length; i++){

      Student currentStudent = new Student( names[i] ); // create student object

      course1.addStudent(currentStudent); // add this object to the Course Roster array


    }
    course1.printStudents();
  }
}
