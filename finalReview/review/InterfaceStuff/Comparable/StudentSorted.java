import java.util.*;


public class StudentSorted {

  public static void main(String[] args) {

    // create new simple array of students
    Student[] students = {
      new Student("Julian", 3.2),
      new Student("Madi", 4.0),
      new Student("Mike", 1.9)
    };

    // sort them with our override function

    Arrays.sort(students);

    // now show em

    for (Student student : students) {
      System.out.println(student.fullName + " " + student.gpa); // mike, JK, mads
    }

  }

}
