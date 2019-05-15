import java.util.*;

// implement custom Comparable interface to sort students by GPA

public class Student implements Comparable<Student> {
  String fullName; double gpa;

  public Student(String fullName, double gpa){
    this.fullName = fullName;
    this.gpa = gpa;
  }
  // override compareTo();

  public int compareTo(Student student){ // pass our object into this

    // start sorting algo:

    if (gpa > student.gpa){
      return 1;
    } else if (gpa < student.gpa){
      return -1;
    } else {
      return 0; // equal
    }

  } // compareTo(); 

}
