
import java.util.*;

public class Course {
  String courseName;
  Student[] students = new Student[5];
  int numOfStudents = 0; // zero by default



  public Course(String courseName){
    this.courseName = courseName;
  }
  public String getCourseName(){
    return courseName;
  }
  public void addStudent(Student student){

    if (students.length > numOfStudents){ // if there's room
      System.out.println("Adding "+student.name);
      students[numOfStudents] = student;
      numOfStudents++;

    }

  }
  public void printStudents(){

    for (int i=0; i < students.length; i++){
      System.out.println("Student "+ i + ": "+ students[i].name);
    }
  }
}
class Student {
  String name;

  public Student(String name){
    this.name = name;
  }
  public String getStudentName(){
    return name;
  }

}
