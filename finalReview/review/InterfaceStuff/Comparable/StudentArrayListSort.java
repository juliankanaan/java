import java.util.*;
public class StudentArrayListSort {
  public static void main(String[] args) {
    // create empty ArrayList to hold our Student objects
    ArrayList<Student> students = new ArrayList<Student>();

    // add to it

    students.add( new Student("Julian", 3.2) );
    students.add( new Student("Madi", 4.0) );
    students.add( new Student("Mike", 1.9) );

    // sort that shit

    Collections.sort(students); // now ArrayList is sorted

    for (Student student : students) {
      System.out.println(student.fullName + " " + student.gpa);

    }
    // iterate over sorted list now

    


  }
}
