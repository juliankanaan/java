import java.util.*;


class ClassRoster{
  private int studentID;
  private String studentName;
  private int studentAge;
  Address studentAddr; // initiating variable to be declared in another class

  ClassRoster(int id, String name, Address addr ){ // constructor
    this.studentID = id;
    this.studentName = name;
    this.studentAddr = addr;
  }




  /* done w/ "has a..." relationship */


  public static void main(String[] args){
    Address studentAddr1 = new Address(32, "Spring St", "NYC");
    ClassRoster student1 = new ClassRoster(122, "John Snow", studentAddr1);

    System.out.println("Student name is: "+student1.studentName +" and ltives in "+student1.studentAddr.streetName);
  }


}
  // creating a "has a.." relationship with a child class (Address):
class Address{
  String streetName;
  int houseNum;
  String city;

  Address(int house, String street, String cit){ // constructor
    this.streetName = street;
    this.houseNum = house;
    this.city = cit;
  }
}
