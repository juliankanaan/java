import java.util.*;

/*

*/


class PhoneBookEntry {
  int Id;
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


}

class PhoneBook{
  int Id;
  String firstName; String lastName; String email;
  String zipCode;
  String phoneNumber;

  public PhoneBook(){

  }
  public static String ask(int howMany){
    int[] newArray = new int[howMany]; // create array of desired slots
    Scanner input = new Scanner(System.in);
    System.out.println("Enter "+ howMany + " numbers");

    for (int i =0; i < howMany; i++){

      newArray[i] = input.nextInt();
    }

    return newArray;
  }


}

public static void main(String []args){

  PhoneBookEntry person1 = new PhoneBookEntry("Lizzy", "803-222-1222");
  PhoneBookEntry person2 = new PhoneBook(5); // ID of 5, other data fields to be assigned via user input



  /* Set some stuff */
  //person1.setZip("90210");
  //person1.setEmail("lizzy@me.com");

  person1.printBookEntry(); // system.out all info we know about the person

}
