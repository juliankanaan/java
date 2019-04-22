import java.util.*;

/*
data aggregation that shows a relationship btw two classes (ie. name & student info )

*/

class Name {
  private String firstName; private String lastName;

}
class Address {
  private String city; private String streetName; private String houseNum;

  public Address(String streetName, String houseNum, String city){
    this.streetName = streetName;
    this.houseNum = houseNum;
    this.city = city;
  }
}
class StudentInfo {
  private Name name; // has-a relationship here w/ name class
  private Address address; // relationship w/ address class

  private int studentID;

  StudentInfo(Name name, String studentID, Address address){ // usage of inherited class in constructor
    this.studentID = studentID;
    this.address = address;
    this.name = name;
  }

  public static void main(String[] args) {
    Address address1 = new Address("Main St", "123", "Houston");

    StudentInfo student1 = new StudentInfo("Julian", 1235442, address1); // parent relationship w/ constructor
  }

}
