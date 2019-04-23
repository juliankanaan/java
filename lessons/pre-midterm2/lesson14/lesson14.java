import java.util.*;

// more objects. writing clean code w encapsulation

// this is when you neatly wrap the data required (vars) & the methods into a
// neat little package
//>> variables are then only acccessed by the methods that need them

class StudentDirectory{

  /* First, delcare class vars as private (only usable by this class) */

  private String studentName;
  private int studentAge;
  

  /* then use setter & getter methods that can access the data; */

  public void setAge(int num){
    studentAge = num;
  }
  public int getAge(){
    return studentAge;
  }
  public void setName(String name){
    studentName = name;
  }
  public String getName(){
    return studentName;
  }

  /* Then have your method that does all this stuff */
  public static void main(String[] args){
    StudentDirectory student1 = new StudentDirectory(); // all null rn

    student1.setAge(12);
    student1.setName("Tom");

    int age = student1.getAge();
    String name = student1.getName();

    System.out.println("Student name is: "+name +" and age is "+age);
  }


}
