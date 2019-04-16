import java.util.*;

/*

*/

package exercise2;
public class PhoneBook{



  int id;
  String firstName; String lastName; String email;
  String zipCode;
  String phoneNumber;

  public PhoneBook(int userID){
    id = userID;
    firstName = ask("First Name");
    lastName  = ask("Last Name");
    zipCode   = ask("Zip Code");
    phoneNumber = ask("Phone Number");
    email     = ask("email");

  }
  public String ask(String prompt){ // collect various data depending on what we need

    Scanner input = new Scanner(System.in);
    System.out.println("Enter "+ prompt + ", please"); // ie. "Enter last name, please"

    String enteredData = input.next();

    return enteredData;
  }
  public void printBookEntry(){

    System.out.print("\nDETAILS:"+
    "\n Name: " + firstName + " " + lastName +
    "\n Phone Number: " + phoneNumber +
    "\n Email: " + email +
    "\n Zip Code: " + zipCode +
    "\n"
    );
  }
  public void setZip(String zip){
    zipCode = zip;
  }
  public static void main(String []args){

    /* PART A: PhoneBookEntry */

    PhoneBookEntry person1 = new PhoneBookEntry("John", "20323334444");
    PhoneBookEntry person3 = new PhoneBookEntry("Sarah", "null"); // person 3 in instructions doesnt have # yet


    /* PART B: Reading in user input for new entry:  */

    System.out.println("\nOBJECT 2: Reading in user input for new entry:");

    PhoneBook person2 = new PhoneBook(5); // ID of 5, other data fields to be assigned via user input

    /* Set some stuff */
    person1.setZip("20037");
    person1.setLastName("Smith");
    person1.setEmail("jsmith@gmail.com");


    /* Print Details of each person */
    person1.printBookEntry();

    person2.printBookEntry();

    person3.printBookEntry();

    /* PART B: Change details */
    person1.setPhone("20205555555");
    person2.setZip("20037");

  }

}

class PhoneBookEntry {
  int id;
  String firstName; String lastName; String email;
  String zipCode;
  String phoneNumber;

  public PhoneBookEntry(String first, String phone){ // constructor

    firstName = first;
    phoneNumber = phone;

  }
  public void printBookEntry(){

    System.out.print("DETAILS:"+
    "\n Name: " + firstName + " " + lastName +
    "\n Phone Number: " + phoneNumber +
    "\n Email: " + email +
    "\n Zip Code: " + zipCode +
    "\n"
    );
  }
  public void setZip(String zip){
    zipCode = zip;
  }
  public void setLastName(String name){
    lastName = name;
  }
  public void setEmail(String newEmail){
    email = newEmail;
  }
  public void setPhone(String newPhone){
    phoneNumber = newPhone;
  }

}
