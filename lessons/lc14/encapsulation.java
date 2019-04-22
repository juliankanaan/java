import java.util.*;

/* Meant to group relevant variables only with their necessary methids,
and to keep that data private to their methids

Do:
- class variables declared as private.
- public set / get methods to access variables and values

*/

class StudentGrade {
  private String studentName;
  private String studentID;
  private int studentGpa;

  public void setName(String name){
    studentName = name;
  }
  public void setGpa(int gpa){
    studentGpa = gpa;
  }
  public void setId(int id){
    studentID = id;
  }
  public int getID(){
    return studentID;
  }
  public String getName(){
    return studentName;
  }
  public getGpa(){
    return studentGpa;
  }
  public statuc void main(String[] args){
    StudentGrade student1 = new StudentGrade();
    student1.setName("Julian");
    student1.setGpa(90);
    student1.setId(122);

    System.out.println("Student "+ student1.getName() + ", id of " + student1.getID() + " has GPA of "+ student1.getGpa());
  }

}
