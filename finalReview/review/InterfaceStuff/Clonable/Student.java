
public class Student implements Cloneable {
  String fullName; double gpa;

  public Student(String fullName, double gpa){
    this.fullName = fullName;
    this.gpa = gpa;
  }
  // overide clone method

  public Object clone(){
    try {
      return super.clone(); // same stuff.
    } catch (CloneNotSupportedException e){
      return null; 

    }
  } // clone()
}
